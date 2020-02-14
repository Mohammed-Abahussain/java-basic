package javaTC.examples.basic;

abstract class Calculater implements Calculatable {
    //Regular method
    void PromptUser(){
        System.out.println("Console message from Abstract");
    }
    //Abstraction of what a calculator does
    abstract boolean determinedRange(int  number);

}

