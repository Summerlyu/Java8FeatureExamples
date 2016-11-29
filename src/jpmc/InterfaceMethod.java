package jpmc;

/**
 * Created by lvdandan on 29/11/2016.
 * Normal interface cannot have any method body
 * With using default and static keyword, we can create interfaces with implementations
 */
public interface InterfaceMethod {
    void method1(String st);

    default void log(String str) {
        System.out.println("default log: " + str);
    }

    static void print(String str) {
        System.out.println("static print: " + str);
    }

}
