
    public class GenerictClass<T> {

        private T t;

        public void add(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }

        public static void main(String[] args) {
            GenerictClass<Integer> integerGenerictClass = new GenerictClass<Integer>();
            GenerictClass<String> stringGenerictClass = new GenerictClass<String>();

            integerGenerictClass.add(new Integer(10));
            stringGenerictClass.add(new String("菜鸟教程"));

            System.out.printf("整型值为 :%d\n\n", integerGenerictClass.get());
            System.out.printf("字符串为 :%s\n", stringGenerictClass.get());
        }
    }

