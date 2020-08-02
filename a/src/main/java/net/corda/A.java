package net.corda;

import java.net.URL;


class A {
    public static void main(String[] args) {
        ClassLoader classLoader = A.class.getClassLoader();
        URL url = classLoader.getResource("co/paralleluniverse/fibers/Suspendable.class");
        System.out.println(url);
    }
}