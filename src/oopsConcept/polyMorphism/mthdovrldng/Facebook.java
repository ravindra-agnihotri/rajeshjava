package oopsConcept.polyMorphism.mthdovrldng;

import oopsConcept.polyMorphism.mthdovrldng.Constructor.*;

public class Facebook {
    //overloading- having method with same name and diff parameter
  public void login(String username, String password){

  }

  public void login(int gmailToken){

  }

    public static void main(String[] args) {
      Facebook facebook= new Facebook();
        facebook.login("1","as");
        facebook.login(99);
      System.out.println(Constructor.aa);
    }
}
