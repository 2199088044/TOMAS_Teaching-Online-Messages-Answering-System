package Model;

import java.io.Serializable;
import java.sql.Date;

public class Message implements Serializable
{
    private String mesg_stu_id;
    private String course_id;
    private String mesg_title;
    private String mesg_content;
    private java.sql.Date mesg_time;

    public Message(){}
    public Message(String mesg_stu_id,String course_id,String mesg_title,String mesg_content,java.sql.Date mesg_time)
    {
        this.mesg_stu_id = mesg_stu_id;
        this.course_id = course_id;
        this.mesg_title = mesg_title;
        this.mesg_content = mesg_content;
        this.mesg_time = mesg_time;

    }

    public String getMesg_stu_id()
    {
        return mesg_stu_id;
    }
    public void setMesg_stu_id(String mesg_stu_id)
    {
        this.mesg_stu_id = mesg_stu_id;
    }

    public String getCourse_id()
    {
        return course_id;
    }
    public void setCourse_id(String course_id)
    {
        this.course_id = course_id;
    }

    public String getMesg_title()
    {
        return mesg_title;
    }
    public void setMesg_title(String mesg_title)
    {
        this.mesg_title = mesg_title;
    }

    public String getMesg_content()
    {
        return mesg_content;
    }
    public void setMesg_content(String mesg_content)
    {
        this.mesg_content = mesg_content;
    }

    public java.sql.Date getMesg_time()
    {
        return mesg_time;
    }
    public void setMesg_time(java.sql.Date mesg_time)
    {
        this.mesg_time = mesg_time;
    }
}
