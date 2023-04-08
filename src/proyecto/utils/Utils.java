/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.utils;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author dylan
 */
public class Utils {
    
    
    public void ShowPanel(JPanel childrenPanel, JPanel parentPanel, int witdh, int height){
        childrenPanel.setSize(witdh,height);
        childrenPanel.setLocation(0, 0);
        
        parentPanel.removeAll();
        parentPanel.add(childrenPanel, BorderLayout.CENTER);
        parentPanel.revalidate();
        parentPanel.repaint();
    }
}
