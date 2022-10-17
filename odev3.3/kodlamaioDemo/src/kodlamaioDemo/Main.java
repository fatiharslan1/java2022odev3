package kodlamaioDemo;

import java.util.List;


import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.InstructorManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.MailLogger;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.HibernateDao;
import kodlamaioDemo.dataAccess.JdbcDao;
import kodlamaioDemo.dataAccess.BaseDao;
import kodlamaioDemo.entities.Base;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Instructor;

public class Main {

	public static void main(String[] args)  throws Exception{
		
	
		
		
		Category category = new Category();
		category.setId(1);
		category.setName("Programlama");
		

		
		Course course = new Course();
		course.setId(22);
		course.setName("Java kursu");
		course.setCoursePrice(100);
		course.setCourseInstructor("Engin Demiroğ");
		course.setCourseDescription("2022 java kursu");
		
		Instructor instructor = new Instructor();
		instructor.setId(45);
		instructor.setName("Engin Demiroğ");
		instructor.setSalary(20000);
		
		Base[] bases = {
				category, course, instructor
		};
		for(Base base : bases) {
			System.out.println(base.getId());
			System.out.println(base.getName());
			
		}
		
		Logger[] loggers = {new DatabaseLogger(), new MailLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
		CategoryManager categoryManager2 = new CategoryManager(new JdbcDao(), loggers);
		categoryManager.add(category);
		
		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
		CourseManager courseManager2 = new CourseManager(new JdbcDao(), loggers);
		courseManager2.add(course);
		
		InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggers);
		InstructorManager instructorManager2 = new InstructorManager(new JdbcDao(), loggers);
		instructorManager.add(instructor);;
		
		
		
		

	}

}
