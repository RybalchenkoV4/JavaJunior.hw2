import java.lang.reflect.Constructor;

public class ObjactCreater {
    public static <T> T createObj(Class<T> tClass) {
        try {
            Constructor<T> constructor = tClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            T obj = constructor.newInstance();
            RandomDateAnnProcessor.processAnnotation(obj);
            return obj;
        } catch (Exception e) {
            System.err.println("Nothing succeeded: " + e.getMessage());
            return null; // или throw new IllegalStateException
        }
    }
}
