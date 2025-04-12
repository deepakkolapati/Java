package com.deepak.sealed;

sealed class A permits B,C{

}

final class B extends A{

}

non-sealed class C extends A{

}

sealed interface D permits E{

}

non-sealed interface  E extends D {

}
public class Main {
    public static void main(String[] args) {

    }

}
