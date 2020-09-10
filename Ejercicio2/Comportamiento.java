package Agentes;

import jade.core.behaviours.Behaviour;
/**
 *
 * @author AlvaroPerez
 */
public class Comportamiento extends Behaviour{
    private int cont;
    
    public void action(){       
        System.out.println(cont);
        cont ++;
    }
    public boolean done(){
        if(cont < 101)
            return false;
        return true;
    }
     
}
