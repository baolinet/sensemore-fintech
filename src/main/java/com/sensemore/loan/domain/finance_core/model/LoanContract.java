package com.sensemore.loan.domain.finance_core.model;

public class LoanContract {
// - 实体：还款计划（RepaymentPlan）、放款记录（DisbursementRecord）
// - 值对象：合同编号（ContractNo，唯一标识）、贷款利率（LoanRate，含年化率、计息方式）、资金用途（FundPurpose，如 “消费 / 经营”）

// 1. 合同生成（generate (CreditApplication)）：基于授信申请生成正式合同
// 2. 放款指令发起（initiateDisbursement ()）：校验放款条件（如合同签署完成），触发资金划拨
// 3. 还款计划生成（createRepaymentPlan ()）：按 “等额本息 / 先息后本” 等方式生成每期还款额
}
