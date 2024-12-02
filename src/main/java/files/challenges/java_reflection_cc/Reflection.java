package files.challenges.java_reflection_cc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class<?> stringClass = "".getClass();
        Method toUpperCase = stringClass.getMethod("toUpperCase");
        System.out.println(toUpperCase.invoke("Case Western Reserve University"));
        Method substring = stringClass.getMethod("substring", new Class[] {int.class, int.class});
        System.out.println(substring.invoke("Case Western Reserve University", 5, 12));

    }
}
