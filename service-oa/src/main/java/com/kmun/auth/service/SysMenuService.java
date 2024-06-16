package com.kmun.auth.service;

import com.kmun.model.system.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kmun.vo.AssignMenuVo;
import com.kmun.vo.RouterVo;

import java.util.List;

public interface SysMenuService extends IService<SysMenu> {

    /**
     * 菜单树形数据
     * @return
     */

    List<SysMenu> findNodes();
    /**
     * 根据角色获取授权权限数据
     * @return
     */
    List<SysMenu> findSysMenuByRoleId(Long roleId);
    List<RouterVo> findUserMenuList(Long userId);
    /**
     * 获取用户按钮权限
     * @param userId
     * @return
     */
    List<String> findUserPermsList(Long userId);

    /**
     * 保存角色权限
     * @param  assignMenuVo
     */
    void doAssign(AssignMenuVo assignMenuVo);
    /**
     * 获取用户菜单
     * @param userId
     * @return
     */


}