package Model;

import java.io.Serializable;

public class Department implements Serializable
{
    private String dept_name;

    public Department(){}
    public Department(String dept_name)
    {
        this.dept_name = dept_name;
    }

    public String getDept_name()
    {
        return dept_name;
    }
    public void setDept_name(String dept_name)
    {
        this.dept_name = dept_name;
    }
}
