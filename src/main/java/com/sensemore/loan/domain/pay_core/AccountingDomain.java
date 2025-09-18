package com.sensemore.loan.domain.pay_core;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.sensemore.loan.domain.pay_core.AccountDomain.ProcessStatus;
import com.sensemore.loan.domain.pay_core.model.AccountDetail.AccountingType;
import com.sensemore.loan.domain.pay_core.model.AccountInfo.AccountCategory;
import com.sensemore.loan.domain.pay_core.model.AccountInfo.AccountNature;
import com.sensemore.loan.domain.pay_core.model.AccountInfo.AccountType;
import com.sensemore.loan.domain.pay_core.model.AccountInfo.Currency;
import com.sensemore.loan.domain.pay_core.model.AccountingRecord.AccountingStatus;
import com.sensemore.loan.domain.pay_core.model.AccountingRecord.Direction;
import com.sensemore.loan.domain.pay_core.model.AccountingRecord.TransactionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class AccountingDomain {
    private String appId;
    private String bizScene;
    private String bizType;

    public AccountingProcessResponse deposit(String customerId, BigDecimal amount, String bindingCardId) {
        // 充值逻辑实现
        return null;
    }

    public AccountingProcessResponse withdraw(String customerId, BigDecimal amount, String bindingCardId) {
        // 提现逻辑实现
        return null;
    }

    public AccountingProcessResponse transfer(TransferAccountingRequest request) {
        // 转账逻辑实现
        return null;
    }

    public AccountingProcessResponse refund(RefundAccountingRequest request) {
        // 退款逻辑实现
        return null;
    }
    public AccountingProcessResponse pay(PayAccountingRequest request) {
        // 支付逻辑实现
        return null;
    }
    
    public AccountingProcessResponse settle(String customerId, String transactionNo, BigDecimal amount) {
        // 结算逻辑实现
        return null;
    }

    public AccountingProcessResponse charge(String customerId, String bizNo, String transactionNo, BigDecimal amount) {
        // 扣费逻辑实现
        return null;
    }

    /**
     * 撤销交易
     * @param transactionNo
     * @param accountingNumber
     * @param amount
     */
    public AccountingProcessResponse reverse(String transactionNo, String oriTransactionNo, ReverseType reverseType) {
        // 撤销逻辑实现
        return null;
    }

    /**
     * 通用账务处理
     * @param transactionNo
     * @param accountNumber
     * @param direction
     * @param amount
     * @param remark
     * @return
     */
    public AccountingProcessResponse accounting(String transactionNo, String accountNumber, Direction direction, BigDecimal amount, String remark) {
        // 账务处理逻辑实现
        return null;
    }

    public List<AccountingBillResponse> queryAccountingBills(String accountNumber, LocalDateTime startTime, LocalDateTime endTime) {
        // 查询账务账单逻辑实现
        return null;
    }

    public AccountingStatusResponse queryAccountingStatus(String accountingNumber) {
        // 查询账务详情逻辑实现
        return null;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PayAccountingRequest {
        private String customerId;
        private String payerId;
        private String payerName;
        private String payMethod;
        private String bizNo;
        private BigDecimal amount;
        private String remark;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class RefundAccountingRequest {
        private String customerId;
        private String payerId;
        private String payerName;
        private String payMethod;
        private String bizNo;
        private String transactionNo;
        private BigDecimal amount;
        private String remark;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TransferAccountingRequest {
        private String fromCustomerId;
        private String toCustomerId;
        private String bizNo;
        private String transactionNo;
        private BigDecimal amount;
        private String remark;
    }
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AccountingProcessResponse {
        private String accountNumber;
        private String accountName;
        private String accountingNumber;
        private TransactionType transactionType;
        private ProcessStatus processStatus;
        private LocalDateTime processTime;
        private String summary;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AccountingBillResponse {
        private String accountingSource;
        private String accountingNumber;
        private String accountNumber;
        private String accountName;

        private String customerId;
        private String customerName;
        private String subject;
        private Currency currency;
        
        private AccountCategory accountCategory;
        private AccountNature accountNature;
        private AccountType accountType;

        private LocalDateTime accountingTime;
        private String amount;
        private String bizScene;
        private String bizType;
        private String bizNo;
        private String transactionNo;
        private String oriTransactionNo;
        private TransactionType transactionType;
        private String partyId;
        private String partyName;

        private AccountingType accountingType;
        private Direction direction;
        private String summary;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AccountingStatusResponse {
        private String accountNumber;
        private String accountName;
        private String accountingNumber;
        private TransactionType transactionType;
        private AccountingStatus status;
        private LocalDateTime accountingTime;
        private AccountingType accountingType;
        private String summary;
    }

    /**
     * 撤销类型：蓝票、红票
     */
    public static enum ReverseType {
        BLUE, RED;
    }

}