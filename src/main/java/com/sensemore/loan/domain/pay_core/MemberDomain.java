package com.sensemore.loan.domain.pay_core;

public class MemberDomain {
    
    public void createUser(){

    }

    public void distoryUser(){

    }

    public void queryUser(){

    }

    public void createMerchant(){

    }

    public void queryMerchant(){

    }

    public void distoryMerchant(){

    }

    public void merchantSignContract(){

    }

    public void queryMerchantContracts(){

    }

    public void merchantTerminationContract(){

    }

    /**
     * 创建鉴权（密码、手机、邮箱、银行卡、人脸等）
     */
    public void triggerAuthentication(){

    }

    /**
     * 确认鉴权
     */
    public boolean confirmAuthentication(){
        return true;
    }

    /**
     * 申请支付校验码（短信验证码、邮箱验证吗）
     */
    public void verifyPayCode(){
    }

    /**
     * 确认支付校验码
     */
    public boolean verifyPayConfirm(){
        return false;
    }

}
