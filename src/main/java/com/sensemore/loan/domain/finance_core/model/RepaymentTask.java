package com.sensemore.loan.domain.finance_core.model;

public class RepaymentTask {
// - 实体：还款提醒记录（ReminderRecord）
// - 值对象：还款期限（RepaymentDeadline，含日期、时点）、应还金额（DueAmount，含本金、利息、罚息）、还款状态（RepaymentStatus，如 “未到期 / 已还清 / 逾期”）

// 1. 生成还款任务（createTask (LoanContract)）：按贷中还款计划，在每期到期前生成任务
// 2. 发送还款提醒（sendReminder ()）：到期前 N 天触发短信 / 电话提醒
// 3. 还款确认（confirmRepayment (Transaction)）：接收资金到账信息，更新任务状态为 “已还清”
}
