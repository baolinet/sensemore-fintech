package com.sensemore.loan.domain.finance_core;

public class InLoanDomain {
     public void searchLoanApply(){

    }

    public void approvalApply(){
        // 审批申请
    }

    public void signContract(){

    }

    public void provideMaterial(){
        // 提供资料
    }

    public void fundPayout(){
        // 放款
    }

// 专有名词
// 贷款发放	Loan Disbursement	金融机构审核通过后，将贷款资金划转到借款人账户的操作
// 贷款本金	Loan Principal	借款人实际借入的原始资金金额，不包含利息和其他费用
// 行为评分卡	Behavior Scorecard（简称 B 卡）	基于借款人贷中行为（如还款记录、消费习惯）生成的风险评分，用于动态监控
// 账龄分析	Aging Analysis	按贷款发放时间或逾期时间分类，统计不同 “账龄” 贷款的占比，评估资产质量
// 迁徙率	Flow Rate	衡量贷款从一个风险状态转移到另一个状态的概率（如 “正常”→“逾期 30 天内”）
// 利息保障倍数	Interest Cover Ratio（简称 ICR）	评估企业还款能力的指标，计算公式为 “息税前利润（EBIT）÷ 应付利息”
// 贷款用途监控	Loan Purpose Monitoring	核查借款人是否按申请用途使用资金，防止资金流入违规领域（如股市、房地产）
}
