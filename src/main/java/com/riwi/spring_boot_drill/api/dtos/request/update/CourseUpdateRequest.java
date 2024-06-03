package com.riwi.spring_boot_drill.api.dtos.request.update;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseUpdateRequest {
    @NotBlank(message = "Name is required")
    private String name;
    
    private String description;
}
