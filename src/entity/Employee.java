package entity;

public class Employee extends Person {

    private Double salary;

    private Double experience;

    public Employee(String finCode,Integer age, String fullName, String phoneNumber, Character gender,String placeOfBirth,double salary, double experience) {
        super(finCode, age, fullName, phoneNumber, gender,placeOfBirth
        );
        this.salary = salary;
        this.experience = experience;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getExperience() {
        return experience;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "finCode=" + super.getFinCode() + '\'' +
                ", fullName='" + super.getFullName() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", gender=" + super.getGender() +
                "salary=" + salary +
                ", experience=" + experience +
                "} ";
    }
}
