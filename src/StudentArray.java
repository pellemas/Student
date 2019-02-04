public class StudentArray {
    public static void main(String[] args) {
        Student[] studentArray = new Student[5];
        Student s1 = new Student(1, "Ronak");
        studentArray[0] = s1;
        Student s2 = new Student(2, "Sheth");
        studentArray[1] = s2;
        Student s3 = new Student(3, "Ronak");
        studentArray[2] = s3;
        studentArray[3] = new Student(4, "abc");
        studentArray[4] = new Student(5, "xyz");

        for (int i = 0; i<studentArray.length; i++)
            System.out.println("Name of the student at index " + i + " is " + studentArray[i].getstudName());

        System.out.println("Hello");
        
        
        System.out.println("This will be pulled from git");

        System.out.println("This has been added in the new branch");
        
        System.out.println("This will be fetched and merged");
    }


}
