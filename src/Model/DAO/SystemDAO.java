package Model.DAO;

import Model.Course;
import Model.Department;
import Model.Manager;
import Model.Message;
import Model.Student;
import Model.Take;
import Model.Teach;
import Model.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SystemDAO extends BaseDAO
{
    private List<Course> courses = new LinkedList<>();
    private List<Department> departments = new LinkedList<>();
    private List<Manager> managers = new LinkedList<>();
    private List<Message> messages = new LinkedList<>();
    private List<Student> students = new LinkedList<>();
    private List<Take> takes = new LinkedList<>();
    private List<Teacher> teachers = new LinkedList<>();
    private List<Teach> teaches = new LinkedList<>();

    public List<Course> getCourses()
    {
        String sql = "select * from course";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            ResultSet rs=pstmt.executeQuery();
            while (rs.next())
            {
                String courseIdInDB=rs.getString("course_id");
                String courseNameInDB=rs.getString("course_name");
                String courseDeptNameInDB=rs.getString("dept_name");
                String courseDescriptionInDB=rs.getString("course_description");
                Course oneCourse = new Course(courseIdInDB,courseNameInDB,courseDeptNameInDB,courseDescriptionInDB);
                courses.add(oneCourse);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
        return courses;
    }
    public void addCourse(Course course)
    {
        String sql = "insert into course values(?,?,?,?)";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,course.getCourse_id());
            pstmt.setString(2,course.getCourse_name());
            pstmt.setString(3,course.getDept_name());
            pstmt.setString(4,course.getCourse_description());
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            pstmt.execute();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
    }
    public List<Department> getDepartments()
    {
        String sql = "select * from department";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            ResultSet rs=pstmt.executeQuery();
            while (rs.next())
            {
                String dept_NameInDB=rs.getString("dept_name");
                Department oneDepartment = new Department(dept_NameInDB);
                departments.add(oneDepartment);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
        return departments;
    }
    public void addDepartment(Department department)
    {
        String sql = "insert into department values(?)";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,department.getDept_name());
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            pstmt.execute();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
    }
    public List<Manager> getManagers()
    {
        String sql = "select * from manager";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            ResultSet rs=pstmt.executeQuery();
            while (rs.next())
            {
                String managerIdInDB=rs.getString("manager_id");
                String managerNameInDB=rs.getString("manager_name");
                String managerPswdInDB=rs.getString("manager_pswd");
                Manager OneManager = new Manager(managerIdInDB,managerNameInDB,managerPswdInDB);
                managers.add(OneManager);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
        return managers;
    }
    public void addManager(Manager manager)
    {
        String sql = "insert into manager values(?,?,?)";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,manager.getManager_id());
            pstmt.setString(2,manager.getManager_name());
            pstmt.setString(3,manager.getMamager_pswd());
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            pstmt.execute();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
    }
    public List<Message> getMessages()
    {
        String sql = "select * from message";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            ResultSet rs=pstmt.executeQuery();
            while (rs.next())
            {
                String mesg_stu_idInDB=rs.getString("mesg_stu_id");
                String course_idInDB=rs.getString("course_id");
                String mesg_titleInDB=rs.getString("mesg_title");
                String mesg_contentInDB=rs.getString("mesg_content");
                java.sql.Date mesg_timeInDB = rs.getDate("mesg_time");
                Message oneMessage = new Message(mesg_stu_idInDB,course_idInDB,mesg_titleInDB,mesg_contentInDB,mesg_timeInDB);
                messages.add(oneMessage);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
        return messages;
    }
    public void addMessage(Message message)
    {
        String sql = "insert into message values(?,?,?,?,?)";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,message.getMesg_stu_id());
            pstmt.setString(2,message.getCourse_id());
            pstmt.setString(3,message.getMesg_title());
            pstmt.setString(4,message.getMesg_content());
            pstmt.setDate(5,message.getMesg_time());
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            pstmt.execute();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
    }
    public List<Student> getStudents()
    {
        String sql = "select * from student";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            ResultSet rs=pstmt.executeQuery();
            while (rs.next())
            {
                String studentIdInDB=rs.getString("student_id");
                String studentNameInDB=rs.getString("student_name");
                String studentDeptNameInDB=rs.getString("dept_name");
                String studentPswdInDB=rs.getString("student_pswd");
                Student oneStudent = new Student(studentIdInDB,studentNameInDB,studentDeptNameInDB,studentPswdInDB);
                students.add(oneStudent);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
        return students;
    }
    public void addStudent(Student student)
    {
        String sql = "insert into student values(?,?,?,?)";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,student.getStudent_id());
            pstmt.setString(2,student.getStudent_name());
            pstmt.setString(3,student.getDept_name());
            pstmt.setString(4,student.getStudent_pswd());
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            pstmt.execute();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
    }
    public List<Take> getTakes()
    {
        String sql = "select * from takes";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            ResultSet rs=pstmt.executeQuery();
            while (rs.next())
            {
                String studentIdInDB=rs.getString("student_id");
                String courseIdInDB=rs.getString("course_id");
                Take oneTake = new Take(studentIdInDB,courseIdInDB);
                takes.add(oneTake);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
        return takes;
    }
    public void addTake(Take take)
    {
        String sql = "insert into takes values(?,?)";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,take.getStudent_id());
            pstmt.setString(2,take.getCourse_id());
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            pstmt.execute();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
    }
    public List<Teacher> getTeachers()
    {
        String sql = "select * from teacher";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            ResultSet rs=pstmt.executeQuery();
            while (rs.next())
            {
                String teacherIdInDB=rs.getString("teacher_id");
                String teacherNameInDB=rs.getString("teacher_name");
                String teacherDeptNameInDB=rs.getString("dept_name");
                String teacherPswdInDB=rs.getString("teacher_pswd");
                Teacher oneTeacher = new Teacher(teacherIdInDB,teacherNameInDB,teacherDeptNameInDB,teacherPswdInDB);
                teachers.add(oneTeacher);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
        return teachers;
    }
    public void addTeacher(Teacher teacher)
    {
        String sql = "insert into teacher values(?,?,?,?)";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,teacher.getTeacher_id());
            pstmt.setString(2,teacher.getTeacher_name());
            pstmt.setString(3,teacher.getDept_name());
            pstmt.setString(4,teacher.getTeacher_pswd());
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            pstmt.execute();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
    }
    public List<Teach> getTeaches()
    {
        String sql = "select * from teach";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            ResultSet rs=pstmt.executeQuery();
            while (rs.next())
            {
                String teacherIdInDB=rs.getString("teacher_id");
                String courseIdInDB=rs.getString("course_id");
                Teach oneTeach = new Teach(teacherIdInDB,courseIdInDB);
                teaches.add(oneTeach);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
        return teaches;
    }
    public void addTeach(Teach teach)
    {
        String sql = "insert into teach values(?,?)";
        Connection conn = ConnectDataBase();
        PreparedStatement pstmt = null;
        try
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,teach.getTeacher_id());
            pstmt.setString(2,teach.getCourse_id());
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            pstmt.execute();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        DisConnectDataBase(pstmt,conn);
    }
}
