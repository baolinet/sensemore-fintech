package com.sensemore.loan.domain.pay_core;

/**
 * 收银台
 */
public class CashierDomain {
    private String appId;
    private String bizScene;
    private String bizType;

    public void showPayBody(){
        // 展示支付信息
    }

    public void showPayMethods() {
        // 展示支付方式
    }

    public void showPayStep() {
        // 展示支付步骤
    }

    public void verifyPay(){
        // 支付鉴权短信、密码、人脸等
    }

    public void verifyPayConfirm(){
        // 支付鉴权确认
    }

    public void pay() {
        // 支付
    }

    public void cancelPay() {
        // 取消支付
    }

    public void queryPayStatus() {
        // 查询支付状态
    }

    public static enum PayScene {
        //支付场景
        POS,
        APP,
        MINI_PROGRAM,
        H5,
        PC;
    }

    public static enum PayStep {
        //支付步骤
        INIT,
        VERIFY,
        PAY,
        COMPLETE;
    }

    public static enum PayStatus {
        //支付状态
        INIT,
        VERIFY,
        PAY,
        COMPLETE;
    }

    /**
     * 支付分类（个人支付、企业支付）
     */
    public static enum PayCategory {
        PERSONAL,
        ENTERPRISE;
    }

    public static enum PayMethod {
        //操作方式
        APP,
        H5,
        PC,
        POS,
        MINIPROGRAM,
        QR_CODE;
        
//         电子支付相关：移动支付（mobile payment）、网银支付（online banking payment）；
// 传统支付相关：现金支付（cash payment）、支票支付（cheque payment）；
// 细分场景：扫码支付（QR code payment）、NFC 近场支付（NFC payment）。
    }

    public static enum payTool {
        //用 “银行卡”（tool）通过 “网银支付”（method）完成 “线上支付”（type））
        BANK_CARD,
        CREDIT_CARD,
        CASHE,
        CHEQUE,
        E_WALLET,
        DIGITAL;
    }


    public static enum payChannel {
        //“支付渠道”，指资金流转的路径或通道，侧重 “资金传输的途径”。
        ALIPAY,
        WECHAT,
        UNIONPAY,
        BANK,
        OTHER;
    }
}
