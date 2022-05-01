import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class TestDemo {

    @Test
    public void testAdd(){
        ApplicationContext context = new FileSystemXmlApplicationContext("/src/bean1.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user);
        user.add();
    }

}
