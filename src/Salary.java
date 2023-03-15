public class Salary {
	/** 
	 * @author Beris
	 *Represents a Salary object that contains basic salary, HRA, DA, gross salary, income tax, and net salary.
	 */
	 
	public class Salary {
	    
	    private double basicSalary; // The basic salary of the employee.
	    private double HRA; // The house rent allowance of the employee.
	    private double DA; // The dearness allowance of the employee.
	    private double grossSalary; // The gross salary of the employee.
	    private double incomeTax; // The income tax of the employee.
	    private double netSalary; // The net salary of the employee.

	    /**
	     * Constructs a Salary object with the given basic salary and calculates HRA, DA, gross salary, income tax, and net salary.
	     * @param basicSalary The basic salary of the employee.
	     */
	    public Salary(double basicSalary) {
	        this.basicSalary = basicSalary;
	        this.HRA = 0.1 * basicSalary;
	        this.DA = 0.73 * basicSalary;
	        this.grossSalary = basicSalary + HRA + DA;
	        this.incomeTax = 0.3 * grossSalary;
	        this.netSalary = grossSalary - incomeTax;
	    }

	    /**
	     * Returns the basic salary of the employee.
	     * @return The basic salary of the employee.
	     */
	    public double getBasicSalary() {
	        return basicSalary;
	    }

	    /**
	     * Sets the basic salary of the employee.
	     * @param basicSalary The basic salary of the employee.
	     */
	    public void setBasicSalary(double basicSalary) {
	        this.basicSalary = basicSalary;
	    }

	    /**
	     * Returns the HRA of the employee.
	     * @return The HRA of the employee.
	     */
	    public double getHRA() {
	        return HRA;
	    }

	    /**
	     * Returns the DA of the employee.
	     * @return The DA of the employee.
	     */
	    public double getDA() {
	        return DA;
	    }

	    /**
	     * Returns the gross salary of the employee.
	     * @return The gross salary of the employee.
	     */
	    public double getGrossSalary() {
	        return grossSalary;
	    }

	    /**
	     * Returns the income tax of the employee.
	     * @return The income tax of the employee.
	     */
	    public double getIncomeTax() {
	        return incomeTax;
	    }

	    /**
	     * Returns the net salary of the employee.
	     * @return The net salary of the employee.
	     */
	    public double getNetSalary() {
	        return netSalary;
	    }
	    
	}