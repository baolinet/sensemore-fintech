package com.sensemore.loan.domain.finance_core.model;

public class FundAccount {
// - 实体：账户流水（AccountTransaction）
// - 值对象：账户类型（AccountType，如 “放款账户 / 还款账户”）、账户余额（AccountBalance，含可用余额、冻结余额）

// 1. 资金划拨（transfer (Amount, TargetAccount)）：执行放款（从机构账户到借款人账户）
// 2. 流水记录（recordTransaction (TransactionType, Amount)）：记录每笔资金变动（放款 / 还款 / 手续费）
}
