package com.byxm.SpringBootByxm.modules.account.service;

import com.byxm.SpringBootByxm.modules.account.entity.Role;

public interface RoleService {

    Role getRoleByStudentsId(int sId);
}
