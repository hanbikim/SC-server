package com.togivemeasocker.scserver.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    private Long comment_id;

    private boolean commentIsAnonymous;

    private String commentContent;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime commentWrittenDate;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;
}
