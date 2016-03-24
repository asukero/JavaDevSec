import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Created by thomas on 24/03/16.
 */
public class Exo1 {
    public static void evalScript(String name) throws  Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        engine.eval("print('"+ name + "')");
    }
}
