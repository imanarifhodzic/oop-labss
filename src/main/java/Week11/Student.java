package Week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String message){
        super(message);
    }
}
class EmptyStudentListException extends RuntimeException{
    public EmptyStudentListException(String message){
        super(message);
    }
}
class Student {
    private int id;
    private String name;
    private String university;
    private String department;
    private double gpa;

    public Student(int id, String name, String university, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.department = department;
        this.gpa = gpa;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getDepartment() {
        return department;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString(){
        return this.name;
    }
}
class StudentSystem{
    private List<Student> students;

    public StudentSystem(String filename){
        try{
            students=readStudent(filename);
        }catch (IOException e){
            students=new ArrayList<>();
            System.out.println("Unable to read students");
        }
    }
    public static List<Student> readStudent(String filename) throws IOException{
        List<Student> studentList=new ArrayList<Student>();
        BufferedReader bufferedReader=new BufferedReader(new FileReader(filename));
        List<String> lines=bufferedReader.lines().collect(Collectors.toList());

        for (String line:lines){
            String[] studentParts=line.split(",");
            Student s=new Student(studentParts[0]!="" ?Integer.parseInt(studentParts[0]):000,studentParts[1],studentParts[2],studentParts[3],studentParts[4]!="" ? Double.parseDouble(studentParts[4]) : 000);
            studentList.add(s);
        }
        bufferedReader.close();
        return studentList;
    }
    public Optional<Student> getStudentById(int id) throws StudentNotFoundException {
        for (Student s:this.students){
            if (s.getId()==id){
                return Optional.of(s);
            }
        }
        return Optional.ofNullable(null);
    }

    public Student getHighestGPAStudent(){
        double h=0;
        int indexOfHighestGPA=0;

        if (this.students.isEmpty()){
            throw new EmptyStudentListException("List of students is empty");
        }else {

            for (int i=0;i<this.students.size();i++){
                if(this.students.get(i).getGpa()>h){
                    indexOfHighestGPA=i;
                    h=this.students.get(i).getGpa();
                }
            }
        }
        return this.students.get(indexOfHighestGPA);
    }
    public Student getLongestNameStudent(){
        int index=0;
        int length=0;
        if(this.students.isEmpty()){
            throw new EmptyStudentListException("List of student is empty");
        }else{
            for (int i=0;i<this.students.size();i++){
                if(this.students.get(i).getName().length()>length){
                    length=this.students.get(i).getName().length();
                    index=i;
                }
            }
        }
        return this.students.get(index);
    }
}
class Main {
    public static void main(String[] args)  {
        StudentSystem studentSystem=new StudentSystem("students.csv");



        try{
            Optional<Student> student=studentSystem.getStudentById(1000);

            if(student.isPresent()){
                System.out.println(student.get());
            }else{
                throw new StudentNotFoundException("Student with that particular ID does not exist.");
            }
        }catch (StudentNotFoundException snfe){
            System.out.println(snfe.getMessage());
        }

        try {
            System.out.println(studentSystem.getHighestGPAStudent());
        }catch (EmptyStudentListException esle){
            System.out.println(esle.getMessage());
        }
        try {
            System.out.println(studentSystem.getLongestNameStudent());
        }catch (EmptyStudentListException esle){
            System.out.println(esle.getMessage());
        }
    }
}
