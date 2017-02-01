package Connection

/**
  * Created by ghost on 1/2/17.
  */
class methodsForEmployee {

  def addEmployee(emp:Employee): Unit = {
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"INSERT INTO Employee VALUES ('${emp.ID}','${emp.NAME}','${emp.ADDRESS}','${emp.PHONE}','${emp.DEPT_ID}','${emp.PROJECT_ID}')")
  }

  def removeEmployee(emp:Employee): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"DELETE FROM Employee WHERE id = '${emp.ID}'")
  }

  def updateEmployee(emp:Employee): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"UPDATE Employee SET NAME = '${emp.NAME}',ADDRESS = '${emp.ADDRESS}',PHONE = '${emp.PHONE}',DEPT_ID = '${emp.DEPT_ID}',PROJECT_ID = '${emp.PROJECT_ID}' WHERE ID = '${emp.ID}'")
  }
}
