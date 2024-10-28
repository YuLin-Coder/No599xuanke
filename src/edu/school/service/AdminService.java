package edu.school.service;

import edu.school.entity.Admin;

public interface AdminService {
    public Admin login(Admin record);//管理员登陆
    public int updatePwd(Admin record);//管理员修改密码
}
