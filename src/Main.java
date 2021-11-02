import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce la cantidad de navegadores que quieres ejecutar: ");
        int cantidad = lectura.nextInt();
        ArrayList<Process> processList = new ArrayList<Process>();

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");

        try {
            for (int i = 0; i < cantidad; i++) {
                Process process = processBuilder.start();
                processList.add(process);
            }

            for (Process process : processList) {
                while (process.isAlive()) {
                    process.waitFor();
                }
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}