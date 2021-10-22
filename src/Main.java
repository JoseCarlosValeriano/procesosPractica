import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ProcessBuilder processBuilder= new ProcessBuilder();
        processBuilder.command("open","-a", "Google Chrome", "http://www.google.es");
        Process process;

        try {
            process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
