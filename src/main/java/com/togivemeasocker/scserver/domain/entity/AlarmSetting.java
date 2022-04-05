package com.togivemeasocker.scserver.domain.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AlarmSetting {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "alarmSetting")
    private UserEntity user;

    private boolean commentAlarm;

    private boolean pinnedSubjectPostAlarm;

    private boolean softwareAnnouncementAlarm;

    private boolean sw7upAnnouncementAlarm; // SW 중심사업단의 url 링크: sw7up.cbnu.ac.kr
}
