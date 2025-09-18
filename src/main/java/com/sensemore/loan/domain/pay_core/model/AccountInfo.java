package com.sensemore.loan.domain.pay_core.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfo {
    private String openSource;
    private String customerId;
    private String customerName;
    private String accountName;
    private String subject;
    private Currency currency;

    private String accountNumber;

    private AccountCategory accountCategory;
    private AccountNature accountNature;
    private AccountType accountType;
    private AccountStatus accountStatus;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    /**
     * 货币类型：人民币、美元、数币、积分等
     */
    public static enum Currency {
        CNY, USD, Digital, Coupons;
    }
    
    /**
     * 账户类别：内部、个人、企业等
     */
    public static enum AccountCategory {
        Inner, Personal, Enterprise;
    }

    /**
     * 账户类型：理财、储蓄、贷款等
     */
    public static enum AccountType {
        Financial, Saving, Loan;
    }

    /**
     * 账户状态：正常、冻结、注销等
     * 
     */
    public static enum AccountStatus {
        Normal, Freeze, Cancel;
    }

    /**
     * 账户性质：借记、贷记
     */
    public static enum AccountNature {
        Debit, Credit;
    }
}
