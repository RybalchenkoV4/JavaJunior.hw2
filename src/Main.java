import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Class<?> stringClass = String.class;
        Method[] methods = stringClass.getDeclaredMethods();
        Set<String> methodNames = new HashSet<>();
        for (Method elem : methods) {
            methodNames.add(elem.getName());
        }
        for (String elem : methodNames) {
            System.out.println(elem);
        }

    }
}