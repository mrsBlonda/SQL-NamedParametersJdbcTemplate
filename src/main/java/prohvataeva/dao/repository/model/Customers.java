package prohvataeva.dao.repository.model;

import org.springframework.stereotype.Component;

import java.util.Objects;
@Component
public class Customers {
    String name;
    String surname;
    int age;
    String productName;

    public Customers() {
    }

    public Customers(String name, String productName) {
        name = this.name;
        productName = this.productName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers customers = (Customers) o;
        return age == customers.age && Objects.equals(name, customers.name) && Objects.equals(surname, customers.surname) && Objects.equals(productName, customers.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, productName);
    }

    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", productName='" + productName + '\'' +
                '}';
    }
}
