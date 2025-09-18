package com.sensemore.loan.domain.finance_core.model;

public class LoanOverdue {
// - 实体：催收记录（CollectionRecord）、法律诉讼记录（LawsuitRecord）
// - 值对象：逾期天数（OverdueDays，如 DPD30/DPD90）、催收策略（CollectionStrategy，如 “短信催收 / 上门催收”）、呆账认定标准（BadDebtStandard，如 “逾期 180 天”）

// 1. 触发逾期（triggerOverdue ()）：还款到期后未还款，更新状态为 “逾期” 并计算罚息
// 2. 执行催收（executeCollection ()）：根据逾期天数匹配催收策略，记录催收过程
// 3. 呆账认定（confirmBadDebt ()）：达到呆账标准时，标记贷款为 “呆账”
}
