package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Animals {
    private String species;
    private String gender;
    private String name;
    private int age;
    private boolean manEater;

    public boolean isManEater() {
        return manEater;
    }

    public void setManEater(boolean manEater) {
        this.manEater = manEater;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {

        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Created by jpmc on 9/29/2016.
     */
    public String Description() {
        return species+", "+name+ "!!!. This king can weigh between 250 and 550 pounds, depending on sex and age and can grow up to be "+ age+  " years old in the wild and over the age of 20 years old in captivity.";
    }
}
