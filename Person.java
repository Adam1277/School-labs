package Lab02;

public class Person {
    String name;
    String address;
    String phoneNumber;
    String email;

    Person(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString(){
        return "Name: " + name + " Address: " + address 
        + " Phone number: " + phoneNumber + " Email: " + email;
    }
}
