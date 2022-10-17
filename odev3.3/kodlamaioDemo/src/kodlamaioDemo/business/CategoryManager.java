package kodlamaioDemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.BaseDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager extends BaseManager{
	public CategoryManager(BaseDao baseDao, Logger[] loggers) {
		super(baseDao, loggers);
		
	}
	//BaseDao baseDao;
	//Logger[] loggers;
	
	List<Category> categories = new ArrayList<>();
	
	public void add(Category category) throws Exception{
		for(Category category1 : categories) {
			if(category1.getName().equals(category.getName())) {
				throw new Exception("kurs ismi tekrar edemez");
			}
		}
		categories.add(category);
		baseDao.addCategory(category);
		
		for(Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	

}
