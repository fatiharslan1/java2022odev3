package kodlamaioDemo.business;



import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.BaseDao;
import kodlamaioDemo.entities.Instructor;

public class InstructorManager extends BaseManager {
	public InstructorManager(BaseDao baseDao, Logger[] loggers) {
		super(baseDao, loggers);
		
	}

	
	public void add(Instructor instructor) {
		System.out.println("eğitmen eklendi");
		
		for(Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}

}
