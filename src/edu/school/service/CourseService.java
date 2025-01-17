package edu.school.service;

import edu.school.entity.Course;

import java.util.List;

public interface CourseService {

    public int addCourse(Course record);//保存课程信息
    public Course queryById(Integer id);//根据id更改
    public int update(Course record);//更改
    public List<Course> getPage(int pageNum, int pageSize);
    public List<Course> findByMap(String cno,String cname);//条件查询
    public List<Course> selectAll();//查询所有课程
    public int queryCount();//统计数量
    public int deleteById(Integer id);//根据id删除
}
