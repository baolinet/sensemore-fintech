package com.sensemore.loan.domain.ai_core;

import java.util.Map;
import java.time.LocalDateTime;
import java.util.List;

public class ScheduleDomain {

    private String scheduleId;
    private String scheduleName;
    private String scheduleType;
    private List<String> scheduleTags;
    private String scheduleCron;
    private String creator;
    private String status;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public void createSchedule() {

    }

    public void removeSchedule() {

    }

    public void executeSchedule() {

    }

    public void suspendSchedule() {

    }

    public void resumeSchedule() {

    }

    public void queryExecuteLog() {

    }
}