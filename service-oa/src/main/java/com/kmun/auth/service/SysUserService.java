package com.kmun.auth.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.kmun.model.system.SysUser;

import java.util.Map;

public interface SysUserService extends IService<SysUser> {
    void updateStatus(Long id, Integer status);
}