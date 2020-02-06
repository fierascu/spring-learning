package hello;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
  private int eid;

  private String ename;

  @Autowired
  private Department department;

  public int getEid() {
    return eid;
  }

  public void setEid(int eid) {
    this.eid = eid;
  }

  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public void showEployeeDetails() {
    System.out.println("Employee Id : " + eid);
    System.out.println("Employee Name : " + ename);
    System.out.println("Department : " + department.getDeptName());
  }
}