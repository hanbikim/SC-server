package com.togivemeasocker.scserver.model;

import javax.persistence.*;

@Entity
public class UserAlarm {
    @Id
    @JoinColumn(name = "user_id")
    private Long user_id;

    private boolean commentAlarm;

    private boolean pinnedSubjectPostAlarm;

    private boolean softwareAnnouncementAlarm;

    private boolean sw7upAnnouncementAlarm; // SW 중심사업단의 url 링크: sw7up.cbnu.ac.kr
}
