package br.com.somejava8examples.commons;

import java.util.List;

public abstract class CommonsService<E extends BaseEntity> {

    protected void beforePrint(List<E> list) {
        System.out.println("Before...");
        print(list);
    }

    protected void afterPrint(List<E> list) {
        System.out.println("After...");
        print(list);
    }

    protected void print(List<E> list) {
        list.forEach(item -> System.out.println(item));
    }

}
