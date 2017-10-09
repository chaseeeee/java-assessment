public class User extends Person{

  protected boolean isAdmin;

  public User(String firstName, String lastName, boolean isAdmin) {
    super(firstName, lastName);
  }

  protected boolean isAdmin(boolean isAdmin){
    return isAdmin;
  }

  public static void main(String[] args) {

  }

}
