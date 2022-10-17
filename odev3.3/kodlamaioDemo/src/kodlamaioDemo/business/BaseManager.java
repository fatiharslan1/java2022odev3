package kodlamaioDemo.business;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.BaseDao;


public class BaseManager {
	 BaseDao baseDao;
	 Logger[] loggers;
	 
	 public BaseManager(BaseDao baseDao, Logger[] loggers) {
		 this.baseDao = baseDao;
		 this.loggers = loggers;
	 }
	
	public void list() {
		System.out.println("listelendi");
	}
	public void add() {
		System.out.println("eklendi");
	}
	public void delete() {
		System.out.println("silindi");
	}
	public void update() {
		System.out.println("güncellendi");
	}

	
}
