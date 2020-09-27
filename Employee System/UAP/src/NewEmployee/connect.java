/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewEmployee;

import java.util.ArrayList;

/**
 *
 * @author shafi
 */
 public  class  connect {

    String searchId = "";
    double amt;
    static UapCse myUap = new UapCse("University of Asia Pacific");

    public void salaried(String name, String id, String des, double sal) {

        myUap.addNewEmployees(name, id, des, sal);

    }

    public void hourly(String name, String id, String des, double hr, int hw) {

        myUap.addNewEmployees(name, id, des, hr, hw);

    }

    public void commission(String name, String id, String des, double comissionRate, double comisionSale) {

        myUap.addNewEmployees(name, id, des, comissionRate, comisionSale);

    }

    public ArrayList<Employee> showres() {
        ArrayList<Employee> em = myUap.employees;
        return em;
    }

    public String searchID() {
        Employee e = myUap.findEmployee(searchId);
        String ob = e.display();
        return ob;
    }

    public String updateSalary() {
        Employee e = myUap.findEmployee(searchId);
        if (e == null) {
            return "No";
        } else {
            e.increaseSalary(amt);
            return "Yes";
        }

    }

    public String Salary() {
        Employee e = myUap.findEmployee(searchId);
        String name = e.getName();
        String id = e.getId();
        double sal = e.getSalary();
        return "Name: " + name + " Id: " + id + " Salary: " + sal;

    }

}
