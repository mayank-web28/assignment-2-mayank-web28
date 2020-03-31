package problem3.student;

public class student {
    private String name;
    private int rollNo;

    public student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String toString(){
        return getName()+" "+getRollNo();
    }
}
