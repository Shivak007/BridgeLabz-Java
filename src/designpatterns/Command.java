package designpatterns;
interface Commands { void execute(); }
class Light { void on(){ System.out.println("Light ON"); } }
class LightOnCommand implements Commands {
    private Light light;
    LightOnCommand(Light l){ light=l; }
    public void execute(){ light.on(); }
}
public class Command {
    public static void main(String[] args){
        Commands cmd=new LightOnCommand(new Light());
        cmd.execute();
    }
}