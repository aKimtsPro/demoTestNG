package bstorm.akimt.demoTestNG;

import java.util.function.Consumer;

public class ClassAnon {

    public static void main(String[] args) {

        Consumer<Object> objectAnon = new Consumer<Object>() {
            @Override
            public void accept(Object o) {
                System.out.println("mon objet : " + o);
            }
        };

        objectAnon = (o) -> System.out.println("mon objet : " + o);

        objectAnon.accept(objectAnon);


    }
}
