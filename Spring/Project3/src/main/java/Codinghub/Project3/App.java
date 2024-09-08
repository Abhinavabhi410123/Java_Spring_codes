package Codinghub.Project3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ct = new ClassPathXmlApplicationContext("com/codinghub1/Coding.xml");
//      Rbi rbi = ct.getBean("Sbh",Rbi.class);
//       rbi.mTransactions();
    }
}
