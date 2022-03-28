package com.togivemeasocker.scserver.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class Announcement {
    @Id
    private Long announcement_id;

    @Enumerated(EnumType.ORDINAL)
    private AnnouncementCategory announcementCategory;

    private String announcementTitle;

    private String announcementContent;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime announcementWrittenDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime announcementDueDate;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject_id;
}
