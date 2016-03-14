/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backup;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jermaine
 */
public class DatabaseBackup {
    
    
    public static void main(String args[]) throws Exception
    {
        String url = "jdbc:derby://localhost:1527/StudentRecordManagementSystem";
        String pWord = "LetMeIn99";
        String uName = "JAdmin";
       Connection conn = DriverManager.getConnection(url, uName, pWord);
       backUpDatabase(conn);
    }
    public static void backUpDatabase(Connection conn)
		throws SQLException {
	String backupDirectory = "C:/Users/jermaine/Documents/database";
	String sql = "CALL SYSCS_UTIL.SYSCS_BACKUP_DATABASE(?)";
	CallableStatement cs = conn.prepareCall(sql);
	cs.setString(1, backupDirectory);
	cs.execute();
	cs.close();
}
    }

