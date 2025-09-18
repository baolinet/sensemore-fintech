package com.sensemore.loan.domain.finance_core.model;

public class LoanAsset {
// - 实体：抵债资产（CollateralAsset）、核销记录（Write-offRecord）
// - 值对象：资产估值（AssetValuation，含评估金额、评估日期）、核销金额（Write-offAmount）
// 1. 抵债处理（handleCollateral ()）：借款人无力还款时，处置抵押资产抵扣欠款
// 2. 贷款核销（writeOffLoan ()）：确认无法回收的呆账，按会计规则完成核销
}
