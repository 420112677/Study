package simplefactory;

/**
 * @ClassName GoodsFactory
 * @Author 赵锟
 * @Date 2019/5/16 16:35
 * @Version 1.0
 **/
public class GoodsFactory {

//    public  GoodsInterface create(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        if(name!=null && !"".equals(name)){
//            return (GoodsInterface)Class.forName(name).newInstance();
//        }
//    return  null;
//    }
   public  GoodsInterface create(Class<? extends GoodsInterface> clazz){

       try {
           if (clazz!=null) {
               return (GoodsInterface) clazz.newInstance();
           }
       } catch (InstantiationException e) {
           e.printStackTrace();
       } catch (IllegalAccessException e) {
           e.printStackTrace();
       }
       return  null;
   }


    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        new GoodsFactory().create(Goods1.class).printName();
    }
}
