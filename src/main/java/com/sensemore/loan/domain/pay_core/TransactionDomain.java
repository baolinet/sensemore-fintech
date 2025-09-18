package com.sensemore.loan.domain.pay_core;

public class TransactionDomain {
    public void createPayOrder(OrderRequest payorderRequest){

    }

    public void cancelPayOrder(){

    }

    public void transaction(){

    }

    public void cancelTransaction(){

    }

    public void queryTransaction(){

    }
    
    public void queryTransactionStatus(){

    }

    private OrderResponse deposit(DepositOrderRequest depositOrderRequest) {
        // 充值逻辑实现
        return null;
    }

    public void withdraw(WithdrawOrderRequest withdrawOrderRequest) {
        // 提现逻辑实现
    }

    public void transfer(TransferOrderRequest transferOrderRequest) {
        // 转账逻辑实现
    }
    
    public void pay(PayOrderRequest payOrderRequest) {
        // 支付逻辑实现
    }

    public void refund(RefundOrderRequest refundOrderRequest) {
        // 退款逻辑实现
    }

    public void shareProfit(ShareProfitOrderRequest shareProfitOrderRequest){
        // 分账逻辑实现
    }

    /**
     * 申请交易校验码
     */
    public void verifyTransaction(){

    }

    /**
     * 确认交易校验码
     */
    public void verifyTransactionConfirm(){

    }


    public static abstract class OrderRequest {

    }

    public static class PayOrderRequest extends OrderRequest {

    }

    public static class TransferOrderRequest extends OrderRequest {

    }

    public static class RefundOrderRequest extends OrderRequest {
        
    }

    public static class DepositOrderRequest extends OrderRequest {
        
    }

    public static class WithdrawOrderRequest extends OrderRequest {
        
    }

    public static class ShareProfitOrderRequest extends OrderRequest {
        
    }

    public static class OrderResponse {
        
    }

}
