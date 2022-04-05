package com.togivemeasocker.scserver.dto;

import com.togivemeasocker.scserver.domain.entity.AlarmSetting;
import com.togivemeasocker.scserver.domain.entity.UserEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String studentNumber;
    private String CBNUpasword;
    private String nickname;
    private AlarmSetting alarmSetting;

    public UserEntity toEntity(){
        return UserEntity.builder()
                .id(id)
                .username(username)
                .password(password)
                .studentNumber(studentNumber)
                .CBNUpasword(CBNUpasword)
                .nickname(nickname)
                .alarmSetting(alarmSetting)
                .build();
    }

    @Builder
    public UserDto(long id, String username, String password, String studentNumber,
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
