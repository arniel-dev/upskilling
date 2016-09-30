package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Customer extends Person {
    String address;
    int telephoneNumber;
    int customer_id;
   // String food;

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

   /* public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }*/

    public int getTelephoneNumber() {

        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String introduceYourSelf(){
        String fname = getFirstName();
        String lname = getLastName();



        return "Hi! I'm "+fname+" "+lname+ " and I worked at cite";
    }

    public String products(String product){
        /*String fname = getFirstName();
        String lname = getLastName();*/
        return "I want to buy "+product;

    }

}
