package Connection

/**
  * Created by ghost on 1/2/17.
  */
class methodsForDepartment {

  def addProject(proj:Project): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"INSERT INTO Project VALUES ('${proj.ID}','${proj.DEPT_ID}','${proj.NAME}','${proj.CLIENT_ID}')")
  }

  

}
