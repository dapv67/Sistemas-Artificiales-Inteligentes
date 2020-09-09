import jade.core.behaviours.Behaviour;
/**
 *
 * @author AlvaroPerez
 */
public class Comportamiento extends Behaviour{
    private String name;
    
    public Comportamiento(String nombre){
        this.name = name;
    }
    public void action(){
        System.out.println("Hi world´s agents, I´m  ->"+ name);
    }
    public boolean done(){
        return true;
    }
     
}
