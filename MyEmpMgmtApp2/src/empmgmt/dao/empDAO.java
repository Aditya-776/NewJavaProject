/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empmgmt.dao;

import empmgmt.dbutil.DBConnection;
import empmgmt.pojo.Employee;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class empDAO {
    public static boolean addEmployee(Employee e)throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into employee values(?,?,?)");
        ps.setInt(1, e.getEmpNo());
        ps.setString(2, e.getEmpName());
        ps.setDouble(3, e.getEmpsal());
        
        int result = ps.executeUpdate();
        return result==1;
    }
    public static Employee findEmployeeById(int EmpNo)throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from employee where EmpNo=?");
        ps.setInt(1,EmpNo);
        ResultSet rs=ps.executeQuery();
        Employee e= null;
        if(rs.next())
        {
            e=new Employee();
            e.setEmpNo(rs.getInt(1));
            e.setEmpName(rs.getString(2));
            e.setEmpsal(rs.getDouble(3) );
        }
        return e;
    }
    public static ArrayList<Employee> getAllEmployees()throws SQLException
    {
          Connection conn = DBConnection.getConnection();
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery("Select * from Employee");
          ArrayList<Employee> empList = new ArrayList<>();
          while(rs.next())
          {
             Employee  e=new Employee();
            e.setEmpNo(rs.getInt(1));
            e.setEmpName(rs.getString(2));
            e.setEmpsal(rs.getDouble(3) );
            empList.add(e);
          }
          return empList;
    }
}
