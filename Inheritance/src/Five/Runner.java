package Five;

public class Runner {
    public static void main(String[] args) {

        Teacher t = new Teacher("Tanmay", 35, "JAVA");
        Student s = new Student("Abhi", 16, "B-tech");
        Staff st = new Staff("Deepesh", 40, "Trainer");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}