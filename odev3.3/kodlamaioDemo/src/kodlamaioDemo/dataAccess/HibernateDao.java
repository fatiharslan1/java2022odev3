package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Instructor;

public class HibernateDao implements BaseDao{

	@Override
	public void addCategory(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi: " + category.getName());
		
	}

	@Override
	public void addCourse(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi: " + course.getName());
		
	}

	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi: " + instructor.getName());
		
	}

}
