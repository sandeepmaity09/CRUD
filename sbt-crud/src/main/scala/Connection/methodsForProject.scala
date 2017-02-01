package Connection

/**
  * Created by ghost on 1/2/17.
  */
class methodsForProject {

  def addProject(proj:Project): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"INSERT INTO Project VALUES ('${proj.ID}','${proj.DEPT_ID}','${proj.NAME}','${proj.CLIENT_ID}')")
  }

  def removeProject(proj:Project): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"DELETE FROM Project WHERE id = '${proj.ID}'")
  }

  def updateProject(proj:Project): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"UPDATE Project SET DEPT_ID = '${proj.DEPT_ID}',NAME='${proj.NAME}',CLIENT_ID = '${proj.CLIENT_ID}'")
  }
}
