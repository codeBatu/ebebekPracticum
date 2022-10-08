package org.ebebekPracticum;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Batuhan",1000D,41D,2003);
        System.out.println("Zamsız Başlangıç Bilgileri :");
        System.out.println(employee.toString());
    employee.setSalary(employee.raiseSalary());
        System.out.println("Zamlı Hesaplanmış Maaşı :");
        System.out.println(employee.toString());

    }
}