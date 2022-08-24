import java.util.Scanner.*;
public class Addressbook {
public void ContactDetails(){
   String name="Ram";
    int age=20;
    int contact=91746748;
   String  city="Hyderabad";
    String state="Telangana";
    System.out.println("name :" + name );
    System.out.println("age :" + age);
    System.out.println("contact :" + contact);
    System.out.println("city :" + city);
    System.out.println("state :" + state);


}
public static void main(String[] arg){
    Addressbook ab=new Addressbook();
    ab.ContactDetails();




    }
}
