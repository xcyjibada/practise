public class Overloading {
    public void T(int i){
        System.out.println("方法的重载123");
    }
    public String T(int i,int j){
        String s = "方法的重载456";
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.T(1);
        o.T(1,2);
    }

}
