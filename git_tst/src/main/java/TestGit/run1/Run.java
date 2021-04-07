package java.TestGit.run1;

import java.TestGit.run2.Print1;

public class Run {

    public static void main(String[] args) {
        Print1 print1 = new Print1();
        print1.text1();
        show();
        print1.text2();
    }

    public static void show(){
        System.out.println(" I'm working here... he-he, I am method show ");
    }
}
