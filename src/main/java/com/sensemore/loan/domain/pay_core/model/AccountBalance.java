package com.sensemore.loan.domain.pay_core.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountBalance {
    /**
     * 账户编号
     */
    private String accountNumber;
    /**
     * 余额
     */
    private BigDecimal balance;
    /**
     * 上次余额
     */
    private BigDecimal lastBalance;
   /**
     * 冻结余额
     */
    private BigDecimal frozenBalance;
    /**
     * 可提现余额
     */
    private BigDecimal availableBalance;
 
    /**
     * 可透支额度
     */
    private BigDecimal creditLimit;
    /**
     * 余额上限(1000、1万、20万等)
     */
    private BigDecimal balanceLimit;
    
    /**
     * 欠费金额
     */
    private BigDecimal arrearsAmount;
    
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}