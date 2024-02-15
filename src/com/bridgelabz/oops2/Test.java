package com.bridgelabz.oops2;
interface A<T>
{
    public void m1(T t);
}
public class Test <T> implements A<T>{
    public void m1(T t)
    {
        System.out.println("m1-Test");
    }
    public static void main(String[] args)
    {

        Test<Integer> t1 = new Test<Integer>();
        t1.m1(25);

        Test<String> t2 = new Test<String>();
        t2.m1("John");
    }

}
