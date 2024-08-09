package org.example;

public class Student {
    String name;
    String phone;
    String city;
    Long studendId;
    Student(String name, String phone, String city, Long studendId){
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.studendId = studendId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getStudendId() {
        return studendId;
    }

    public void setStudendId(Long studendId) {
        this.studendId = studendId;
    }
}
