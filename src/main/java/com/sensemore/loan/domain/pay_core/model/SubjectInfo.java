package com.sensemore.loan.domain.pay_core.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectInfo {
    private String subjectSuit;
    private String subjectCode;
    private String subjectName;
    private String subjectContent;
    private String subjectCategory;
    private DebitInd debitInd;

    private Integer subjectlevel;
    private String parentSubjectCode;
    private boolean isLeafNode;
    private String accountNumber;
    private String childSample;

    private BigDecimal initBalance;
    private BigDecimal currentBalance;
    private LocalDate currentDate;

    private String remarks;
    private SubjectStatus status;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    
    /**
     * 借贷方向
     */
    public static enum DebitInd {
        CREDIT,
        DEBIT
    }

    public static enum SubjectStatus {
        ENABLE,
        DISABLE
    }

    public static enum SubjectCategory {
        ASSET("1001", "资产"),
        LIABILITY("2001", "负债"),
        EQUITY("4001", "权益"),
        INCOME("6001", "收入"),
        EXPENSE("5001", "成本"),
        FEE("5002", "费用");

        private String code;
        private String name;

        SubjectCategory(String code, String name) {
            this.code = code;
            this.name = name;
        }
    }

}
