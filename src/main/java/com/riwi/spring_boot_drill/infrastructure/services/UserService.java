package com.riwi.spring_boot_drill.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.spring_boot_drill.api.dtos.request.UserRequest;
import com.riwi.spring_boot_drill.api.dtos.response.UserResponse;
import com.riwi.spring_boot_drill.domain.entities.UserEntity;
import com.riwi.spring_boot_drill.domain.repositories.UserRepository;
import com.riwi.spring_boot_drill.infrastructure.abstract_services.IUserService;
import com.riwi.spring_boot_drill.infrastructure.helpers.ServiceHelper;
import com.riwi.spring_boot_drill.infrastructure.helpers.abstract_mappers.IUserMapper;
import com.riwi.spring_boot_drill.utils.enums.RoleUser;
import com.riwi.spring_boot_drill.utils.exceptions.BadRoleException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService{
    
    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private final IUserMapper userMapper;

    @Override
    public UserResponse create(UserRequest request) {

        if (request.getRole() == null) {
            throw new BadRoleException("Role is required");
        }

        try {
            RoleUser.valueOf(request.getRole());
        } catch (Exception e) {
            throw new BadRoleException("Role is invalid");
        }

        UserEntity user = this.userMapper.requestToEntity(request);
        return this.userMapper.entityToResponse(this.userRepository.save(user));
    }

    @Override
    public UserResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Page<UserResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public UserResponse update(Long id, UserRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    
}
