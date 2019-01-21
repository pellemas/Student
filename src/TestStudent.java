public class TestStudent {
    public static void main(String[] args){
        Student s1 = new Student(11, "Anthony");
        Student s2 = new Student();

        System.out.println("Name of S2" + s2.getstudName());
        s2.setstudName("Jessy");
        System.out.println("name of s2 after using set method " + s2.getstudName());
    }
}
