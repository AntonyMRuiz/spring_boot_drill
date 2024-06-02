package com.riwi.spring_boot_drill.api.dtos.response;

import java.time.LocalDateTime;

import com.riwi.spring_boot_drill.domain.entities.Course;
import com.riwi.spring_boot_drill.domain.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponse {
    private Long id;
    private UserEntity senderId;
    private UserEntity receiverId;
    private Course courseId;
    private String content;
    private LocalDateTime date;
}
