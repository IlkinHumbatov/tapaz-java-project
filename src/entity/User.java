package entity;

public class User extends Person {

    private Integer yearOfBirth;

    public User(String finCode, Integer age, String fullName, String phoneNumber, Character gender, String placeOfBirth, Integer yearOfBirth) {
        super(finCode, age, fullName, phoneNumber, gender,placeOfBirth);
        this.yearOfBirth = yearOfBirth;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "finCode=" + super.getFinCode() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", fullName='" + super.getFullName() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", placeOfBirth=" + super.getPlaceOfBirth() +
                "yearOfBirth=" + yearOfBirth +

                "} ";
    }
}
