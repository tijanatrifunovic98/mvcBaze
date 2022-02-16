/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.db.DbConnectionFactory;
import view.controller.ViewController;

/**
 *
 * @author trifu
 */
public class main {

   /**
     * @param args the command line arguments     */
 public static void main(String[] args) {
     ViewController.getInstance().openMainForm();
        try {
            DbConnectionFactory.getInstance().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
    
    
}
