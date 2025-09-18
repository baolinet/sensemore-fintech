package com.sensemore.loan.domain.finance_core;

import java.time.Month;
import java.util.Collection;
import java.util.concurrent.Flow;

import javax.xml.crypto.KeySelector.Purpose;

public class PostLoanDomain {
    // 提醒
    // 催收
    // 罚息
    // 核销
    // 减免
    // 债转
    
// 还款提醒	Repayment Reminder	在还款日之前，通过短信、电话等方式提醒借款人按时还款的操作
// 逾期天数	Days Past Due（简称 DPD）	从还款日次日到实际还款日的间隔天数（如 DPD30 表示逾期 30 天）
// 首次还款逾期	First Payment Delinquency（简称 FPD）	借款人获得贷款后，第一期还款就出现逾期的情况，是重要风险信号
// 账龄	Month on Book（简称 MOB）	贷款发放后的存续月份（如 MOB1 表示放款后第 1 个月，MOB6 表示第 6 个月）
// 催收评分卡	Collection Scorecard（简称 C 卡）	针对逾期客户的评分工具，用于判断客户还款意愿和能力，制定差异化催收策略
// 催收管理	Collection Management	对逾期客户进行梯度催收的过程（如短信催收→电话催收→法律诉讼）
// 呆账	Bad Debt	经过长期催收仍无法收回的贷款，金融机构需按规定计提坏账准备金
// 贷款核销	Loan Write-off	金融机构将确认无法收回的呆账从资产负债表中移除的会计操作
}
