package com.bridgelabz.oops2;
interface GFG {
    void learnCoding();
    void learnProgrammingLanguage();
    void contribute();
}

abstract class Student implements GFG {
    public void learnCoding()
    {
        System.out.println(
                "Let's make coding a habit with GFG");
    }
    public void learnProgrammingLanguage()
    {
        System.out.println(
                "Let's master all fundamentals of java with the help of GFG");
    }
}
class GEEK extends Student {
    public void contribute()
    {
        System.out.println(
                "Now let's help others by contributing in GFG");
    }
}
public class AbstractUsingInterface {
    public static void main(String[] args)
    {
        // New GEEK object is created
        GEEK gfgStudent = new GEEK();
        gfgStudent.learnCoding();
        gfgStudent.learnProgrammingLanguage();
        gfgStudent.contribute();
    }
}
