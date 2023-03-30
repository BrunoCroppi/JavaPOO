/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cropp
 */
public class Circunferencia {
    private float radio;
    

    public void Circunferencia(){
    
}
    public void Circunferencia(float radio){
    this.radio=radio;
}
    public float area(){
        return (float) (Math.PI*Math.pow(radio,2));
    }
    
}


