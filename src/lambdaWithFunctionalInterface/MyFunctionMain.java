package lambdaWithFunctionalInterface;

public class MyFunctionMain {
    public static void main(String[] args) {
        MyFunctionalInterface mi=(x,y)->x+y;

        System.out.println(mi.sum(5,6));
    }
}
