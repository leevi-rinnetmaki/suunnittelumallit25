package decorator;

public class XMLPrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.print("<message>" + message + "</message>");
    }
    
}
