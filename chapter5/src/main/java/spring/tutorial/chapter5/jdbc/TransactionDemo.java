package spring.tutorial.chapter5.jdbc;

import java.sql.*;

public class TransactionDemo {
  public static void main(String[] args) throws SQLException {

    Connection conn = null;

    ResultSet rs = null;
    PreparedStatement prestmt = null;
    try {
      // 注册驱动
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      // 通过注册的驱动获得连接对象Connection
      conn =
          DriverManager.getConnection(
              "jdbc:mysql://127.0.0.1:3306/daodemodb?useUnicode=true&characterEncoding=UTF-8"
                  + "&serverTimezone=UTC&useSSL=false",
              "root",
              "123456");
      // 手动开启事务
      conn.setAutoCommit(false);
      String sql = "update  t_user set money=money-? where id=?";
      prestmt = conn.prepareStatement(sql);

      prestmt.setDouble(1, -111.11);
      prestmt.setInt(2, 2);
      prestmt.addBatch();

      prestmt.setDouble(1, 111.11);
      prestmt.setInt(2, 1);
      prestmt.addBatch();

      // 批处理
      prestmt.executeBatch();

      // 提交事务
      conn.commit();

    } catch (SQLException e) {
      // 事务回滚
      conn.rollback();
      System.out.println(e.getMessage());
      e.printStackTrace();
    } finally {
      // 释放资源
      if (conn != null) {
        conn.close();
      }
      if (prestmt != null) {
        prestmt.close();
      }
      if (rs != null) {
        rs.close();
      }
    }
  }
}
