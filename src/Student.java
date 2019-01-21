public class Student {
    private int studId;
    private String studName;

    public Student(){  //default constructor (if no args were sent)
        studId = 1;
        studName = "aaa";
    }

    public Student(int givenStudId, String givenStudName){
        studId = givenStudId;
        String studName = givenStudName;
    }
    public int getStudId(){
        return studId;
    }
    public void setStudId(int givenStudId){
        studId = givenStudId;
    }
    public String getstudName(){
        return studName;
    }
    public void setstudName(String givenstudName){
        studName = givenstudName;
    }
}
