package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Employee extends Person {
    private String department;
    private float payGrade;
    private int employee_id;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public float getPayGrade() {

        return payGrade;
    }

    public void setPayGrade(float payGrade) {
        this.payGrade = payGrade;
    }

    public String introduceYourSelf(){
        String fname = getFirstName();
        String lname = getLastName();


        return "Hi! I'm "+fname+" "+lname+ " and I'm worked at "+department+"!";
    }
}
