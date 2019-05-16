package factorymethod;

import com.sun.javafx.runtime.SystemProperties;

/**
 * @ClassName JavaFactory
 * @Author 赵锟
 * @Date 2019/5/16 16:54
 * @Version 1.0
 **/
public class JavaFactory implements IFactory {
    public void creat() {
        System.out.println("这是java工厂");
    }
}
