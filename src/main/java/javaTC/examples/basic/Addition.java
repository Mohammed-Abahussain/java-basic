package javaTC.examples.basic;

public class Addition extends Calculater {
    private int greaterThan,lessThan, number;
    public int a(){
        return 1;
    }
    public int a(int x){
        return 1;
    }


    public int getGreaterThan() {
        return greaterThan;
    }

    public void setGreaterThan(int greaterThan) {
        this.greaterThan = greaterThan;
    }

    public int getLessThan() {
        return lessThan;
    }

    public void setLessThan(int lessThan) {
        this.lessThan = lessThan;
    }
//Implementing the abstract class's abstract method
    @Override
   public boolean determinedRange(int number) {

            if(!isCalculable(greaterThan,lessThan,number)) {
                return false;

            }

            else {
                return true;
            }
        }





    public int getNumber() {

        return number;
    }
// Setter will compute if the number is between the provided range with a ternary true status. Otherwise, it will terminate the program.
                                                                              // Check "isCalculable" for more info on the implantation.
    public void setNumber(int number) {

        if(isCalculable(getGreaterThan(),getLessThan(), number)){
            this.number = number;
        }
        else {
            System.out.println("Ohhhh! try different number.");
            System.exit(-1);
            //Unsuccessful termination.

        }
    }
    public boolean isCalculable(int greaterThan,int lessThan,int  comparedNumber ){

        return lessThan>greaterThan ? comparedNumber>greaterThan && comparedNumber<lessThan : comparedNumber<greaterThan && comparedNumber>lessThan;




    }
}

