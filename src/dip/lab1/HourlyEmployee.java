package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;

    /** default constructor. Is this the best way to go? */
//    public HourlyEmployee() {}
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
    }
    
     @Override
    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }

    //setters and getters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0 || hourlyRate > 300) {
            System.out.println("Invalid hourly rate.");
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        if (totalHrsForYear < 0 || totalHrsForYear > 5500) {
            System.out.println("Invalid total hours for year");
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }
    

    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
//    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
//        setHourlyRate(hourlyRate);
//        setTotalHrsForYear(totalHrsForYear);
//    }

   
    

}
