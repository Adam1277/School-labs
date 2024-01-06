package Lab02;

public class Faculty extends Person{
    String rank;

    Faculty(String name, String address, String phoneNumber, String email, String rank){
        super(name,address,phoneNumber,email);
        this.rank = rank;
    }

    public String toString(){
        return super.toString() + " Rank: " + rank;
    }
}
