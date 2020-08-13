package day39_CustomClass;
import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();
        Employee employee6 = new Employee();
        employee1.setEmployeeInfo("Roman", 'M', 123456, "QA",120000);
        employee2.setEmployeeInfo("Meerim",'F',1243123,"QA",120000.50);
        employee3.setEmployeeInfo("Musa", 'M', 1234567, "SDET", 135000);
        employee4.setEmployeeInfo("Ramazan", 'M', 3421513, "SDET", 150000);
        employee5.setEmployeeInfo("Tetiana",'F',9876543, "SDET", 125000);
        employee6.setEmployeeInfo("Virgina", 'F', 4567891, "BA", 150000.70 );
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6) );
        double max = Integer.MIN_VALUE;
        String name = "";
        for( Employee each : employeeList ){
            double eachSalary = each.salary;
            if(eachSalary > max){
                max =  eachSalary;
                name = each.name;
            }
        }
        System.out.println("Maximum Salary: "+max);
        System.out.println("Name: "+name);

        System.out.println("========================================");

        //  employeeList.removeIf( p -> p.salary < 150000 );
        //employeeList.removeIf( each -> each.salary > 135000 );
        //employeeList.removeIf( each -> each.jobTitle.equals("QA") );
        // employeeList.removeIf( each -> each.name.toLowerCase().contains("m") );
        employeeList.removeIf( each -> each.name.charAt(0) == 'R' );

        for( Employee each: employeeList){
            // each.getEmployeeInfo();
            System.out.println(each.name+" : "+each.salary);
        }







    }

}
