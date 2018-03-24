package com.qtztest.cn;

import com.qtztest.dao.IQtzDao;
import com.qtztest.model.Qtz;

public class SpringQtz {
	private static int counter = 0;
	private IQtzDao iQtzDao;
	
    public IQtzDao getiQtzDao() {
		return iQtzDao;
	}

	public void setiQtzDao(IQtzDao iQtzDao) {
		this.iQtzDao = iQtzDao;
	}

	protected void execute()  {  
        System.out.println("开始执行定时任务:");
        Qtz qtz = new Qtz();
		qtz.setRandom("zhangsan");
		qtz.setAddtime(System.currentTimeMillis()+"");
		iQtzDao.addQtz(qtz);
    }  
}
