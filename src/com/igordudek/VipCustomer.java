package com.igordudek;

/**
 * Created by VADMIN on 2017-03-01.
 */
public class VipCustomer {
    private String vipName;
    private double vipCreditLimit;
    private String vipEmailAddress;


    //Setters and getters
    public String getVipName() {
        return vipName;
    }

    public double getVipCreditLimit() {
        return vipCreditLimit;
    }

    public String getVipEmailAddress() {
        return vipEmailAddress;
    }

    //Constructors
    public VipCustomer(String vipName, double vipCreditLimit, String vipEmailAddress) {
        this.vipName = vipName;
        this.vipCreditLimit = vipCreditLimit;
        this.vipEmailAddress = vipEmailAddress;
    }

    public VipCustomer() {
        this("Donald Trump", 100000, "trump@potus.gov.pl");
    }

    public VipCustomer(String vipName, String vipEmailAddress) {
        this(vipName, 50000, vipEmailAddress);
    }
}
