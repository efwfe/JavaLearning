package reflect;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student{
    private String name;
    private int age;

    Student(){
        name = "default";
        age = 0;
    }
    Student(String na, int ag){
        name = na;
        age = ag;
    }

    void show(){
        System.out.println("Student" + "--"+ name + "----" + age);
    }
}

public class Ref2 {

    public static void pri(){
        String s = "hello world";

        try {
            Class<?> o = Class.forName("java.lang.String");
            Field v = o.getDeclaredField("value");
            v.setAccessible(true);
            v.set(s, "this si code".toCharArray());

            // student
            Student s1 = new Student();
            s1.show();
            // reset private property
            Class<?> clz = Class.forName("reflect.Student");
            Field f = clz.getDeclaredField("name");
            f.setAccessible(true);
            f.set(s1,"injected");
            // invoke method
            Method m = clz.getDeclaredMethod("show");
            m.invoke(s1);

        }catch (Exception e){
            System.out.println(e);
        }


        System.out.println("begin");
        System.out.println(s);
        System.out.println("end");
    }
}
