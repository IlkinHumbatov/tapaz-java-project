package service;

import entity.Employee;

import java.util.List;

public interface EmployeeService {

    void increaseSalary(String finCode , Integer percent);

    void decreaseSalary(String finCode , Integer percent);

    List<Employee> getByMinAndMaxSalary(Double minSalary, Double maxSalary);

    List<Employee> getByMinAndMaxExperience(Double minExperience,Double maxExperience);

    List<Employee> getByGender(Character gender);

    List<Employee> getByExperienceMoreThan(Double experience);

    List<Employee> getByName(String name);

    List<String> getEmployeeNames();

    List<Double> getEmployeeSalary();

    List<Employee> getIncreaseBakuEmplSalary(Double percent);


}
