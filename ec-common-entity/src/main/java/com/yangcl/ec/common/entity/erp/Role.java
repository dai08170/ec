package com.yangcl.ec.common.entity.erp;

import com.yangcl.ec.common.entity.BaseEntity;

import java.util.List;

/**
 * 角色实体类
 */
public class Role extends BaseEntity {
    private long sysno;
    private String roleNo;
    private String roleName;
    private String roleDesc;
    private List<Permission> permissions;
    private List<User> users;
    private List<Department> departments;

    public long getSysno() {
        return sysno;
    }

    public void setSysno(long sysno) {
        this.sysno = sysno;
    }

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}