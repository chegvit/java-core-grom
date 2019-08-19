package lesson9;

public class Company {
   private   String name;
   private String countryFounded;

   protected String code;
   public int someField;

    public Company(String name, String countryFounded, String code, int someField) {
        this.name = name;
        this.countryFounded = countryFounded;
        this.code = code;
        this.someField = someField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryFounded() {
        return countryFounded;
    }

    public void setCountryFounded(String countryFounded) {
        this.countryFounded = countryFounded;
    }
}
