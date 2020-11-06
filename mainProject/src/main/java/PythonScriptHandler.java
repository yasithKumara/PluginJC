import org.python.core.PyFloat;
import org.python.util.PythonInterpreter;

public class PythonScriptHandler
{
    public void runScript(Foo api, String expression, Double minX, Double maxX, Double incX)
    {

// Initialise the interpreter
        PythonInterpreter interpreter = new PythonInterpreter();
// Bind the API to the script environment
        interpreter.set("api", api);
// Run the script

        System.out.println("I was here");

        interpreter.exec("print(\"Python script running...\")\n" +
                "import Foo\n" +
                "foo = Foo()\n" +
                "foo.sayHello()\n" +
                "print(\"Yup Python script is still running...\")");

        for(Double x = minX;x<=maxX;x=x+incX){
            String cpyExp = expression;
            String exp = cpyExp.replaceAll("x", String.valueOf(x));
            double result = ((PyFloat) interpreter.eval("float(" + exp + ")")).getValue();
            System.out.println(result);
        }
    }
}