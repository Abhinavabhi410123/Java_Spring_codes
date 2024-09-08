package Codinghub.JDBC_first;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Demo d = new Demo();
        d.setFULLNAME("abhi");
        d.setROLL_NO(1);
        d.setS_NO(10);
        DemoRepo.m1(d);
//        DemoRepo dr = new DemoRepo();
//        dr.m1(d);
    }
}
