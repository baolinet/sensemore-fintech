package com.sensemore.loan.domain.pay_core;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.sensemore.loan.domain.pay_core.model.AccountingRecord.TransactionType;
import com.sensemore.loan.domain.pay_core.model.JournalEntry.JournalType;
import com.sensemore.loan.domain.pay_core.model.SubjectInfo.DebitInd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JournalDomain {

    private LocalDate accountingDay;

    private boolean checkAvailable(LocalDate accountingDay) {
        return false;
    }

    public List<JournalResponse> queryJournals(String subjectCode, LocalDate accountingDay) {
        // 
        return null;
    }

    public void createJournals(List<JournalRequest> journals) {
        // 创建账户
        
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class JournalResponse extends JournalRequest{
        private String subjectName;
        private String accountName;
        private LocalDate accountingDay;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class JournalRequest {
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
