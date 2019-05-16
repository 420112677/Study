package asbectfactory;

/**
 * @ClassName AnimalFactory
 * @Author 赵锟
 * @Date 2019/5/16 17:10
 * @Version 1.0
 **/
public class AnimalFactory implements IFactory {
    public IGoodsBody creatBody() {
        return new AnimalBody();
    }

    public IGoodsHead creatHead() {
        return new AnimalHead();
    }
}
