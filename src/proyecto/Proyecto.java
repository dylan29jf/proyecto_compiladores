/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author dylan
 */

import java.time.*;
import java.util.*;
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date date = new Date();

        System.out.println(date.toString());

        Instant timestamp = date.toInstant();
        ZonedDateTime localDate = timestamp.atZone(ZoneId.of("GMT-6"));
        
        System.out.println(localDate.toString());
        
    }

}
