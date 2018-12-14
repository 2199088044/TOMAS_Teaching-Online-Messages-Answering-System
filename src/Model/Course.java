package Model;

import java.io.Serializable;

public class Course implements Serializable
{
    private String course_id;
    private String course_name;
    private String dept_name;
    private String course_description;

    public Course(){}
    public Course(String course_id,String course_name,String dept_name,String course_description)
    {
        this.course_id = course_id;
        this.course_name = course_name;
        this.dept_name = dept_name;
        this.course_description = course_description;
    }

    public String getCourse_id()
    {
        return course_id;
    }
    public void setCourse_id(String course_id)
    {
        this.course_id = course_id;
    }

    public String getCourse_name()
    {
        return course_name;
    }
    public void setCourse_name(String course_name)
    {
        this.course_name = course_name;
    }

    public String getDept_name()
    {
        return dept_name;
    }
    public void setDept_name(String dept_name)
    {
        this.dept_name = dept_name;
    }

    public String getCourse_description()
    {
        return course_description;
    }
    public void setCourse_description(String course_description)
    {
        this.course_description = course_description;
    }
}
