package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {
        
    private double annualSalary;
    private double annualBonus;

    /** default constructor. Is this the best way to go? */
//    public SalariedEmployee() {}
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }
    

    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
//    public SalariedEmployee(double annualSalary, double annualBonus) {
//        setAnnualSalary(annualSalary);
//        setAnnualBonus(annualBonus);
//    }

    @Override
    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
    public void setAnnualSalary(double annualSalary) {
        if (annualSalary < 0 || annualSalary > 999999) {
            throw new IllegalArgumentException();
        }
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        if (annualBonus < 0 || annualBonus > 999999) {
            throw new IllegalArgumentException();
        }
        this.annualBonus = annualBonus;
    }
    
    

    
}
