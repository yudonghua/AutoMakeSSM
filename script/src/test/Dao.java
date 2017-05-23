package test;


import com.dao.GoodsDao;
import com.entity.Goods;
import com.util.ApplicationDataBaseInit;
import com.util.DBEnvironmentListener;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Dao {
    private ClassPathXmlApplicationContext context;
    private GoodsDao goodsDao;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("spring_config/applicationContext.xml");
        goodsDao = (GoodsDao)context.getBean("goodsDao");
    }


    //INSERT INTO USER_INFO VALUES(1,'admin','123','1986-11-24',1,20);
    @Test
    public void testGetOneCustomer(){
//		new ApplicationDataBaseInit().contextInitialized(null);
//		 Customer customer = new Customer("a","test","123","das");
//		 customerDao.insertCustomer(customer);
//		Order order = new Order("id","gid","","customer","address","status","name",20,200);
//		orderDao.insertOrder(order);
        Goods goods = new Goods("das","das","dsa","da");
        goodsDao.insertGoods(goods);
        System.out.println(goodsDao.getAllGoods(null));
//		System.out.println(orderDao.getBOrder("aaa"));
    }

}
