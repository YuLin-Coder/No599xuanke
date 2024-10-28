package edu.school.service.impl;

import edu.school.dao.AdminDao;
import edu.school.dao.impl.AdminDaoImpl;
import edu.school.entity.Admin;
import edu.school.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private AdminDao dao=new AdminDaoImpl();

	public Admin login(Admin record) {
		// TODO Auto-generated method stub
		return dao.queryByUsernameAndPassword(record.getUsername(), record.getPassword());
	}

	public int updatePwd(Admin record) {
		// TODO Auto-generated method stub
		return dao.updatePwd(record);
				
	}

}
