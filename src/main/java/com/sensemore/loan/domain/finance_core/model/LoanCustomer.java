package com.sensemore.loan.domain.finance_core.model;

public class LoanCustomer {
// - 实体：客户账户（CustomerAccount）、征信记录（CreditReport）
// - 值对象：身份标识（IDCard/EnterpriseLicense，含编号、有效期）、联系方式（Contact，含电话、邮箱）

// 1. 信息同步（syncFromCreditBureau ()）：从征信机构拉取最新征信记录
// 2. 客户画像生成（generateProfile ()）：基于信息生成 “稳定客户 / 高风险客户” 标签
}
