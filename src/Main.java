import impl.EmployeeServiceImpl;
import impl.UserServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        System.out.println(employeeService.getByMinAndMaxSalary(1000.0, 3000.0));

        System.out.println(employeeService.getByMinAndMaxExperience(1.00, 3.00));

        System.out.println(employeeService.getByGender('M'));

        System.out.println(employeeService.getByExperienceMoreThan(5.0));

        System.out.println(employeeService.getByName("Ilkin"));

        System.out.println(employeeService.getEmployeeNames());

        System.out.println(employeeService.getEmployeeSalary());

        System.out.println(employeeService.getIncreaseBakuEmplSalary(15.00));

        UserServiceImpl userService = new UserServiceImpl();

        System.out.println(userService.getByAgeGreaterThan(25));

        System.out.println(userService.getByPlaceOfBirth("Baku"));

        System.out.println(userService.getByGender('M'));

        System.out.println(userService.getByNameContains("Murad"));

    }
}