package kodlamaioDemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.BaseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager extends BaseManager{
	public CourseManager(BaseDao baseDao, Logger[] loggers) {
		super(baseDao, loggers);
		
	}
	/*public void add() {
		System.out.println("course eklendi");
	}
	public void delete(Course course) {
		System.out.println("course silindi");
	}*/
	
	List<Course> courses = new ArrayList<>();
	public void add(Course course) throws Exception{
	//iş kuralları
		
		for(Course course1 : courses) {
			if(course1.getName().equals(course.getName())) {
				throw new Exception("bu isimde bir kurs zaten mevxut");
			}
			
		}
		if(course.getCoursePrice()<0) {
			throw new Exception("Course fiyatı sıfırdan küçük olamaz");
		}
		courses.add(course);
		baseDao.addCourse(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
	

}
