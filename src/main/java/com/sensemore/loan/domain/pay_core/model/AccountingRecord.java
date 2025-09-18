package com.sensemore.loan.domain.pay_core.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountingRecord {
    private String accountingSource;
    private String accountingNumber;
    private String customerId;
    private String bizScene;
    private String bizType;
    private String bizNo;
    private String transactionNo;
    private TransactionType transactionType;
    private String partyId;
    private String partyName;

    private AccountingMethod accountingMethod;
    private AccountingStatus accountingStatus;
    private Direction direction;
    private String amount;
    private String remark;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    /**
     * 记账方式：单笔、批量、合并
     */
    public enum AccountingMethod {
        SINGLE, BATCH, MERGE;
    }

    /**
     * 记账状态：成功、处理中、失败
     */
    public enum AccountingStatus {
        SUCCESS, PROCESSING, FAIL;
    }

    /**
     * 记账方向：收入、支出
     */
    public enum Direction {
        IN, OUT;
    }

    /**
     * 交易类型：支付、收款、退款、转账、结算、充值、提现、撤销
     */
    public enum TransactionType {
        PAY, RECEIVE, REFUND, TRANSFER, SETTLEMENT, DEPOSIT, WITHDRAWAL, REVERSAL;
    }
}
