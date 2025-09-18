package com.sensemore.loan.domain.pay_core.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountSetting {
    private String customerId;
    private String accountNumber;

    private String operator;
    private SettingType settingType;
    private String memo;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    /**
     * 设置类型：冻结、解冻、销户、挂起、恢复、止出、止入
     */
    public static enum SettingType {
        FREEZE, UNFREEZE, DISTORY, SUSPEND, RECOVER, STOP_OUT, STOP_IN;
    }
}
