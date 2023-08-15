/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empmgmt.pojo;

/**
 *
 * @author Asus
 */
public class Employee {
    private int empNo;
    private String empName;
    private Double empsal;
    
     public Employee() {
    }
     
    public Employee(int empNo, String empName, Double empsal) {
        this.empNo = empNo;
        this.empName = empName;
        this.empsal = empsal;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpsal(Double empsal) {
        this.empsal = empsal;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public Double getEmpsal() {
        return empsal;
    }
}
