/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restore;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jermaine
 */
public class DatabaseRestore {
    public static  void main(String args[]) throws Exception{
    String url = "jdbc:derby://localhost:1527/StudentRecordManagementSystem;restoreFrom=C:/Users/Jermain/Documents/database/StudentRecordManagementSystem";
        String pWord = "LetMeIn99";
        String uName = "JAdmin";
       Connection conn = DriverManager.getConnection(url, uName, pWord);
}
    
}
