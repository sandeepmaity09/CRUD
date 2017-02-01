package Connection

abstract class Organization
case class Employee(ID: Int, NAME: String,ADDRESS: String, PHONE: String, DEPT_ID: Int, PROJECT_ID: Int) extends Organization
case class Department(ID: Int, NAME: String) extends Organization
case class Project(ID: Int, DEPT_ID: Int, NAME:String, CLIENT_ID:Int) extends Organization
case class Client(ID: Int, NAME: String, ADDRESS: String) extends Organization
