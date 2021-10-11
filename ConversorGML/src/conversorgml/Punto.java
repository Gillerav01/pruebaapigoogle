package conversorgml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Punto {
    private double X;
    private double Y;

    public Punto(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    @Override
    public String toString() {
        return "Punto{" + "X=" + X + ", Y=" + Y + '}';
    }
    
    public String data(){
        return this.X + ";" +  this.Y;
    }
    
     public static void guardarPuntos(ArrayList<Punto> puntos) {
        try {
            BufferedWriter bw = null;
            File f = new File("puntos.txt");
            if (f.createNewFile()) {
                try {
                    FileWriter fw = new FileWriter(f, true);
                    bw = new BufferedWriter(fw);
                    for (Punto e : puntos) {
                        bw.write(e.data());
                        bw.newLine();
                    }
                } catch (IOException e) {
                    System.out.println("Error");
                } finally {
                    try {
                        bw.close();
                    } catch (IOException ex) {
                        System.out.println("Error");
                    }
                }
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
