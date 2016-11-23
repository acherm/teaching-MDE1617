package IDM.JOOQ;

//For convenience, always static import your generated tables and jOOQ functions to decrease verbosity:
import static IDM.JOOQ.generated.Tables.*;
import static org.jooq.impl.DSL.*;

import java.sql.*;

import org.jooq.*;
import org.jooq.impl.*;
public class App {
 public static void main(String[] args) {
     String userName = "root";
     String password = "123456";
     String url = "jdbc:mysql://localhost:3307/library";

     // Connection is the only JDBC resource that we need
     // PreparedStatement and ResultSet are handled by jOOQ, internally
     try (Connection conn = DriverManager.getConnection(url, userName, password)) {
    	 DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
    	 query1(create);
    	 query2(create);
    	 query3(create);
         conn.close();
     } 

     // For the sake of this tutorial, let's keep exception handling simple
     catch (Exception e) {
         e.printStackTrace();
     }
 }
 
 static //	SELECT * FROM author
 void query1(DSLContext context){
	 Result<Record> result = context
			 .select()
			 .from(AUTHOR)
			 .fetch();

     for (Record r : result) {
         Integer id = r.getValue(AUTHOR.ID);
         String firstName = r.getValue(AUTHOR.FIRST_NAME);
         String lastName = r.getValue(AUTHOR.LAST_NAME);

         System.out.println("ID: " + id + " first name: " + firstName + " last name: " + lastName);
     }
 }
 
 static //	SELECT dept.dname FROM dept
 void query2(DSLContext context){
	 Result<Record1<String>> result = context
			 .select(DEPT.DNAME)
			 .from(DEPT)
			 .fetch();

     for (Record r : result) {
         String name = r.getValue(DEPT.DNAME);

         System.out.println("name: " + name);
     }
 }
 
 static //	SELECT emp.ename,emp.job FROM dept,emp WHERE dept.loc = "DALLAS" AND emp.deptno = dept.deptno AND emp.job is not null;
 void query3(DSLContext context){
	 Result<Record2<String,String>> result = context
			 .select(EMP.ENAME,EMP.JOB)
			 .from(DEPT,EMP)
			 .where(DEPT.LOC.equal("DALLAS"))
			 	.and(EMP.DEPTNO.equal(DEPT.DEPTNO))
			 	.and(EMP.JOB.isNotNull())
			 .fetch();
	 
     for (Record r : result) {
         String ename = r.get(0).toString();
         String job = (String) r.getValue(1);

         System.out.println("NAME: " + ename + " JOB: " + job);
     }
 }
}