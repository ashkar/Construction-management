package pos;
import java.sql.*;
import javax.swing.*; 
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
public class Functions {
 
    public static void main(String args[]) 
    { 
      Functions f = new Functions();
    }

    
public static boolean isEmail(JTextField textfieldname) {
        int i = 0;
        String str = textfieldname.getText();
        
        if(!str.equals(""))
        {
        //boolean retvalue1 = str.contains("@");
        boolean retvalue2 = str.contains(".");
        
        for(int j=0;j<str.length();j++)
        {
            if(str.charAt(j)=='@')
            {
                i++;
            }
            if(str.charAt(str.length()-1)=='.')
            {
                return false;
            }
        }
        
        if((i==1)&&(retvalue2==true))
        {
            return true;
        }
        }
        return false;
    } 
public static boolean isNumeric(char st)  {  
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
if(!textfieldname.getText().equals(""))
{
    String jtf = textfieldname.getText();
    int flag = 0;
    int dot = 0;
    for(int i=0;i<jtf.length();i++)
    {
        flag =0;
//        if (isNumeric(jtf.charAt(i)) || (jtf.charAt(i)=='.'))
//        {
//            flag++;
//        }
        if (isNumeric(jtf.charAt(i)))
        {
            flag++;
        }
        else if(jtf.charAt(i)=='.' && dot==0)
        {
            flag++;
            dot++;
        }
        else if(jtf.charAt(i)=='.' && dot!=0)
        {
            jtf = jtf.substring(0, jtf.length()-1);
            textfieldname.setText(jtf);
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
else
{
    textfieldname.setText("");
}       
}
public static void Report(String name1,String name2) {                                          
     try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
            JasperDesign jd = JRXmlLoader.load("C:\\Program Files\\Software\\hyderproject\\reports\\"+name1+".jrxml");
            String sql = "select * from "+name2+"";
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = (JasperPrint) JasperFillManager.fillReport(jr, null, con);
            JasperViewer.viewReport(jp,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your handling code here:
    } 
public static void FillCombo(JComboBox combo_box, String column_name, String table_name){
    try
        {            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
            Statement  st = con.createStatement();
            ResultSet res = st.executeQuery("select distinct "+column_name+" from "+table_name+" where "+column_name+" is not null order by "+column_name+"");
            while(res.next())
            {
               combo_box.addItem(res.getString(column_name));
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Fillcombo err");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Fillcombo err1"+e);
            System.out.println(e.getMessage());
        }
}
public static void DisposeFunc(JFrame abc){
             int dialog = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to add more data?", "Success",dialog);
            if(dialogResult==JOptionPane.NO_OPTION)
            {
                abc.dispose();
            }
    
}
public static boolean NumericValidate( JTextField textfieldname){                                    

    if(!textfieldname.getText().equals(""))
    {
        String jtf = textfieldname.getText();
        int flag = 0;
        int dot = 0;
        for(int i=0;i<jtf.length();i++)
        {
            flag =0;
//            if (isNumeric(jtf.charAt(i)) || (jtf.charAt(i)=='.'))
//            {
//                flag++;
//            }
            if (isNumeric(jtf.charAt(i)))
        {
            flag++;
        }
        else if(jtf.charAt(i)=='.' && dot==0)
        {
            flag++;
            dot++;
        }
        else if(jtf.charAt(i)=='.' && dot!=0)
        {
            jtf = jtf.substring(0, jtf.length()-1);
            textfieldname.setText(jtf);
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
public static  String comboption(JFrame sname,String titlevalue,String columnname,String tablename,String input){
    
     String Select = titlevalue;
     input="";
        int num=0, i=0;
        try
        {            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
            Statement  st = con.createStatement();
            ResultSet res = st.executeQuery("select "+columnname+" from "+tablename+"");
            while(res.next())
            {
                num++;
             }
            
            String[] sport = new String[num];
            
            ResultSet res1 = st.executeQuery("select "+columnname+" from "+tablename+"");
            while(res1.next())
            {
                
                if(i<num)
                {
                    sport[i] = res1.getString(""+columnname+"");
                }
                i++;
            }
            
             input = (String) JOptionPane.showInputDialog(sname, "Please select your favorite sport",Select, JOptionPane.INFORMATION_MESSAGE,null,sport,null);
         }
        catch(SQLException e1)
        {
            JOptionPane.showMessageDialog(null,"FUNC.comboption err");
        }
        catch(Exception e2)
        {
            JOptionPane.showMessageDialog(null,"FUNC.comboption err2"+e2);
            System.out.println(e2.getMessage());
        }

    return input;
}
public static void NewItem (JComboBox combo_box, String column_name ){
 String worknew =  JOptionPane.showInputDialog(null, "Add new entry");
        while (worknew.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please add new entry");
            worknew = JOptionPane.showInputDialog(null, "Add new entry");
        }
        try{
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                 PreparedStatement prp=con.prepareStatement("insert into Names("+column_name+") values(?)");
                 prp.setString(1, worknew);
                 prp.executeUpdate(); 
                 combo_box.setSelectedItem(worknew);
                  con.commit();
                  con.close();
        }
         
             catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Err is"+e);
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"The error is1:"+e);
             }     
        

}
}

