package Model;

import java.io.Serializable;

public class Teach implements Serializable
{
    private String teacher_id;
    private String course_id;

    public Teach(){}
    public Teach(String teacher_id,String course_id)
    {
        this.teacher_id = teacher_id;
        this.course_id = course_id;
    }

    public String getTeacher_id()
    {
        return teacher_id;
    }
    public void setTeacher_id(String teacher_id)
    {
        this.teacher_id = teacher_id;
    }
    public String getCourse_id()
    {
        return course_id;
    }
    public void setCourse_id(String course_id)
    {
        this.course_id = course_id;
    }
}
