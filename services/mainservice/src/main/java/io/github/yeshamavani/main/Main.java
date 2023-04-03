package io.github.yeshamavani.main;

import io.github.yeshamavani.core.Core;

public class Main {

    public static void main(String[] args) {
        System.out.println("In main service");
        String s = Core.getHelloMessage();
        System.out.println(s);

    }

}
