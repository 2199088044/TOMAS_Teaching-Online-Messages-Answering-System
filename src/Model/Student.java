package Model;

import java.io.Serializable;

public class Student implements Serializable
{
    private String student_id;
    private String student_name;
    private String dept_name;
    private String student_pswd;

    public Student(){}
    public Student(String student_id,String student_name,String dept_name,String student_pswd)
    {
        this.student_id = student_id;
        this.student_name = student_name;
        this.dept_name = dept_name;
        this.student_pswd = student_pswd;
    }

    public String getStudent_id()
    {
        return student_id;
    }
    public void setStudent_id(String student_id)
    {
        this.student_id = student_id;
    }

    public String getStudent_name()
    {
        return student_name;
    }
    public void setStudent_name(String student_name)
    {
        this.student_name = student_name;
    }

    public String getDept_name()
    {
        return dept_name;
    }
    public void setDept_name(String dept_name)
    {
        this.dept_name = dept_name;
    }

    public String getStudent_pswd()
    {
        return student_pswd;
    }
    public void setStudent_pswd(String student_pswd)
    {
        this.student_pswd = student_pswd;
    }
}
