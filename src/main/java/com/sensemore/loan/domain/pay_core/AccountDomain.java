package com.sensemore.loan.domain.pay_core;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.sensemore.loan.domain.pay_core.model.AccountBalance;
import com.sensemore.loan.domain.pay_core.model.AccountInfo;
import com.sensemore.loan.domain.pay_core.model.AccountInfo.Currency;
import com.sensemore.loan.domain.pay_core.model.AccountSetting.SettingType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class AccountDomain {
    private String appId;
    private String operator;
    private String bizScene;
    private String bizType;
    
   /**
    * 创建账户
    * @param createAccountRequest
    * @return
    */
    public AccountProcessResponse createAccount(CreateAccountRequest createAccountRequest){
        // 开户逻辑实现
        return null;
    }

    /**
     * 查询账户余额-根据账户编号
     * @param accountNumber
     * @return
     */
    public AccountBalanceResponse queryAccountBalanceByNumber(String accountNumber){
        // 查询账户余额逻辑实现
        return null;
    }

    /**
     * 查询账户余额-根据客户编号
     * @param customerId
     * @return
     */
    public AccountBalanceResponse queryAccountBalanceById(String customerId){
        // 查询账户余额逻辑实现
        return null;
    }
 
    /**
     * 查询账户信息-根据账户编号
     * @param accountNumber
     * @return
     */
    public AccountInfoResponse findAccountInfoByNumber(String accountNumber){
        // 查询账户信息逻辑实现
        return null;
    }

    /**
     * 查询账户列表-根据客户编号
     * @param customerId
     * @return
     */
    public List<AccountInfoResponse> listAccountInfos(String customerId){
        // 查询账户列表逻辑实现
        return null;
    }

    /**
     * 冻结余额
     * @param accountNumber
     * @param amount
     * @return
     * 
     */
    public AccountProcessResponse frozenBalance(String accountNumber, BigDecimal amount){
        // 冻结余额逻辑实现
        return null;
    }

    /**
     * 解冻余额
     * @param accountNumber
     * @param amount
     * @return
     */
    public AccountProcessResponse unfrozenBalance(String accountNumber, BigDecimal amount){
        // 解冻余额逻辑实现
        return null;
    }

    /**
     * 账户控制
     * @param accountNumber
     * @param operator
     * @param memo
     * @param settingType
     * @return
     */
    public AccountProcessResponse accountControl(String accountNumber, String operator, String memo, SettingType settingType){
        // 转账逻辑实现
        return null;
    }

    /**
     * 资金预冻结
     * @param accountNumber
     * @param amount
     * @return
     */
    public AccountProcessResponse preFreeze(String accountNumber, BigDecimal amount){
        // 转账逻辑实现
        return null;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AccountBalanceResponse extends AccountBalance {
       private String customerId;
        private String customerName;
        private String subject;
        private Currency currency;

        private String bizScene;
        private String bizType;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AccountInfoResponse extends AccountInfo {
        private BigDecimal balance;
        private BigDecimal lastBalance;
        private BigDecimal frozenBalance;
        private BigDecimal availableBalance;
    }
   
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateAccountRequest {
        private String customerId;
        private String customerName;
        private String subject;
        private Currency currency;

        private String bizScene;
        private String bizType;
    }

     /**
     * 账户处理
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AccountProcessResponse {
        private String accountNumber;
        private String accountName;
        private ProcessStatus status;
        private LocalDateTime processTime;
        private String summary;
    }

    /**
     * 处理状态：成功、处理中、失败
     */
    public static enum ProcessStatus {
        SUCCESS, PROCESSING, FAIL;
    }
    
}
