package com.cloud.pay.merchant.entity;

public class MerchantSecret {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_merchant_secret.merchant_id
     *
     * @mbggenerated Mon Sep 10 14:32:31 CST 2018
     */
    private Integer merchantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_merchant_secret.secret
     *
     * @mbggenerated Mon Sep 10 14:32:31 CST 2018
     */
    private byte[] secret;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_merchant_secret.merchant_id
     *
     * @return the value of t_merchant_secret.merchant_id
     *
     * @mbggenerated Mon Sep 10 14:32:31 CST 2018
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_merchant_secret.merchant_id
     *
     * @param merchantId the value for t_merchant_secret.merchant_id
     *
     * @mbggenerated Mon Sep 10 14:32:31 CST 2018
     */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_merchant_secret.secret
     *
     * @return the value of t_merchant_secret.secret
     *
     * @mbggenerated Mon Sep 10 14:32:31 CST 2018
     */
    public byte[] getSecret() {
        return secret;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_merchant_secret.secret
     *
     * @param secret the value for t_merchant_secret.secret
     *
     * @mbggenerated Mon Sep 10 14:32:31 CST 2018
     */
    public void setSecret(byte[] secret) {
        this.secret = secret;
    }
}