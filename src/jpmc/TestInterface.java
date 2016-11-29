package jpmc;

/**
 * Created by lvdandan on 29/11/2016.
 */
public class TestInterface implements InterfaceMethod {
    @Override
    public void method1(String st) {

    }

    @Override
    public void log(String str) {
        System.out.println("My class login:: " + str);
        InterfaceMethod.print("abc");
    }
}
