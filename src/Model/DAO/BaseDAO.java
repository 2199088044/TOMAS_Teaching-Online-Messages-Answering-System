package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaseDAO
{
    String dbURL="jdbc:sqlserver://localhost:1433; DatabaseName=教学在线留言答疑系统";
    //连接数据库，返回连接对象
    public Connection ConnectDataBase()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(dbURL,"sa","123");
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return conn;
    }
    //断开数据库连接
    public void DisConnectDataBase(PreparedStatement pstmt, Connection conn)
    {
        try
        {
            pstmt.close();
            conn.close();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
