
package edu.lfa.naya.entity;

public class Student {
  
    int id;
    String Fname,lname,email;

    public Student() {
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentView{" + "id=" + id + ", Fname=" + Fname + ", lname=" + lname + ", email=" + email + '}';
    }
    
        
}
