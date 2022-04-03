package com.togivemeasocker.scserver.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String password;

    private String studentNumber;

    private String CBNUpasword;

    private String nickname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "alarm_setting_id", referencedColumnName = "id")
    private AlarmSetting alarmSetting;
}
