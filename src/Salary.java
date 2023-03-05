public class Salary {
    
    private double basicSalary; 
    private double HRA; 
    private double DA;
    private double grossSalary; 
    private double incomeTax; 
    private double netSalary; 
   
    public Salary(double basicSalary) {
        this.basicSalary = basicSalary;
        this.HRA = 0.1 * basicSalary;
        this.DA = 0.73 * basicSalary;
        this.grossSalary = basicSalary + HRA + DA;
        this.incomeTax = 0.3 * grossSalary;
        this.netSalary = grossSalary - incomeTax;
    }

   
    public double getBasicSalary() {
        return basicSalary;
    }

    
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getHRA() {
        return HRA;
    }

   
    public double getDA() {
        return DA;
    }

    
    public double getGrossSalary() {
        return grossSalary;
    }

   
    public double getIncomeTax() {
        return incomeTax;
    }

    public double getNetSalary() {
        return netSalary;
    }
    
} 

