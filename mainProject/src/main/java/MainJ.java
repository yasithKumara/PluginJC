import java.util.Scanner;

public class MainJ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter expression : ");
        String expression = scanner.nextLine();

        System.out.println("Enter minimum value for X : ");
        Double minX = scanner.nextDouble();

        System.out.println("Enter maximum value for X : ");
        Double maxX = scanner.nextDouble();

        System.out.println("Enter increment value for X : ");
        Double incX = scanner.nextDouble();

        PythonScriptHandler pythonScriptHandler = new PythonScriptHandler();
        Foo foo = new Foo();
        pythonScriptHandler.runScript(foo,expression,minX,maxX,incX);
    }
}

