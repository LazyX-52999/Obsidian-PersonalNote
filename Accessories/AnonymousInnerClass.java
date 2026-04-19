package com.innerclass_;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer20 outer20 = new Outer20();
        outer20.method();
    }
}

class Outer20 {
    private int n1 = 10;
    public void method() {
        System.out.println("method");

        //基于接口的匿名内部类
        //如何实现接口IA的cry方法?

        //传统方法 - 写一个实现IA接口的类Tiger,再创建对象来调用Tiger类中的cry方法
        IA tiger = new Tiger();
        tiger.cry();

        //匿名内部类的方法 -
        IA tiger2 = new Tiger() {
            @Override
            public void cry() {
                System.out.println("cry匿名内部类的方法");
            }
        };
        /*
        等价于：
        class Outer20$1 implements IA {
            @Override
            public void cry() {
                System.out.println("cry匿名内部类的方法");
            }
        }

        Outer20$1是系统分配的类名，在用完一次之后就没有了。即：匿名内部类使用一次后就不能再使用了
         */
        tiger2.cry();
    }
}

interface IA {
    void cry();
}

class Tiger implements IA {
    public void cry() {
        System.out.println("cry方法");
    }
}

class Father {
    public Father(String name) {
        super();
    }
    public void test() {
        System.out.println("test");
    }
}