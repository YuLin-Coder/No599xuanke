package edu.school.service.impl;

import edu.school.dao.CourseDao;
import edu.school.dao.impl.CourseDaoImpl;
import edu.school.entity.Course;
import edu.school.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    private CourseDao dao=new CourseDaoImpl();
    
    public int addCourse(Course record) {
        return dao.save(record);
    }

    
    public Course queryById(Integer id) {
        return dao.query(id);
    }

    
    public int update(Course record) {
        return dao.update(record);
    }

    public List<Course> getPage(int pageNum, int pageSize) {
        return dao.getPage(pageNum,pageSize);
    }

   
    public List<Course> findByMap(String cno,String cname) {
        return dao.findByMap(cno,cname);
    }

    
    public int queryCount() {
        return dao.queryCount();
    }

   
    public int deleteById(Integer id) {
        return dao.delete(id);
    }


	public List<Course> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
}
