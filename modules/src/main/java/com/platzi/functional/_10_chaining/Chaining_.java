package com.platzi.functional._10_chaining;

public class Chaining_ {
    public static void main(String[] args) {
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("Hi")
            .append("student")
            .append("of")
            .append("platzi");

        Chainer chainer = new Chainer();
        chainer.sayHi().sayBye();

        Chainer chainer2 = chainer.sayHi();
        Chainer chainer3 = chainer2.sayBye();

    }

    static class Chainer{
        public Chainer sayHi(){
            System.out.println("Hi");
            return this;
        }
        public Chainer sayBye(){
            System.out.println("Bye");
            return this;
        }

    }

}
