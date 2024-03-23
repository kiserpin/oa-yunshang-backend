package com.kmun.auth;

import com.kmun.auth.mapper.SysRoleMapper;
import com.kmun.auth.service.SysRoleService;
import com.kmun.model.system.SysRole;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class TestMpDemo2 {

    //注入
    @Autowired
    private SysRoleService sysRoleService;

    //查询所有记录
    @Test
    public void getAll() {
        List<SysRole> list = sysRoleService.list();
        System.out.println(list);
    }


    @Test
    public void testSelectList() {
        System.out.println(("----- selectAll method test ------"));
        //UserMapper 中的 selectList() 方法的参数为 MP 内置的条件封装器 Wrapper
        //所以不填写就是无任何条件
        List<SysRole> users = sysRoleService.list();
        users.forEach(System.out::println);
    }
}
