public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){
        System.out.println("创建了一个懒汉单例.....");
    }
    public static Singleton2 getInstance(){
        if (instance==null){
            instance = new Singleton2();
            return instance;
        }else {
            return instance;
        }
    }

}
