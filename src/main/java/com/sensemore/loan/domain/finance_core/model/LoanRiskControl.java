package com.sensemore.loan.domain.finance_core.model;

public class LoanRiskControl {
        // - 实体：规则明细（RuleDetail，如 “收入负债比≤50%”）
    // - 值对象：规则类型（RuleType，如 “准入规则 / 定价规则”）、规则阈值（RuleThreshold，如 “50%”“36% APR”）

// 1. 规则校验（validate (Applicant)）：传入申请人信息，返回 “通过 / 拒绝” 及原因
// 2. 风险定价（calculateRate (RiskRating)）：根据风险评级计算对应利率
    public void validate(LoanApplicant loanApplicant){

    }

    public void calculateRate(RiskRating riskRating){

    }

    public static class RiskRating{

    }

    public void manuleApproval(){

    }

    public void autoApproval(){

    }

    public void innerPart(){
        // 
    }

    public void thirdPart(){
        //
    }

    public static class RiskRule{
        private String ruleId;
        private String ruleName;
        private String ruleType;
        private String ruleThreshold;
        private String ruleStatus;
    }
}
