package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Example{
    private int data=10;

    void setData(int val){
        data = val;
    }

    int getData(){
        return data;
    }

}
public class Ref {
    public static void print(){
        try {
            Class<?> clz = Class.forName("reflect.Example");
            Constructor<?> con = clz.getDeclaredConstructor();
            con.setAccessible(true);
            Object newObj = con.newInstance();
            Method setData = clz.getDeclaredMethod("setData", int.class);
            Method getData = clz.getDeclaredMethod("getData");
            setData.invoke(newObj,123);
     ;       System.out.println(getData.invoke(newObj));
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
