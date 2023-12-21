class students{
    private String name;
    private int age;
    private double grade;

    // public students(){
    //     this.name="Unknown";
    //     this.age=0;
    //     this.grade=0.00;
    // }
    public students(String name, int age){
        this.name=name;
        this.age=age;
        this.grade=0.0;
    }
    public students(String name, int age, double grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setgrade(double grade){
        this.grade=grade;
    }
    private String gradeStatus(){
        if(grade>=3.00){
            return "Your Result Is Good";
        }
        else{
            return "Probation";
        }
    }
    public void display_student(){
        System.out.println("Student Name: "+name);
        System.out.println("Age     :"+age);
        System.out.println("Result     : "+grade);
        System.out.println("Status  : "+gradeStatus());
    }
}

public class Student {
    public static void main(String[] args) {
        students s1=new students("Rayhan",21);
        System.out.println(" student 1 info: ");
        s1.display_student();

        students s2=new students("Rayhan", 21, 3.60);
        
        System.out.println("2nd student info: ");
        s2.display_student();

        System.out.println("3nd student info: ");
        students s3=new students("Adam", 23, 3.88);
        s3.setgrade(3.50);
        s3.setage(20);
        s3.setname("Rana");
        s3.display_student();
    }
}