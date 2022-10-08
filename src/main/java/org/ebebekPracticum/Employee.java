package org.ebebekPracticum;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Employee {

    public Employee(String name, Double salary, Double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.name + '\'' +
                ", salary=" + this.salary +
                ", workHours=" +this. workHours +
                ", hireYear=" + this.hireYear +
                '}';
    }

    private String name ;


    public void setSalary(Double salary) {
        this.salary = salary;
    }

    private Double salary;
    private  Double workHours;
    private  int hireYear;
    public  double tax() {

        if(this.salary<1000){

            return  0;
        }
        return this.salary * 0.03;
    }
    public  double bonus(){
       if(this.workHours>40){

           return  (workHours-40)*30;
       }
       return 0;
    }
    public  double raiseSalary() {
        var workYear = 2021-this.hireYear;
        if(workYear<9){

            return bonus()+(this.salary*0.05)+this.salary-tax();
        }
      else  if(workYear>9&&workYear<19){

            return bonus()+(this.salary*0.1)+this.salary-tax();
        }

        return  bonus()+(this.salary*0.15)+this.salary-tax();


    }

}
