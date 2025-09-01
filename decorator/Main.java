package decorator;

public class Main {
    public static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        EncryptedPrinter encryptedPrinter = new EncryptedPrinter();
        XMLPrinter xmlPrinter = new XMLPrinter();

        basicPrinter.print("Basic printer");
        System.out.println();
        encryptedPrinter.print("Caesar cipher is an old way of encrypting messsages");
        System.out.println();
        xmlPrinter.print("XML is similar to HTML");
    }
}
