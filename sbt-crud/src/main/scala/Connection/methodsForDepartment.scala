package Connection

/**
  * Created by ghost on 1/2/17.
  */
class methodsForDepartment {

  def addDepartment(dept:Department): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"INSERT INTO Department VALUES ('${dept.ID}','${dept.NAME}')")
  }

  def removeDepartment(dept:Department): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"DELETE FROM Department WHERE id = '${dept.ID}'")
  }

  def updateDepartment(dept:Department): Unit = {
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"UPDATE Department SET NAME = '${dept.NAME}' WHERE ID = '${dept.ID}'")
  }
}
