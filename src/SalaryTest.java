import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class SalaryTest { 
    @Test
    void testDA() {
        Salary salary = new Salary(100000);
        assertEquals(73000.0, salary.getDA());
       

      
    }
    @Test
    void testHRA() {
        Salary salary = new Salary(100000);
        assertEquals(10000.0, salary.getHRA());
       
      
    }
    @Test
    void testGrossSalary() {
        Salary salary = new Salary(100000);  
        assertEquals(183000.0, salary.getGrossSalary());
        
      
    }
    @Test
    void testIncomeTex() {
        Salary salary = new Salary(100000);
        assertEquals(54900.0, salary.getIncomeTax());
       

      
    }
    @Test
    void testNetSalary() {
        Salary salary = new Salary(100000);
        assertEquals(128100.0, salary.getNetSalary());

}
}