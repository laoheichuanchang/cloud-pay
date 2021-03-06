package com.cloud.pay.client.handler.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.cloud.pay.client.constants.Constants;
import com.cloud.pay.client.handler.ICloudPayApiHandler;
import com.cloud.pay.client.utils.BeanUtil;
import com.cloud.pay.client.vo.CloudApiMerchantRegisterParam;
import com.cloud.pay.client.vo.CloudApiMerchantUpdateParam;
import com.cloud.pay.client.vo.CloudApiMerchantUpdateResult;
import com.cloud.pay.common.contants.ApiErrorCode;
import com.cloud.pay.common.exception.CloudApiBusinessException;
import com.cloud.pay.merchant.entity.MerchantApplyBankInfo;
import com.cloud.pay.merchant.entity.MerchantApplyBaseInfo;
import com.cloud.pay.merchant.entity.MerchantApplyFeeInfo;
import com.cloud.pay.merchant.entity.MerchantBaseInfo;
import com.cloud.pay.merchant.service.MerchantApplyService;
import com.cloud.pay.merchant.service.MerchantService;

/**
 * 商户信息修改
 * @author 
 */
@Service("cloudMerchantUpdateHandler")
public class CloudApiMerchantUpdateHandler 
             implements ICloudPayApiHandler<CloudApiMerchantUpdateParam, CloudApiMerchantUpdateResult> {
	
	private Logger log = LoggerFactory.getLogger(CloudApiMerchantUpdateHandler.class);
	
	@Autowired
	private MerchantApplyService merchantApplyService;
	
	@Autowired
	private MerchantService merchantService;
	
	@Override
	public CloudApiMerchantUpdateResult handle(CloudApiMerchantUpdateParam reqParam) {
		log.info("商户信息修改，请求参数：{}",reqParam);
		CloudApiMerchantUpdateResult result = new CloudApiMerchantUpdateResult();
		if(StringUtils.isBlank(reqParam.getSubMchCode())) {
			 throw new CloudApiBusinessException(ApiErrorCode.PARAM_ERROR, "商户编码不可为空");
		}
		
		//获取机构信息,并判断是否为机构,只有机构才允许调用商户相关接口
		MerchantBaseInfo orgBaseInfo = (MerchantBaseInfo) merchantService.selectByCode(reqParam.getMchCode()).get("baseInfo");
		if(null != orgBaseInfo && 1 != orgBaseInfo.getType()) {
			throw new CloudApiBusinessException(ApiErrorCode.NOT_AUTHORITY, "该商户无此接口权限");
		}		
		result.setMchCode(reqParam.getMchCode());
		result.setSubMchCode(reqParam.getSubMchCode());
		
		Map<String, Object> map = merchantApplyService.selectByCode(reqParam.getSubMchCode());
		if(null == map) {
			result.setResultCode(Constants.RESULT_CODE_FAIL);
			result.setErrorCode(ApiErrorCode.SUB_MCH_INVALID);
			result.setErrorMsg("商户信息不存在");
			log.info("商户信息修改，响应结果：{}",result);
			return result;
		}
		
		try {
			//获取商户基本信息
			if(null == map.get("baseInfo")) {
				result.setResultCode(Constants.RESULT_CODE_FAIL);
				result.setErrorCode(ApiErrorCode.SUB_MCH_INVALID);
				result.setErrorMsg("商户信息不存在");
				log.info("商户信息修改，响应结果：{}",result);
				return result;
			}
			MerchantApplyBaseInfo baseInfo = (MerchantApplyBaseInfo) map.get("baseInfo");
			if(1 == baseInfo.getStatus()) {
				result.setResultCode(Constants.RESULT_CODE_FAIL);
				result.setErrorCode(ApiErrorCode.SUB_MCH_STATUS_INVALID);
				result.setErrorMsg("商户当前状态不允许修改");
				log.info("商户信息修改，响应结果：{}",result);
				return result;
			}
			BeanUtils.copyProperties(reqParam, baseInfo,BeanUtil.getNullPropertyNames(reqParam));
			baseInfo.setStatus(1);
			baseInfo.setVersion(baseInfo.getVersion()+1);
			//获取商户结算信息
			MerchantApplyBankInfo bankInfo =  null;
			if(null == map.get("bankInfo")) {
				bankInfo = new MerchantApplyBankInfo();
			}else {
			    bankInfo = (MerchantApplyBankInfo) map.get("bankInfo");
			}
			BeanUtils.copyProperties(reqParam, bankInfo,BeanUtil.getNullPropertyNames(reqParam));
			//获取商户费率信息
			MerchantApplyFeeInfo feeInfo = null;
			if(null == map.get("feeInfo")) {
				feeInfo = new MerchantApplyFeeInfo();
			}else {
				feeInfo = (MerchantApplyFeeInfo) map.get("feeInfo");
			}
			BeanUtils.copyProperties(reqParam, feeInfo,BeanUtil.getNullPropertyNames(reqParam));
			//获取商户文件信息
			JSONObject attachementJson = createAttachementJson(reqParam);
			bankInfo.setId(null);
			feeInfo.setId(null);
			merchantApplyService.change(baseInfo, bankInfo, feeInfo, attachementJson,reqParam.getMchCode(),true);
		}catch(Exception e) {
			log.error("修改商户信息失败：{}",e);
			throw new CloudApiBusinessException(ApiErrorCode.SYSTEM_ERROR,"系统错误"); 
		}
		log.info("商户信息修改，响应结果：{}",result);
		return result;
	}

	@Override
	public Class<CloudApiMerchantUpdateParam> getReqParamType() {
		return CloudApiMerchantUpdateParam.class;
	}
	
	/**
	 * 构建文件json数据
	 * @param reqParam
	 * @return
	 */
	private JSONObject createAttachementJson(CloudApiMerchantUpdateParam reqParam) {
		if(StringUtils.isNotBlank(reqParam.getBusinessFilePath()) || StringUtils.isNotBlank(reqParam.getCertFilePath())
				||StringUtils.isNotBlank(reqParam.getBankCardFilePath()) || StringUtils.isNotBlank(reqParam.getProtocolFilePath())) {
			JSONObject object = new JSONObject();
			if(StringUtils.isNotBlank(reqParam.getBusinessFilePath())) {
				object.put("businessPath", reqParam.getBusinessFilePath());
			}
			if(StringUtils.isNotBlank(reqParam.getCertFilePath())) {
				object.put("certPath", reqParam.getCertFilePath());
			}
			if(StringUtils.isNotBlank(reqParam.getBankCardFilePath())) {
				object.put("bankCardPath", reqParam.getBankCardFilePath());
			}
			if(StringUtils.isNotBlank(reqParam.getProtocolFilePath())) {
				object.put("protocolPath", reqParam.getProtocolFilePath());
			}
			return object;
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		MerchantApplyBaseInfo baseInfo = new MerchantApplyBaseInfo();
		baseInfo.setName("小黑");
		baseInfo.setShortName("小明");
		CloudApiMerchantUpdateParam param = new CloudApiMerchantUpdateParam(); 
		param.setName("小明");
		BeanUtils.copyProperties(param, baseInfo,BeanUtil.getNullPropertyNames(param));
		System.out.println(baseInfo);
		
		Map<String,Object> map = new HashMap<>();
		System.out.println(map.get("baseInfo"));
	}
	
	
}
