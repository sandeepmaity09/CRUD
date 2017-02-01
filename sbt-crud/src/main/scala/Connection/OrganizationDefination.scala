package Connection

/**
  * Created by ghost on 1/2/17.
  */
class  {

  def addEmployee(emp:Employee): Unit = {
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"INSERT INTO Employee VALUES ('${emp.ID}','${emp.NAME}','${emp.ADDRESS}','${emp.PHONE}','${emp.DEPT_ID}','${emp.PROJECT_ID}')")
  }

  def addDepartment(dept:Department): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"INSERT INTO Department VALUES ('${dept.ID}','${dept.NAME}')")
  }

  def addProject(proj:Project): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"INSERT INTO Project VALUES ('${proj.ID}','${proj.DEPT_ID}','${proj.NAME}','${proj.CLIENT_ID}')")
  }

  def addClient(clnt:Client): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"INSERT INTO Client VALUES ('${clnt.ID}','${clnt.NAME}','${clnt.ADDRESS}')")
  }

  def removeEmployee(emp:Employee): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"DELETE FROM Employee WHERE id = '${emp.ID}'")
  }

  def removeDepartment(dept:Department): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"DELETE FROM Department WHERE id = '${dept.ID}'")
  }

  def removeProject(proj:Project): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"DELETE FROM Project WHERE id = '${proj.ID}'")
  }

  def removeClient(clnt:Client): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"DELETE FROM Client WHERE id = '${clnt.ID}'")
  }

  def updateEmployee(emp:Employee): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"UPDATE Employee SET NAME = '${emp.NAME}',ADDRESS = '${emp.ADDRESS}',PHONE = '${emp.PHONE}',DEPT_ID = '${emp.DEPT_ID}',PROJECT_ID = '${emp.PROJECT_ID}' WHERE ID = '${emp.ID}'")
  }

  def updateDepartment(dept:Department): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"UPDATE Department SET NAME = '${dept.NAME}' WHERE ID = '${dept.ID}'")
  }

  def updateProject(proj:Project): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"UPDATE Project SET DEPT_ID = '${proj.DEPT_ID}',NAME='${proj.NAME}',CLIENT_ID = '${proj.CLIENT_ID}'")
  }

  def updateClient(clnt:Client): Unit ={
    val statemtent = DBConnection.connection.createStatement
    statemtent.executeUpdate(s"UPDATE Client SET ADDRESS = '${clnt.ADDRESS}',NAME = '${clnt.NAME}' WHERE ID = '${clnt.ID}'")
  }

  def selectEmployee(emp:Employee): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeQuery(s"SELECT * FROM Employee WHERE ID = '${emp.ID}'")
  }

}


object Demo extends App {
  val Obj = new OrganizationDefination
  //Obj.addEmployee(Employee(1,"Sandeep","Delhi","9929353227",1,1))
  //Obj.addDepartment(Department(1,"HR"))
  //Obj.addProject(Project(1,1,"Future",1))
  //Obj.addClient(Client(1,"Sandeep","Delhi"))
  //Obj.removeEmployee(Employee(2,"sandeep","delhi","1232",1,1))
  //Obj.removeDepartment(Department(2,"HR"))
  //Obj.removeProject(Project(1, 3, "sandeep", 2))
  //Obj.removeClient(Client(1,"Sandeep","Maity"))
  //Obj.updateEmployee(Employee(1,"Sandeep","Jaipur","9829546694",1,1))
  //Obj.updateDepartment(Department(1,"TECH"))
  //Obj.updateProject(Project(1,1,"Promise",1))
  //Obj.updateClient(Client(1,"Nitin","Gurugram"))
  Obj.selectEmployee(Employee(1,"Sandeep","Delhi","9929353227",1,1))

}
