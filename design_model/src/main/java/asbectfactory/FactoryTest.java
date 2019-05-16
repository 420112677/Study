package asbectfactory;

/**
 * @ClassName FactoryTest
 * @Author 赵锟
 * @Date 2019/5/16 17:14
 * @Version 1.0
 **/
public class FactoryTest {
    public static void main(String[] args) {
        IFactory factory=new AnimalFactory();
        factory.creatBody().printName();
    }
}
