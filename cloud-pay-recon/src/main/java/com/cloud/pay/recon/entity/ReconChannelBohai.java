package com.cloud.pay.recon.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ReconChannelBohai {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.ID
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.SINGLE_OR_BATCH
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private String singleOrBatch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.INSTID
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private String instid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.TRADE_ORDER_NO
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private String tradeOrderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.PAYER_ACCOUNT
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private String payerAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.PAYER_NAME
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private String payerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.PAYEE_ACCOUNT
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private String payeeAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.PAYEE_NAME
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private String payeeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.BANK_CODE
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private String bankCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.TRADE_AMOUNT
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private BigDecimal tradeAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.TRADE_STATUS
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private Integer tradeStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.TRADE_STATUS_DESC
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private String tradeStatusDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_channel_bohai.CREATE_TIME
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.ID
     *
     * @return the value of t_recon_channel_bohai.ID
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.ID
     *
     * @param id the value for t_recon_channel_bohai.ID
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.SINGLE_OR_BATCH
     *
     * @return the value of t_recon_channel_bohai.SINGLE_OR_BATCH
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public String getSingleOrBatch() {
        return singleOrBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.SINGLE_OR_BATCH
     *
     * @param singleOrBatch the value for t_recon_channel_bohai.SINGLE_OR_BATCH
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setSingleOrBatch(String singleOrBatch) {
        this.singleOrBatch = singleOrBatch == null ? null : singleOrBatch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.INSTID
     *
     * @return the value of t_recon_channel_bohai.INSTID
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public String getInstid() {
        return instid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.INSTID
     *
     * @param instid the value for t_recon_channel_bohai.INSTID
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setInstid(String instid) {
        this.instid = instid == null ? null : instid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.TRADE_ORDER_NO
     *
     * @return the value of t_recon_channel_bohai.TRADE_ORDER_NO
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public String getTradeOrderNo() {
        return tradeOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.TRADE_ORDER_NO
     *
     * @param tradeOrderNo the value for t_recon_channel_bohai.TRADE_ORDER_NO
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setTradeOrderNo(String tradeOrderNo) {
        this.tradeOrderNo = tradeOrderNo == null ? null : tradeOrderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.PAYER_ACCOUNT
     *
     * @return the value of t_recon_channel_bohai.PAYER_ACCOUNT
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public String getPayerAccount() {
        return payerAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.PAYER_ACCOUNT
     *
     * @param payerAccount the value for t_recon_channel_bohai.PAYER_ACCOUNT
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount == null ? null : payerAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.PAYER_NAME
     *
     * @return the value of t_recon_channel_bohai.PAYER_NAME
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.PAYER_NAME
     *
     * @param payerName the value for t_recon_channel_bohai.PAYER_NAME
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setPayerName(String payerName) {
        this.payerName = payerName == null ? null : payerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.PAYEE_ACCOUNT
     *
     * @return the value of t_recon_channel_bohai.PAYEE_ACCOUNT
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public String getPayeeAccount() {
        return payeeAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.PAYEE_ACCOUNT
     *
     * @param payeeAccount the value for t_recon_channel_bohai.PAYEE_ACCOUNT
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount == null ? null : payeeAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.PAYEE_NAME
     *
     * @return the value of t_recon_channel_bohai.PAYEE_NAME
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.PAYEE_NAME
     *
     * @param payeeName the value for t_recon_channel_bohai.PAYEE_NAME
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName == null ? null : payeeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.BANK_CODE
     *
     * @return the value of t_recon_channel_bohai.BANK_CODE
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.BANK_CODE
     *
     * @param bankCode the value for t_recon_channel_bohai.BANK_CODE
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.TRADE_AMOUNT
     *
     * @return the value of t_recon_channel_bohai.TRADE_AMOUNT
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.TRADE_AMOUNT
     *
     * @param tradeAmount the value for t_recon_channel_bohai.TRADE_AMOUNT
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.TRADE_STATUS
     *
     * @return the value of t_recon_channel_bohai.TRADE_STATUS
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public Integer getTradeStatus() {
        return tradeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.TRADE_STATUS
     *
     * @param tradeStatus the value for t_recon_channel_bohai.TRADE_STATUS
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.TRADE_STATUS_DESC
     *
     * @return the value of t_recon_channel_bohai.TRADE_STATUS_DESC
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public String getTradeStatusDesc() {
        return tradeStatusDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.TRADE_STATUS_DESC
     *
     * @param tradeStatusDesc the value for t_recon_channel_bohai.TRADE_STATUS_DESC
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setTradeStatusDesc(String tradeStatusDesc) {
        this.tradeStatusDesc = tradeStatusDesc == null ? null : tradeStatusDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_channel_bohai.CREATE_TIME
     *
     * @return the value of t_recon_channel_bohai.CREATE_TIME
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_channel_bohai.CREATE_TIME
     *
     * @param createTime the value for t_recon_channel_bohai.CREATE_TIME
     *
     * @mbggenerated Sun Sep 02 12:55:14 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}