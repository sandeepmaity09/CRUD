package Connection

import java.sql.{Connection, DriverManager}

/**
  * Created by ghost on 1/2/17.
  */
object DBConnection {

  //connect to the database named "test"
  val url = "jdbc:mysql://localhost:3306/test"
  val driver = "com.mysql.jdbc.Driver"
  val username = "root"
  val password = "maity"

  Class.forName(driver)
  var connection: Connection = DriverManager.getConnection(url,username,password)
}
