/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabasejpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ASUS
 */
public class StudentDatabaseJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Student std1 = new Student(1, "John", 12345.0);
//       Student std2 = new Student(2, "Marry", 45678.0);
//       StudentTable.insertStudent(std1);
//       StudentTable.insertStudent(std2);
       Student std;
       std = StudentTable.findStudentById(1);
       if (std != null) {
           std.setName("Jack");
           StudentTable.removeStudent(std);
           //StudentTable.updateStudent(std);
       }
       //List<Student> empList = StudentTable.findEmployeeByName("Marry"); 
       List<Student> stdList = StudentTable.findAllStudent();
       printAllEmployee(stdList);
    }
    
    public static void printAllEmployee(List<Student> employeeList) {
        for(Student emp : employeeList) {
           System.out.print(emp.getId() + " ");
           System.out.print(emp.getName() + " ");
           System.out.println(emp.getGpa() + " ");
       }
    }
    
    
}
