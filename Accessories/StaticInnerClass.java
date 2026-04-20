package com.innerclass_;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer50 outer50 = new Outer50();
        outer50.show3();
        System.out.println("=======");
        Outer50.Inner50 inner50 = new Outer50.Inner50();
        inner50.method();
        System.out.println("=======");
        Outer50.Inner50 inner51 = outer50.getInner50();
        inner51.method();
        System.out.println("=======");
        Outer50.Inner50 inner52 = outer50.getInner50();
        inner52.method();
    }
}

class Outer50 {
    private int n1 = 10;
    int n2 = 20;
    public static int n3 = 30;

    public void show1() {
        System.out.println("show1");
    }

    public static void show2() {
        System.out.println("show2");
    }

    public static class Inner50 {
        private int n3 = 11;

        public void method() {
            System.out.println("Inner50");
            System.out.println(n3);
//            System.out.println(n2); //error //静态内部类不能访问非静态属性
//            show1();  //error //静态内部类不能访问非静态属性
            show2();
            System.out.println(n3);
            System.out.println(Outer50.n3);
        }
    }

    public void show3() {
        Inner50 inner50 = new Inner50();
        inner50.method();
    }

    public Inner50 getInner50() {
        return new Inner50();
    }

    public static Inner50 getInner51() {
        return new Inner50();
    }
}