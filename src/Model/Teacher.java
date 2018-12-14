package Model;

import java.io.Serializable;

public class Teacher implements Serializable
{
    private String teacher_id;
    private String teacher_name;
    private String dept_name;
    private String teacher_pswd;

    public Teacher(){}
    public Teacher(String teacher_id,String teacher_name,String dept_name,String teacher_pswd)
    {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.dept_name = dept_name;
        this.teacher_pswd = teacher_pswd;
    }

    public String getTeacher_id()
    {
        return teacher_id;
    }
    public void setTeacher_id(String teacher_id)
    {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name()
    {
        return teacher_name;
    }
    public void setTeacher_name(String teacher_name)
    {
        this.teacher_name = teacher_name;
    }

    public String getDept_name()
    {
        return dept_name;
    }
    public void setDept_name(String dept_name)
    {
        this.dept_name = dept_name;
    }

    public String getTeacher_pswd()
    {
        return teacher_pswd;
    }
    public void setTeacher_pswd(String teacher_pswd)
    {
        this.teacher_pswd = teacher_pswd;
    }
}
