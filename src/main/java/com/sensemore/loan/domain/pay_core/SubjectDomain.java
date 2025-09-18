package com.sensemore.loan.domain.pay_core;

import java.util.List;

import com.sensemore.loan.domain.pay_core.model.SubjectInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class SubjectDomain {
    private String operator;
    private String remark;

    public String createSubject(SubjectInfoRequest subjectInfoRequest) {
        // 创建科目
        return null;
    }

    public List<SubjectInfoResponse> queryGeneralSubjects() {
        // 查询一级科目
        return null;
    }

    public List<SubjectInfoResponse> queryChildSubjects(String subjectCode) {
        // 查询科目
        return null;
    }

    public SubjectInfoResponse querySubject(String subjectCode) {
        // 查询科目
        return null;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SubjectInfoRequest extends SubjectInfo {
        private String subjectCode;
        private String subjectName;
        private String subjectContent;
        private String subjectCategory;
        private DebitInd debitInd;

        private Integer subjectlevel;
        private String parentSubjectCode;
       
        private String accountNumber;
        private String childSample;
    }

    @Data
    public static class SubjectInfoResponse extends SubjectInfo {
        
    }
}
