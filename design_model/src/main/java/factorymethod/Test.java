package factorymethod;

/**
 * @ClassName Test
 * @Author 赵锟
 * @Date 2019/5/16 16:55
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        IFactory factory=new JavaFactory();
        factory.creat();
    }
}
