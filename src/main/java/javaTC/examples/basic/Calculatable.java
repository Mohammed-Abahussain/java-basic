package javaTC.examples.basic;
import java.time.Instant;

//the interface is Visible to the package

interface Calculatable {
     Instant currTimeStamp = Instant.now();

    boolean isCalculable(int x, int y, int z);
    //defenderMethod
    default void defenderMethod(){
        System.out.println("\t\t\t\t\t\t"+this.currTimeStamp);
    }


}
