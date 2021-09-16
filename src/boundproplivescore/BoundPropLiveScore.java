/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproplivescore;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class BoundPropLiveScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String result = "";
        MyPropertyBean source = new MyPropertyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        source.addPropertyChangeListener(listener1);
        source.addPropertyChangeListener(listener2);
        
        
        boolean end = true;
        while (end) {
            System.out.print("Enter Score ");
            result = inp.nextLine();
            if (result.equals("")) {  
                end = !end;
                break;
            } else {
                source.setScore(result);
            }
        }
        inp.close();
        
    }
    
}
