/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static java.nio.file.StandardCopyOption.*;

/**
 *
 * @author lenovo
 */
public class BackUp {
    
    
    public static void main(String args[])
    {
        BackUp b = new BackUp();
        
          }
    
    public static void backup()
    {
    
        
         java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
         
         Path source = Paths.get("C:\\Program Files\\Software\\hyderproject\\DB\\indlands.accdb");
            Path target = Paths.get("C:\\Backup\\backup-"+sqlDate+".accdb");
        try {
            Files.copy(source, target,REPLACE_EXISTING);
            JOptionPane.showMessageDialog(null, "Done");
        } catch (IOException ex) {
            
           ex.printStackTrace();
           
        }
    }
    
}
