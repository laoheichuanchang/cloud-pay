package com.cloud.pay.recon.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FillRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill_record.ID
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill_record.ORG_ID
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    private Integer orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill_record.FILL_AMOUNT
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    private BigDecimal fillAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill_record.RMK
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    private String rmk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill_record.STATUS
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill_record.UPDATOR_ID
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    private Integer updatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill_record.UPDATE_TIME
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill_record.ID
     *
     * @return the value of t_fill_record.ID
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill_record.ID
     *
     * @param id the value for t_fill_record.ID
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill_record.ORG_ID
     *
     * @return the value of t_fill_record.ORG_ID
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill_record.ORG_ID
     *
     * @param orgId the value for t_fill_record.ORG_ID
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill_record.FILL_AMOUNT
     *
     * @return the value of t_fill_record.FILL_AMOUNT
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public BigDecimal getFillAmount() {
        return fillAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill_record.FILL_AMOUNT
     *
     * @param fillAmount the value for t_fill_record.FILL_AMOUNT
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public void setFillAmount(BigDecimal fillAmount) {
        this.fillAmount = fillAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill_record.RMK
     *
     * @return the value of t_fill_record.RMK
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public String getRmk() {
        return rmk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill_record.RMK
     *
     * @param rmk the value for t_fill_record.RMK
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public void setRmk(String rmk) {
        this.rmk = rmk == null ? null : rmk.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill_record.STATUS
     *
     * @return the value of t_fill_record.STATUS
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill_record.STATUS
     *
     * @param status the value for t_fill_record.STATUS
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill_record.UPDATOR_ID
     *
     * @return the value of t_fill_record.UPDATOR_ID
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public Integer getUpdatorId() {
        return updatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill_record.UPDATOR_ID
     *
     * @param updatorId the value for t_fill_record.UPDATOR_ID
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public void setUpdatorId(Integer updatorId) {
        this.updatorId = updatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill_record.UPDATE_TIME
     *
     * @return the value of t_fill_record.UPDATE_TIME
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill_record.UPDATE_TIME
     *
     * @param updateTime the value for t_fill_record.UPDATE_TIME
     *
     * @mbggenerated Sun Sep 09 21:58:19 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}