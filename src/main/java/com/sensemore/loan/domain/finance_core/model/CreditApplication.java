package com.sensemore.loan.domain.finance_core.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.sensemore.loan.domain.finance_core.model.CreditApplication.ApprovalRecord;
import com.sensemore.loan.domain.finance_core.model.CreditApplication.ApprovalStatus;

public class CreditApplication {
    
    // 实体：申请人（Applicant，个人 / 企业）、审批记录（ApprovalRecord）
    // - 值对象：申请金额（ApplicationAmount，含币种、数值）、授信期限（CreditTerm，含起始日、到期日）、风险评级（RiskRating，如 AAA/BBB）

    private LoanApplicant applicant;
    private List<ApprovalRecord> approvalRecords;

    private Long id;
    private String applicationNo;
    private String sourceChannel;
    private BigDecimal applyAmount;
    private BigDecimal creditAmount;
    private LocalDate beginCreditTerm;
    private LocalDate endCreditTerm;
    private RiskRating riskRating;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

// 1. 提交申请（submit ()）：校验申请资料完整性
// 2. 发起审批（initiateApproval ()）：触发风控规则校验
// 3. 审批结果处理（handleApprovalResult ()）：接收审批通过 / 拒绝结果，更新申请状态

    public void checkMaterial(){
        // 校验申请资料完整性
    }

    public static enum RiskRating {
        AAA, BBB, CCC;
    }

    public static enum ApplicantType {
        PERSONAL, ENTERPRISE;
    }

    public static class ApprovalRecord {
        private String approvalId;
        private String approvalName;
        private ApprovalStatus approvalStatus;
        private String approvalMemo;
    }

    public static enum ApprovalStatus {
        PENDING, APPROVED, REJECTED;
    }
}
