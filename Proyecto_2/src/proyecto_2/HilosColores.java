package proyecto_2;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;

public class HilosColores extends Thread {

    File Originalimage;
    BufferedImage img = null;
    byte[] filebytes;
    FileOutputStream salida;
    String nombre;

    public HilosColores(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            readFile();
            generateFiles();
            sepia();
            red();
            blue();
            green();
            pasarBmpajpg();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void readFile() throws Exception {
        FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenes\\" + this.nombre + ".jpg");
        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        System.out.println("Imagen leida: " + this.nombre);

    }

    public void generateFiles() throws Exception {
        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.nombre + ".bmp");
        salida.write(filebytes);
        salida.close();
        System.out.println("Imagen generada: " + this.nombre);

    }

    public void pasarBmpajpg() throws Exception {
        String x = "";

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                x = "red-";
            } else if (i == 1) {
                x = "blue-";
            } else if (i == 2) {
                x = "green-";
            } else if (i == 3) {
                x = "sepia-";
            }
            FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + x + this.nombre + ".bmp");
            filebytes = new byte[input.available()];
            input.read(filebytes);
            input.close();

            salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + x + this.nombre + ".jpg");
            salida.write(filebytes);
            salida.close();

        }
    }

    public void sepia() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.nombre + ".bmp");
        try {
            img = ImageIO.read(Originalimage);
            BufferedImage sepia = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
            for (int i = 0; i < img.getHeight(); i++) {
                for (int j = 0; j < img.getWidth(); j++) {
                    int p = img.getRGB(j, i);

                    Color c = new Color(img.getRGB(j, i));
                    int r = c.getRed();
                    int b = c.getBlue();
                    int g = c.getGreen();
                    int a = c.getAlpha();
                    int tr = (int) (0.393 * r + 0.769 * g + 0.189 * b);
                    int tg = (int) (0.349 * r + 0.686 * g + 0.168 * b);
                    int tb = (int) (0.272 * r + 0.534 * g + 0.131 * b);
                    if (tr > 255) {
                        tr = 255;
                    }
                    if (tg > 255) {
                        tg = 255;
                    }
                    if (tb > 255) {
                        tb = 255;
                    }

                    Color scolor = new Color(tr, tg, tb, a);
                    img.setRGB(j, i, scolor.getRGB());

                }

            }

            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\sepia-" + this.nombre + ".bmp");
            ImageIO.write(img, "BMP", Image);

        } catch (Exception e) {

            System.out.println(e);
        }

    }

    public void green() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.nombre + ".bmp");
        try {
            img = ImageIO.read(Originalimage);
            BufferedImage sepia = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
            for (int i = 0; i < img.getHeight(); i++) {
                for (int j = 0; j < img.getWidth(); j++) {

                    Color c = new Color(img.getRGB(j, i));
                    int r = c.getRed();
                    int b = c.getBlue();
                    int g = c.getGreen();
                    int a = c.getAlpha();

                    Color scolor = new Color(0, g, 0, a);
                    img.setRGB(j, i, scolor.getRGB());

                }

            }

            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\green-" + this.nombre + ".bmp");
            ImageIO.write(img, "BMP", Image);

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public void red() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.nombre + ".bmp");
        try {
            img = ImageIO.read(Originalimage);
            BufferedImage sepia = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
            for (int i = 0; i < img.getHeight(); i++) {
                for (int j = 0; j < img.getWidth(); j++) {

                    Color c = new Color(img.getRGB(j, i));
                    int r = c.getRed();
                    int b = c.getBlue();
                    int g = c.getGreen();
                    int a = c.getAlpha();

                    Color scolor = new Color(r, 0, 0, a);
                    img.setRGB(j, i, scolor.getRGB());

                }

            }

            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\red-" + this.nombre + ".bmp");
            ImageIO.write(img, "BMP", Image);

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public void blue() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.nombre + ".bmp");
        try {
            img = ImageIO.read(Originalimage);
            BufferedImage sepia = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
            for (int i = 0; i < img.getHeight(); i++) {
                for (int j = 0; j < img.getWidth(); j++) {

                    Color c = new Color(img.getRGB(j, i));
                    int r = c.getRed();
                    int b = c.getBlue();
                    int g = c.getGreen();
                    int a = c.getAlpha();

                    Color scolor = new Color(0, 0, b, a);
                    img.setRGB(j, i, scolor.getRGB());

                }

            }

            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\blue-" + this.nombre + ".bmp");
            ImageIO.write(img, "BMP", Image);

        } catch (Exception e) {

            System.out.println(e);
        }
    }

}