package com.riwi.spring_boot_drill.api.dtos.response;

import com.riwi.spring_boot_drill.domain.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CouseReponse {
    private Long id;
    private String name;
    private String description;
    private UserEntity instructorId;
}
