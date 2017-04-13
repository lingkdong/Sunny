package unit;

import org.apache.commons.lang.xwork.builder.ToStringBuilder;
import org.apache.commons.lang.xwork.builder.ToStringStyle;
import org.junit.Test;

import java.sql.*;
import java.util.Date;

/**
 * Created by DT254 on 2017/4/12.
 */
public class Run {
    @Test
    public void test(){
        Star star=new Star.Builder().name("google").pass("pass").createTime(new Date()).lastUpdateTime(new Date())
                .build();
        System.out.println(ToStringBuilder.reflectionToString(star, ToStringStyle.SHORT_PREFIX_STYLE));
    }

    @Test
    public void jdbcConnection() throws ClassNotFoundException, SQLException {
        //加载引擎
        Class.forName("com.mysql.jdbc.Driver");
        //创建连接 :3306 后面 一定要用单个 /
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sunny","root","");
        /**
         * 创建Statement
         * Statement:执行静态的Sql语句
         * PreparedStatement:执行动态sql
         * CallableStatement:执行存储过程
         * **/
        PreparedStatement statement=connection.prepareStatement("SELECT * FROM USER");
        //结果集
        ResultSet resultSet=statement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("username"));
        }

        if(resultSet!=null)resultSet.close();
        if(statement!=null)statement.close();
        if(connection!=null)connection.close();
    }
}
