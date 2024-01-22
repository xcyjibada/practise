public class SIngleton1 {
    private static SIngleton1 sIngleton1 = new SIngleton1();
    private SIngleton1() {
        System.out.println("创建了一个饿汉单例.....");
    }
    public static SIngleton1 getInstance(){
        return sIngleton1;
    }
}
