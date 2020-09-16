package com.byxm.SpringBootByxm.modules.account.service.impl;

import com.byxm.SpringBootByxm.modules.account.entity.Managers;
import com.byxm.SpringBootByxm.modules.account.mapper.ManagerMapper;
import com.byxm.SpringBootByxm.modules.account.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Managers getManagerBymName(String name) {
        return managerMapper.getManagerBymName(name);
    }
}
