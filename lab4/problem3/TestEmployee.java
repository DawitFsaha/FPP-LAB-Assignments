package lab4.problem3;

import java.util.Arrays;

public class TestEmployee {

    public static Employee[] findSalaryList(Employee[] employees, double salary){
        int count =0;
        for(Employee e: employees){
            if(e != null){
                if(e.getPayment() < salary){
                    count++;
                }
            }
        }

        Employee[] em = new Employee[count];
        int pos=0;
        for(Employee e: employees){
            if(e != null){
                if(e.getPayment() < salary){
                    em[pos] = e;
                    pos++;
                }
            }
        }

        return em;

    }

    public static void main(String[] args) {

        Employee e1 = new CommissionEmployee("Dawit", "Welegebriel","SN563454",30500,25);
        Employee e2 = new BasePlusCommissionEmployee("Muez","Fsaha","M5345436",9000,20,750);
        Employee e3 = new HourlyEmployee("Mahlet","Beyene","M54634534",35,150);
        Employee e4 = new SalariedEmployee("Kibrom","Fsaha","K342345",2300);
        Employee e5 = null;

        Employee[] employees = {e1,e2,e3,e4,e5};

        Employee[] filteredEmployees = findSalaryList(employees,6000);

        System.out.println(Arrays.toString(filteredEmployees));


    }

}
