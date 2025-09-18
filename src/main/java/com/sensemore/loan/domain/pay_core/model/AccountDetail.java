package com.sensemore.loan.domain.pay_core.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetail {
    private String accountingNumber;
    private String accountNumber;
    private String amount;
    private AccountingType accountingType;
    private DetailStatus detailStatus;
    private String remark;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    /**
     * 明细类型：正常、调整、冲正
     */
    public static enum AccountingType {
        NORMAL, ADJUST, REVERSAL;
    }

    /**
     * 账户明细状态：有效、无效
     */
    public static enum DetailStatus {
        VALID, INVALID;
    }
}
