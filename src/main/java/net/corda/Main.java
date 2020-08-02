package net.corda;

import java.net.URL;


class Main {
    public static void main(String[] args) {
        ClassLoader classLoader = Foo.class.getClassLoader();
        URL url = classLoader.getResource("co/paralleluniverse/fibers/Suspendable.class");
        System.out.println(url);
    }
}