package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Instructor;

public interface BaseDao {
	void addCategory(Category category);
	void addCourse(Course course);
	void addInstructor(Instructor instructor);

}
