
package oopfınal4;

public class OOPFINAL4 {

    public static void main(String[] args) {
       Student s1=new MasterStudent (1,55,80,3);
       Student s2=new BachelourStudent(2,91,45);
       Student s3=new PhDStudent(3,57,72,3,2);
       
       Student[] students=new Student[]{s1,s2,s3};
       
       for(Student s:students)
            System.out.println(s);
    }
    
}
