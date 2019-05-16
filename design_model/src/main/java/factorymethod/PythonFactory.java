package factorymethod;

/**
 * @ClassName PythonFactory
 * @Author 赵锟
 * @Date 2019/5/16 16:55
 * @Version 1.0
 **/
public class PythonFactory implements IFactory {
    public void creat() {
        System.out.println("这是python工厂");
    }
}
