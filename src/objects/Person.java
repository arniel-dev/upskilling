package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public abstract class Person {
    private  String userName;
    private String firstName;
    private  String lastName;
    private String email;

    /**constructor**/
    public  Person(){
    }
    public Person(String fname,String lname){
        /*this.firstName=fname;
        this.lastName=lname;*/
        //setFirstName(fname);
       // setLastName(lname);
    }

    public void setFirstName(String firstName ) {
        this.firstName = firstName;

    }
    public String getFirstName(){


        return firstName;

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {

        return userName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

public String introduceYourSelf(){

    return "hi i'am "+ firstName+" " +lastName;

}


}
