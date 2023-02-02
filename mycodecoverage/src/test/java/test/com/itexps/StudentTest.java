/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.mycompany.mycodecoverage.Student;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author ukiel
 */
public class StudentTest {
    Student stu;
    
    
    public StudentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        stu = new Student();
 
    }
    
    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
        
    }
        @Test
    public void testGradePass() {
        stu.setEng(90);
        stu.setMath(90);
        stu.setSci(80);
        assertEquals("Pass", stu.getGrade());
        
    }
    
     @Test
    public void testGradeFail() {
        stu.setEng(50);
        stu.setMath(40);
        stu.setSci(20);
        assertEquals("Fail", stu.getGrade());
        
    }
}
