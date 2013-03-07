/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;
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

    try{
    String jtf = textfieldname.getText();
    int flag=0;
    for(int i=0;i<jtf.length();i++)
    {
        flag=1;
        if (isNumeric(jtf.charAt(i)) || (jtf.charAt(i)=='.'))
        {
            flag++;
        }
    }
    if(flag!=1)
    {
  
    }
    else
    {
        jtf = jtf.substring(0, jtf.length()-1);
        textfieldname.setText(jtf);
    }    
} 
    catch (Exception e)
            {
          JOptionPane.showMessageDialog(null, "the numeric value err is:" +e); 
            }
}


}
