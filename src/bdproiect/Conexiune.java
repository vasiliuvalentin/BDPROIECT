/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdproiect;

import java.sql.*;
import javax.swing.*;
public class Conexiune {
	Connection con = null;
	public static Connection DBConector(){
		try{
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","12345");
			//JOptionPane.showMessageDialog(null, "Connectare cu succes");
			return con;
		}
                catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
		
	}
}
