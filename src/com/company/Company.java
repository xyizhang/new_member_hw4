package com.company;

public class Company {
    static class Person{
        public String name;
        public int age;

        public Person(String _name, int _age){
            name = _name;
            age = _age;
        }

        public void incrementAge(){
            age += 1;
        }

        public String showValues(){
            return "Name: " + name + " Age: " + age;
        }
    }

    static class Employee extends Person{

        int salary;

        Employee(String _name, int _age, int _salary) {
            super(_name, _age);
            salary = _salary;
        }

        public void changeSalary(int _newsalary){
            salary = _newsalary;
        }

        @Override
        public String showValues(){
            String sup = super.showValues();
            return sup + " Salary: " + salary;
        }
    }

    static class Executive extends Employee{
        int numberOfStocks;
        public Executive(String _name, int _age, int _salary, int _numOfStocks) {
            super(_name, _age, _salary);
            salary = _salary;
            numberOfStocks = _numOfStocks;
        }
        public void changeNumberOfStocks(int _numberOfStocks){
            numberOfStocks = _numberOfStocks;
        }
        @Override
        public String showValues(){
            String sup = super.showValues();
            return sup + " Number of Shares: " + numberOfStocks;
        }
    }

    public static void main(String[] args) {
        Person yi = new Person("Yi",14);
        Employee dave = new Employee("Dave",20,50000);
        Executive jones = new Executive("Jones",50, 200000,50);
        Person[] people = {yi,dave,jones};
        for (Person person :
                people) {
            System.out.println(person.showValues());
        }
        System.out.println("\n");
        dave.changeSalary(60000);
        jones.changeNumberOfStocks(100);
        for (Person person :
                people) {
            System.out.println(person.showValues());
        }
    }
}
