package library.members;

public class Member {

    String memberName = "Abhishek";
    int memberId = 101;

    public void registerMember() {
        System.out.println("Member Registered");
        System.out.println("Name: " + memberName);
        System.out.println("ID: " + memberId);
    }

}