package entity;

public class Person {

    private String finCode;

    private String fullName;

    private Integer age;

    private String phoneNumber;

    private Character gender;

    private String placeOfBirth;

    public Person(String finCode, Integer age, String fullName, String phoneNumber, Character gender,String placeofBirth) {
        this.finCode = finCode;
        this.age = age;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.placeOfBirth=placeofBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFinCode() {
        return finCode;
    }

//    public void setFinCode(String finCode) {
//        this.finCode = finCode;
//    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
