/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;
import java.sql.*;
import javax.swing.*; 

/**
 *
 * @author lenovo
 */
public class Functions {
 
    public static void main(String args[]) 
    { 
      Functions f = new Functions();
    }

    
    public static boolean isNumeric(char st)  
    {  
        String str = Character.toString(st);
      try  
      {  
        double d = Double.parseDouble(str);  
      }  
      catch(NumberFormatException nfe)  
      {  
        return false;  
      }  
      return true;  
    }

    

public  static  void    NumericValidation( JTextField textfieldname ){                                    

    String jtf = textfieldname.getText();
    int flag = 0;
    for(int i=0;i<jtf.length();i++)
    {
        flag =0;
        if (isNumeric(jtf.charAt(i)) || (jtf.charAt(i)=='.'))
        {
            flag++;
        }
    }
    if(flag!=0)
    {
  
    }
    else
    {
        jtf = jtf.substring(0, jtf.length()-1);
        textfieldname.setText(jtf);
    }    
}

public static void FillCombo(JComboBox combo_box, String column_name, String table_name)
{
    try
        {            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
            Statement  st = con.createStatement();
            ResultSet res = st.executeQuery("select "+column_name+" from "+table_name+" where "+column_name+" is not null order by "+column_name+" asc ");
            while(res.next())
            {
               combo_box.addItem(res.getString(column_name));
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Sql error in functions");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"other error in functions:"+e);
            System.out.println(e.getMessage());
        }
}

public static boolean NumericValidate( JTextField textfieldname){                                    

    if(!textfieldname.getText().equals(""))
    {
        String jtf = textfieldname.getText();
        int flag = 0;
        for(int i=0;i<jtf.length();i++)
        {
            flag =0;
            if (isNumeric(jtf.charAt(i)) || (jtf.charAt(i)=='.'))
            {
                flag++;
            }
        }
        if(flag!=0)
        {
            return true;
        }
        else
        {
            jtf = jtf.substring(0, jtf.length()-1);
            textfieldname.setText(jtf);
            return false;
        }
    }
    else
        textfieldname.setText("");
        return true;
}

}
