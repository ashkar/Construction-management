
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import org.jdesktop.swingx.JXDatePicker;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class test3 {
    
    
    final JLabel label = new JLabel();
   label.setText("Choose Date by selecting below.");
 
 final JXDatePicker datePicker = new JXDatePicker(System.currentTimeMillis());
datePicker.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		label.setText(datePicker.getDate().toString());
	}

    
}
}