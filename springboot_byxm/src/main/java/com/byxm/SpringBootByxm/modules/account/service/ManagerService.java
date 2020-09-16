package com.byxm.SpringBootByxm.modules.account.service;

import com.byxm.SpringBootByxm.modules.account.entity.Managers;

public interface ManagerService {

    Managers getManagerBymName(String name);
}
