package javaTC.examples.basic;

public class Main {
    public static void main(String[] args) {
        Addition AddOBJ=new Addition();
        AddOBJ.setGreaterThan(1);
        AddOBJ.setLessThan(10);
        AddOBJ.setNumber(6);
        int superNumber=AddOBJ.getNumber();


        //Passing to constructor upon object instantiation.

        PrintResults firstPROBJ=new PrintResults(5);
        firstPROBJ.PromptUser(superNumber,firstPROBJ.addedNumber);    
        PrintResults SecondePROBJ=new PrintResults(5);
        SecondePROBJ.PromptUser(superNumber,SecondePROBJ.addedNumber);





    }
}

