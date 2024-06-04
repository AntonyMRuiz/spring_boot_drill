package com.riwi.spring_boot_drill.infrastructure.helpers.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.riwi.spring_boot_drill.api.dtos.request.UserRequest;
import com.riwi.spring_boot_drill.api.dtos.response.UserResponse;
import com.riwi.spring_boot_drill.domain.entities.UserEntity;
import com.riwi.spring_boot_drill.domain.repositories.UserRepository;
import com.riwi.spring_boot_drill.infrastructure.helpers.abstract_mappers.IUserMapper;
import com.riwi.spring_boot_drill.utils.enums.RoleUser;
import com.riwi.spring_boot_drill.utils.exceptions.BadRequestException;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class UserMapper implements IUserMapper{

    @Autowired
    private final UserRepository userRepository;

    @Override
    public UserEntity requestToEntity(UserRequest request) {

        UserEntity email = this.userRepository.findByEmail(request.getEmail());
        UserEntity username = this.userRepository.findByUsername(request.getUsername());
        
        if ( email != null && !email.getEmail().equalsIgnoreCase(request.getEmail())) {
            throw new BadRequestException("E-mail is already registered"+ email.getEmail());
        };

        if ( username != null && !username.getUsername().equals(request.getUsername())) {
            throw new BadRequestException("Username is already registered");
        };

        return UserEntity.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .email(request.getEmail())
                .fullName(request.getFullName())
                .role(RoleUser.valueOf(request.getRole()))
                .build();
    }

    @Override
    public UserResponse entityToResponse(UserEntity entity) {
        return UserResponse.builder()
                .id(entity.getId())
                .fullName(entity.getFullName())
                .role(entity.getRole())
                .email(entity.getEmail())
                .build();
    }
    
}
