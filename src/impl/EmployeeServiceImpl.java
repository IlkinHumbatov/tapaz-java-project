package impl;

import entity.Employee;
import entity.User;
import service.CommonService;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements CommonService<Employee>, EmployeeService {

    static ArrayList<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("6j47hqf", 28, "Ilkin Humbatov", "0507433241", 'M', "Baku", 689.00, 5.4));
        employees.add(new Employee("bb78jkd", 35, "Zakir Agayev", "0554263215", 'M', "Baku", 1541.00, 2.1));
        employees.add(new Employee("6n45xtm", 29, "Kenan Hasanzade", "0557001202", 'M', "Baku", 2700.00, 3.9));
        employees.add(new Employee("81jkl1", 21, "Murad Huseynov", "0552501202", 'M', "Baku", 1700.00, 1.9));
        employees.add(new Employee("78lkzm", 26, "Aqil Agayev", "0557071202", 'M', "Seki", 1500.00, 1.7));
        employees.add(new Employee("4n45xtm", 23, "Senan Qarayev", "0559991202", 'M', "Baku", 1000.00, 0.8));
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public Employee getByFinCode(String finCode) {
        for (Employee employee : employees) {
            if (employee.getFinCode().equals(finCode)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void create(Employee object) {
        employees.add(object);
    }

    @Override
    public void delete(String finCode) {
     Employee employee = getByFinCode(finCode);
     if(employee!= null){
         employees.remove(employee);
     }
    }

    @Override
    public void update(String finCode, String fullName) {
       Employee employee = getByFinCode(finCode);

        if (employee != null) {
            employee.setFullName(fullName);
        }
    }

    @Override
    public void increaseSalary(String finCode, Integer percent) {
      Employee employee = getByFinCode(finCode);

        if (employee != null) {
            double salary = employee.getSalary();

            double increase = salary * percent / 100;

            employee.setSalary(salary + increase);
        }
    }

    @Override
    public void decreaseSalary(String finCode, Integer percent) {
        Employee employee = getByFinCode(finCode);
        if (employee != null) {
            double salary = employee.getSalary();

            double decrease = salary * percent / 100;

            employee.setSalary(salary - decrease);
        }

    }

    @Override
    public List<Employee> getByMinAndMaxSalary(Double minSalary, Double maxSalary) {
        return employees.stream()
                .filter(employee -> employee.getSalary() > minSalary && employee.getSalary() < maxSalary)
                .toList();
    }

    @Override
    public List<Employee> getByMinAndMaxExperience(Double minExperience, Double maxExperience) {
        return employees.stream()
                .filter(employee -> employee.getExperience() > minExperience && employee.getExperience() < maxExperience)
                .toList();
    }

    @Override
    public List<Employee> getByGender(Character gender) {
        return employees.stream()
                .filter(employee -> employee.getGender() == gender)
                .toList();
    }

    @Override
    public List<Employee> getByExperienceMoreThan(Double experience) {
        return employees.stream()
                .filter(employee -> employee.getExperience() > experience)
                .toList();
    }

    @Override
    public List<Employee> getByName(String name) {
        return employees.stream()
                .filter(employee -> employee.getFullName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }

    @Override
    public List<String> getEmployeeNames() {
        return employees.stream()
                .map(employee -> employee.getFullName())
                .toList();
    }

    @Override
    public List<Double> getEmployeeSalary() {
        return employees.stream()
                .map(employee -> employee.getSalary())
                .toList();
    }

    @Override
    public List<Employee> getIncreaseBakuEmplSalary(Double percent) {
        return employees.stream()
                .filter(employee -> employee.getPlaceOfBirth().equalsIgnoreCase("Seki"))
                .map(employee -> {
                    employee.setSalary(employee.getSalary() * (1 + percent / 100.0));
                    return employee;
                })
                .toList();


    }

}
