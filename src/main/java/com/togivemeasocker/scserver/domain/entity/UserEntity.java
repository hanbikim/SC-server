package com.togivemeasocker.scserver.domain.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
//@Setter
public class UserEntity {
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


    @Builder
    public UserEntity(long id, String username, String password, String studentNumber,
                      String CBNUpasword, String nickname, AlarmSetting alarmSetting){
        this.id = id;
        this.username = username;
        this.password = password;
        this.studentNumber = studentNumber;
        this.CBNUpasword = CBNUpasword;
        this.nickname = nickname;
        this.alarmSetting = alarmSetting;
    }
}
