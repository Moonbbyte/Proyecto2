package proyecto_2;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;

public class HilosBn extends Thread {

    File Originalimage;
    BufferedImage img = null;
    byte[] filebytes;
    FileOutputStream salida;
    String nombre;

    public HilosBn(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try{
        readFile();
        generateFiles();
        BN();
        convertirjpg();
        }catch(Exception e){e.printStackTrace();}

    }

    public void readFile() throws Exception {
        FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenes\\" + this.nombre + ".jpg");
        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        System.out.println("Imagen leida: " + this.nombre);
    }

    public void generateFiles() throws Exception {
        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.nombre+ ".bmp");
        salida.write(filebytes);
        salida.close();
        System.out.println("Imagen generada: " + this.nombre);
    }

    public void convertirjpg() throws Exception {
        FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\BN-" + this.nombre + ".bmp");
        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\BN-" + this.nombre + ".jpg");
        salida.write(filebytes);
        salida.close();

    }

    public void BN() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.nombre + ".bmp");
        try {
            img = ImageIO.read(Originalimage);

            for (int i = 0; i < img.getHeight(); i++) {
                for (int j = 0; j < img.getWidth(); j++) {

                    Color c = new Color(img.getRGB(j, i));
                    int r = c.getRed();
                    int b = c.getBlue();
                    int g = c.getGreen();
                    int a = c.getAlpha();
                    int gris = (int) ((r + b + g) / 3);

                    Color scolor = new Color(gris, gris, gris, a);
                    img.setRGB(j, i, scolor.getRGB());

                }

            }

            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\BN-" + this.nombre + ".bmp");
            ImageIO.write(img, "BMP", Image);

        } catch (Exception e) {

            System.out.println(e);
        }
    }

}
