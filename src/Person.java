public class Person implements Greeter{

  protected String firstName = "Chase";
  protected String lastName = "Hammock";

  public Person (String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    if (firstName == null) throw new IllegalArgumentException("Your first name was null so quit it...");
    if (lastName == null) throw new IllegalArgumentException("Your first name was null so quit it...");
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public static void main(String[] args) {

   Greeter

  }

  }

}
