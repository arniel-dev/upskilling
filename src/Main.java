import excercises.Collection;
import objects.Animals;
import objects.Customer;
import objects.Employee;
import objects.Person;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /* todo add click button*/
       /* byte byteVariable = 127;
        short mediumRangeDecimalVariable = 32767;
        int decimalVariableUpto = 214;
        long largeDecimalVariableFrom = -1l;
        long largeDecimalVariableUpTo = 10000l;
        float numberWithDecimal = 2.3f;
        double veryLargeNumberWithDecimal = 12331.123123;
        boolean trueOrFlase = true;
        char name = '\u0041';
        long intvariable = decimalVariableUpto;
        */
/**
 * PRINT OUT
 */
       /* System.out.println(byteVariable);
        System.out.println(mediumRangeDecimalVariable);
        System.out.println(decimalVariableUpto);
        System.out.println(largeDecimalVariableFrom);
        System.out.println(largeDecimalVariableUpTo);
        System.out.println(numberWithDecimal);
        System.out.println(veryLargeNumberWithDecimal);
        System.out.println(trueOrFlase);
        System.out.println(name);*/
       String firstName = "arniel";
       String lastName="canillo";


        /**object*/
      //  Person person = new Person(firstName,lastName);
        //Person person2 = new Person(firstName,lastName);
      //  person.setFirstName(firstName);
       // String theName = person.getFirstName();
       // System.out.println(theName);

      //  person.setLastName(lastName);
       // String Lname = person.getLastName();
      //  System.out.println(Lname);

       /* person.introduceYourSelf();
        String introMessage = person.introduceYourSelf();
        */

        //System.out.println(Person);
        /*todo to create an animal class with three properties and getters and setters*/
        /*todo public intruduction */
        /*System.out.println(introMessage);*/
        Employee nameEmployee= new Employee();
        nameEmployee.setFirstName(firstName);
        nameEmployee.setLastName(lastName);
        nameEmployee.setDepartment("CITE ");
        nameEmployee.setEmployee_id(345);
        nameEmployee.setPayGrade(1000);
        /*String empFirstName= nameEmployee.getFirstName();
        String empLastName= nameEmployee.getLastName();
        System.out.println(empFirstName);
        System.out.println(empLastName);*/
        nameEmployee.introduceYourSelf();
        nameEmployee.introduceYourSelf();
        String intro = nameEmployee.introduceYourSelf();
        System.out.println(intro);
        System.out.println(nameEmployee.introduceYourSelf());

        /**Animals*/
        Animals describe= new Animals();
        describe.setSpecies("Lion");
        describe.setAge(14);
        describe.setName("The King of the Jungle");

        boolean isManEater = false;


        String sentences= describe.Description();
        System.out.println(sentences);
        System.out.println("Is this species a man eater? "/*+describe.isManEater()*/);
        if (isManEater == true) {
            System.out.println("Yes, it can kill you!!!");
        }
        else {
            System.out.println("No, it is not a man eater.");
        }
        /**
         * customer
         * */
        String customerfName="arnold";
        String customerlName="canillo";

       /* String personFName=customerfName;
        String personLName=customerlName;
        */
        Customer customer= new Customer();
        customer.setFirstName(customerfName);
        customer.setLastName(customerfName);
       // customer.setFood(food);

        String info = customer.introduceYourSelf();
        System.out.println(info);
        /*overriding*/

        String food="apples";

        String info1 = customer.products(food);
        System.out.println(info1);
        int x=12;
        if(x==5){
            System.out.println(true);
        }else {
            System.out.println(false);

        }
            /**
             *  while loop
             */

        /*
            int n = 1;
            int sum=0;

            while(n<7){

               // System.out.print("["+n+"]");
                sum= sum+n;
                n++;


            }
                 System.out.print("["+sum+"]");*/

       /*     int r=1;
        do {
            System.out.print("[" + r + "]");
            r++;
        }
        while(r<7);*/
       //for loops
      /*  int b;
        int add=0;
        for(b=1;b<=6;b++){
            //System.out.print("[" + b + "]");
       add =add+b;

        }
        System.out.print("[" + add + "]");
*/
        /**
         *  arrays
         */

       /* String[]myInstructor={"nel","bert","amante"};
         for (int y=0;y<3;y++) {


             if (myInstructor[y]=="bert") {
                myInstructor[y]="amante";
             }
             System.out.println("[" + myInstructor[y] + "]");
         }*/
        for(int i = 0; i < 1 ; i++){
            System.out.print(Collection.myList()+" ");
            System.out.print(Collection.emotions()+" ");
            System.out.println(Collection.myGirlFriends()+" ");
        }
       /** Collection.myList();
        Collection.emotions();*/
    }
}
