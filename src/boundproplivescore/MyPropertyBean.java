/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproplivescore;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author asus
 */
public class MyPropertyBean implements Serializable {
    
    public static final String SCORE_PROPERTY = "score";
    
    private String score;
    
    private PropertyChangeSupport propertySupport;
    
    public MyPropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScore() {
        return score;
    }
    
    public void setScore(String value) {
        String oldValue = score;
        score = value;
        propertySupport.firePropertyChange(SCORE_PROPERTY, oldValue, score);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
