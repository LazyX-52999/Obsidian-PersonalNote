package com.innerclass_;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.show3();

        //new Inner10(); //error

    }
}

class Outer10 {
    private int n1 = 10;
    int n2 = 20;
    private void show1() {
        System.out.println("show1");
    }
    public void show2() {
        System.out.println("show2");
    }

    public void show3() {
        final class Inner10 {
            private int n1 = 10;

            public void show4() {
                System.out.println("show4");
                System.out.println(n1);
                System.out.println(Outer10.this.n1);
                System.out.println(n2);
                show1();
                show2();
            }
        }
        Inner10 inner10 = new Inner10();
        inner10.show4();
    }

    {
        class Inner11 {
            public void show6() {
                System.out.println("show6");
                System.out.println(n1);
                System.out.println(n2);
                show1();
                show2();
            }
        }

    }


}