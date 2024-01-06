package Lab02;

public class Student extends Person{
    String status;

    Student(String name, String address, String phoneNumber, String email, String status){
        super(name,address,phoneNumber,email);
        this.status = status;
    }

    public String toString(){
        return super.toString() + " Status: " + status;
    }
}
