public class Singleton3 {

        private Singleton3() {
            System.out.println("创建一个内部类单例。。。。");
        }

        private static class SingletonHolder {
            private static final Singleton3 instance = new Singleton3();
        }

        public static Singleton3 getInstance() {
            return SingletonHolder.instance;
        }


}
