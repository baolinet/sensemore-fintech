package com.sensemore.loan.domain.pay_core.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.sensemore.loan.domain.pay_core.model.AccountingRecord.AccountingStatus;
import com.sensemore.loan.domain.pay_core.model.AccountingRecord.TransactionType;
import com.sensemore.loan.domain.pay_core.model.SubjectInfo.DebitInd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JournalEntry {
    private String accountNumber;
    private String accountingNumber;
    private JournalType journalType;
    private String journalNo;
    private String journalDate;
    private String voucherNo;
    private String subjectCode;
    private BigDecimal amount;
    private DebitInd debitInd;
    private String operator;
    private String summary;
    private LocalDate accountingDay;

    private JournalExtension journalExtension;

    private String createTime;
    private String updateTime;

    public static enum JournalType{
        NORMAL, BLUE, RED;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class JournalExtension {
        private String customerId;
        private String bindingCardId;
        private String bizScene;
        private String bizType;
        private String bizNo;
        private String transactionNo;
        private TransactionType transactionType;
        private String payerId;
        private String payerName;
        private String payeeId;
        private String payeeName;
        private String payMethod;
        private String payBankAccountId;
    }
}


