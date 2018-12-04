/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author estudiante
 */

public class ConvServices {
    public ConvServices(){
    }
    
    float num=9/5;
    public float CelsiusFahrenheit(float celsius){ 
        float fahrenheit= (celsius*num)+32;
        return fahrenheit;
    }
    
    public float FahrenheitCelsius(float fahrenheit){
            float celsius=((fahrenheit -32)/num);
        return celsius;
    }

    public Object getInfo(Float accion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
