package Connection

/**
  * Created by ghost on 1/2/17.
  */
class methodsForClient {

  def addClient(clnt:Client): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"INSERT INTO Client VALUES ('${clnt.ID}','${clnt.NAME}','${clnt.ADDRESS}')")
  }

  def removeClient(clnt:Client): Unit ={
    val statement = DBConnection.connection.createStatement
    statement.executeUpdate(s"DELETE FROM Client WHERE id = '${clnt.ID}'")
  }

  def updateClient(clnt:Client): Unit ={
    val statemtent = DBConnection.connection.createStatement
    statemtent.executeUpdate(s"UPDATE Client SET ADDRESS = '${clnt.ADDRESS}',NAME = '${clnt.NAME}' WHERE ID = '${clnt.ID}'")
  }
}
