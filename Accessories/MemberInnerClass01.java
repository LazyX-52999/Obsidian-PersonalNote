package com.innerclass_;

public class MemberInnerClass01 {
    public static void main(String[] args) {

        Outer40 outer40 = new Outer40();
        outer40.show2();
        System.out.println("==========");
        //第一种:把new Inner40()当作outer40的成员来看
        Outer40.Inner40 inner40 = outer40.new Inner40();
        inner40.method();
        System.out.println("==========");
        //第二种:在Outer40类中写一个方法直接返回成员内部类这个对象
        Outer40.Inner40 inner40Instance = outer40.getInner40();
        inner40Instance.method();
    }
}


class Outer40 {
    private int n1 = 10;
    int n2 = 20;

    public void show1() {
        System.out.println("show1");
    }

    public class Inner40 {
        private int n1 = 11;
        public void method() {
            System.out.println(n1);
            System.out.println(n2);
            show1();

            System.out.println(Outer40.this.n1);
        }
    }

    public void show2() {
        Inner40 inner40 = new Inner40();
        inner40.method();
    }

    public Inner40 getInner40() {
        return new Inner40();
    }
}

