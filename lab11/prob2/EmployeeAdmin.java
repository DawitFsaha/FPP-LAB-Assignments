package lab11.prob2;

import java.util.*;

public class EmployeeAdmin {

    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
        List<Employee> result = new ArrayList<>();

        for (String ssn : socSecNums) {
            Employee emp = table.get(ssn);
            if (emp != null && emp.getSalary() > 80000) {
                result.add(emp);
            }
        }

        Collections.sort(result, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getSsn().compareTo(e2.getSsn());
            }
        });

        return result;
    }
}
