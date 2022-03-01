package com.revature.main;
import com.revature.secondmain.Person2;

import static com.revature.secondmain.Person2.MethodB;

public class person {
    public static void MethodA(){
        System.out.println("method A running");

    }

    public static void main(String[] args){
        System.out.println("main method");
        MethodA();
        MethodB();
    }
}
