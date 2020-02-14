package javaTC.examples.basic;

public class PrintResults extends Addition {
    //Starts with Zero once the class is loaded the first time
    static int calculationCounter;
    static int x =1;
    int addedNumber;
    static{
         x=7;

    }
    PrintResults(){
        int addedNumber;

    }
    PrintResults(int addedNumber){
        this.addedNumber=addedNumber;



    }
    static {
        x=4;

    }

    void PromptUser(int superNumber,int addedNumber){

        System.out.println("------------------------------------------------------------\n\t\ttime stamp provided by the interface's final variable and defender method" );
       super.defenderMethod();
        System.out.printf("Adding Number polymorphically\n\t%d\t+\t%d\t=\t%d\n",superNumber,addedNumber,(superNumber+addedNumber));
        super.PromptUser();
        System.out.printf("\n\n Used \"super\" to fetch the chained method from the interface "+
                "\ncalculation Counter=%d\n",calculationCounter);

        //Increment the counter shared by the objects.
        calculationCounter++;



    }



}
