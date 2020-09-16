package com.byxm.SpringBootByxm.modules.account.service.impl;

import com.byxm.SpringBootByxm.modules.account.entity.Teachers;
import com.byxm.SpringBootByxm.modules.account.mapper.TeachersMapper;
import com.byxm.SpringBootByxm.modules.account.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeachersServiceImpl implements TeachersService {
    @Autowired
    private TeachersMapper teachersMapper;

    @Override
    public Teachers getTeachersBytName(String name) {
        return teachersMapper.getTeachersBytName(name);
    }
}
