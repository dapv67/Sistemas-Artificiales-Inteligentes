import jade.core.Agent;
/**
 *
 * @author AlvaroPerez
 */
public class Agente extends Agent{
    protected void setup(){
        Comportamiento cm = new Comportamiento(this.getAID().getName());
        this.addBehaviour(cm);
        
    }
}
