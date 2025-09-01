package decorator;

public class EncryptedPrinter implements Printer {

    @Override
    public void print(String message) {
        for(char c : message.toCharArray()){
            System.out.print((char)(c + 3));
        }
    }
    
}