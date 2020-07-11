package br.com.danielsan.jvm;

import br.com.danielsan.data.Platform;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Platform().getName());

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
