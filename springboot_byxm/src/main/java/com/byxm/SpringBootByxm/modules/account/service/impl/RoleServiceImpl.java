package com.byxm.SpringBootByxm.modules.account.service.impl;

import com.byxm.SpringBootByxm.modules.account.entity.Role;
import com.byxm.SpringBootByxm.modules.account.mapper.RoleMapper;
import com.byxm.SpringBootByxm.modules.account.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role getRoleByStudentsId(int sId) {
        return roleMapper.getRoleByStudentsId(sId);
    }
}
