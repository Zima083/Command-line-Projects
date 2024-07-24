package Projects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
    int s_id;
    String name;
    int age;
    public Student(){

    }
    public Student(int s_id, String name, int age) {
        this.s_id = s_id;
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getS_id() {
        return s_id;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setS_id(int s_id) {
        this.s_id = s_id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + s_id +
                ", Age=" + age +
                '}';
    }
}
class StudentUtility{
  static   Scanner sc = new Scanner(System.in);
    //1.Add Student
   public static Student addStudent(){
   Student s = new Student();
       System.out.print("please enter Std-id :");
       s.setS_id(sc.nextInt());
       System.out.print("please enter name :");
       s.setName(sc.next());
       System.out.print("please enter age :");
       s.setAge(sc.nextInt());
       return s;
   }

    //2. Update Student.
    public static void updateStudent(List<Student> students){
        System.out.println("Pleaase enter the update details");
       System.out.print("Enter Sid:");
       int id= sc.nextInt();
        System.out.print("Enter Name:");
        String name= sc.next();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        //Done the changes in Actual student list.
       int count=0;
        for (Student s:students){
            if (s.getS_id()==id){
    break;
            }
            count++;
        }
        students.get(count).setName(name);
        students.get(count).setAge(age);

    }
   //3. Display Student
 public static void displayAllStudents(List<Student> students){
     Iterator<Student> studentIterator = students.iterator();
     while(studentIterator.hasNext()){
         System.out.println(studentIterator.next().toString());
     }
 }
    //4. Delete Student
    public static void deleteStudent(List<Student> students,int sid){
  Iterator<Student> studentIterator=students.iterator();
    while (studentIterator.hasNext()){
  Student s = studentIterator.next();
        if (s.getS_id()==sid){
            studentIterator.remove();
        }
    }
   }
}

public class ToDoList {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
      int count =0;
        while (true){
            if (count!=0){
                System.out.println("\n Do you want to contiune, then press 'yes'");
                String contiune = sc.next();
                if (contiune.equalsIgnoreCase("yes")){
                }else {
                    System.exit(0);
                }
            }
            count++;
          System.out.println("\t\tStudent Project Management:");
          System.out.println("=========================================");
          System.out.println("1.Add Student\n" +
                  "2.Update Student\n" +
                  "3.Display All Student\n" +
                  "4.Delete Student\n" +
                  "5.Exit\n");
          System.out.print("Please select operation:");
          int option =sc.nextInt();
         //switch for particular case.
          switch (option){
              case 1:
                  //Add Student
                Student student=  StudentUtility.addStudent();
                studentList.add(student);
                  System.out.println("Student added successfully");
                break;
                  case 2:
                  //Update Student
  StudentUtility.updateStudent(studentList);
                      System.out.println("Student Update Successfully.");
                      break;
  case 3:
                  //Display Student
                  StudentUtility.displayAllStudents(studentList);
                  break;
              case 4:
            //Delete Student
                  System.out.println("Delete Student option is proceed:");
                  System.out.print("Enter Student id");
                  int sid=sc.nextInt();
                  StudentUtility.deleteStudent(studentList,sid);
                  System.out.println("Student delete Successfully.");
                  break;
              case 5:
                  // stop the program
                  System.exit(0);break;
              default:
                  System.err.println("Please Enter correct option..");
           break;
          }
      }
    }
}
