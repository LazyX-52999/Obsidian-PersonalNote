package com.innerclass_;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer30 outer30 = new Outer30();
        outer30.method();
    }
}

class A {
    private int a1 = 10;
    int a2 = 20;

    public void show1() {
        System.out.println("show1");
    }

    private void show2() {
        System.out.println("show2");
    }

}

class Outer30 {
    private int n1 = 30;
    int n2 = 40;

    public void show3() {
        System.out.println("show3");
    }

    public void method() {
        System.out.println("method");

        new A() {

            private int n1 = 33;

            @Override
            public void show1() {
                System.out.println("第一种匿名内部类重写show1");

                System.out.println(n1);
                System.out.println(n2);
//                System.out.println(a1); //不能访问外部其他类中私有的属性
                System.out.println(a2);

                show3();
//                show2();    //不能访问外部其他类中私有的方法

                System.out.println(n1);
                System.out.println(Outer30.this.n1);
            }
        }.show1();

        A a = new A() {
            @Override
            public void show1() {
                System.out.println("第二种匿名内部类重写show1");
            }
        };
        a.show1();


    }
}