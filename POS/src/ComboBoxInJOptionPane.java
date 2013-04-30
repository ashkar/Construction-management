import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.*;

public class ComboBoxInJOptionPane extends JFrame{
  static final String Select = "Sports";
   String input = "";
  public ComboBoxInJOptionPane() {
    super(Select);
    JButton button=new JButton("Add");
  
  ActionListener lst = new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        
        ArrayList<String> al = new ArrayList<String>();
        List l = new List();
        int num=0;
        int i=0;
        
        try
        {            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
            Statement  st = con.createStatement();
            ResultSet res = st.executeQuery("select PRONAME from Project");
            while(res.next())
            {
                num++;
             }
            
            String[] sport = new String[num];
            
            ResultSet res1 = st.executeQuery("select PRONAME from Project");
            while(res1.next())
            {
                
                if(i<num)
                {
                    sport[i] = res1.getString("PRONAME");
                }
                i++;
            }
             input = (String) JOptionPane.showInputDialog(ComboBoxInJOptionPane.this,
                    "Please select your favorite sport",Select, JOptionPane.INFORMATION_MESSAGE, 
                    null,sport,null);
         }
        catch(SQLException e1)
        {
            JOptionPane.showMessageDialog(null,"INVALID datatype");
        }
        catch(Exception e2)
        {
            JOptionPane.showMessageDialog(null,"The error is1:"+e);
            System.out.println(e2.getMessage());
        }


     JOptionPane.showMessageDialog(null,"You have selected: "+input);
    }
    };
  System.out.println(input);
  button.addActionListener(lst);
  add(button);
  pack();
    setVisible(true);

  }
  public static void main(String argv[]) {
    new ComboBoxInJOptionPane();
  }
}
