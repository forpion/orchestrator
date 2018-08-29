package example;

import java.lang.reflect.Field;

public class Orchestrator {

    public static class Order{
        String name;
    }

    public void testOrder(){
        Class<?> clazz=Order.class;
        for(Field field: clazz.getDeclaredFields()){
            System.out.println(">>>>>>>>>>>>>>>>>>> "+field.getName());
        }
    }

    public static void main(String[] args) {
        Orchestrator orchestrator=new Orchestrator();
        orchestrator.testOrder();
    }
}
