class mm{
    private int studentId;
    private int yearOfEnrollment;
    private static int counter1=2014101;
    private static int counter2=101;
    public mm(int yearOfEnrollment){
        this.yearOfEnrollment=yearOfEnrollment;
        if(this.yearOfEnrollment==2014){
            this.studentId=Student.counter1++;
        }
        else{
            this.studentId=Student.counter2++;
        }
    }
    public static int totalNumberOfStudents(){
        return (Student.counter2-101);
    }
    public static int totalNumberOfStudents2012(){
        return (Student.counter1 - 2014100);
    }
}
class Demo{
    public static void main(String args[]){
        Student obj = new Student(2014);
        System.out.println(Student.totalNumberOfStudents());
    }
}