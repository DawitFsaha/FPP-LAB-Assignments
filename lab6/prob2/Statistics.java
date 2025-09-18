package lab6.prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */

    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        double sum = 0.0;
        for(EmployeeData emp : aList) {
            sum += emp.getSalary();  // polymorphic call
        }
        return sum;
    }
}
