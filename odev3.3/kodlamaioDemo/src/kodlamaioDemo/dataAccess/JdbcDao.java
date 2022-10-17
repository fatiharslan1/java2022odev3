package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Instructor;

public class JdbcDao implements BaseDao{

	@Override
	public void addCategory(Category category) {
		System.out.println("JDBC ile veritabanına eklendi: "+ category.getName() );
		
	}

	@Override
	public void addCourse(Course course) {
		System.out.println("JDBC ile veritabanına eklendi: " + course.getName() );
		
	}

	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println("JDBC ile veritabanına eklendi: "+ instructor.getName() );
		
	}

}
