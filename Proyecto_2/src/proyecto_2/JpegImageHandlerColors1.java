/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author Brandon
 */
public class JpegImageHandlerColors1 extends ImageHandler {

    File Originalimage;
    BufferedImage img = null;
    byte[] filebytes;
    FileOutputStream salida;
    private int porcentaje = 0;
    private int size;
    private static int iteracion = 0;

    /**
     * Constructor de la clase
     *
     * @param filename establece a toda la clase la imagen a editar
     *
     */
    public JpegImageHandlerColors1(String filename) {
        super(filename);
    }

    /**
     * Metodo que permite iniciar los demas metodos 
   *
     */
    public void Todoslosmetodos() {
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

    /**
     * Introduce la imagen solicitada al array de bytes
     *
     */
    @Override
    public void readFile() throws Exception {
        FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenes\\" + this.handledFileName + ".jpg");
        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        System.out.println("Imagen leida: " + this.handledFileName);

    }
//////////////////////CREAR UN ARCHIVO BMP
/**
 * Crea una copia bmp de la imagen  introducida al array de archivos
 **/
    @Override
    public void generateFiles() throws Exception {
        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.handledFileName + ".bmp");
        salida.write(filebytes);
        salida.close();
        System.out.println("Imagen generada: " + this.handledFileName);

    }
/**
 * Convierte la imagen ya editada de un formato bmp a un formato jpg
 **/
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
                setIteracion(getIteracion() + 1);
                porcentaje = (int) ((getIteracion() / getSize()) * 100);
                Convertidor.cargaproceso.setValue(porcentaje);
            }
            FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + x + this.handledFileName + ".bmp");
            filebytes = new byte[input.available()];
            input.read(filebytes);
            input.close();

            salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + x + this.handledFileName + ".jpg");
            salida.write(filebytes);
            salida.close();

        }

    }
/**
 * Metodo que genera una copia de la imagen solicitada a un color sepia
 **/
    public void sepia() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.handledFileName + ".bmp");
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

            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\sepia-" + this.handledFileName + ".bmp");
            ImageIO.write(img, "BMP", Image);

        } catch (Exception e) {

            System.out.println(e);
        }

    }
/**
 * Metodo que genera una copia de la imagen solicitada a un color verde
 **/
    public void green() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.handledFileName + ".bmp");
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

            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\green-" + this.handledFileName + ".bmp");
            ImageIO.write(img, "BMP", Image);

        } catch (Exception e) {

            System.out.println(e);
        }
    }
/**
 * Metodo que genera una copia de la imagen solicitada a un color rojo
 **/
    public void red() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.handledFileName + ".bmp");
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

            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\red-" + this.handledFileName + ".bmp");
            ImageIO.write(img, "BMP", Image);

        } catch (Exception e) {

            System.out.println(e);
        }
    }
/**
 * Metodo que genera una copia de la imagen solicitada a un color azul
 **/
    public void blue() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.handledFileName + ".bmp");
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

            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\blue-" + this.handledFileName + ".bmp");
            ImageIO.write(img, "BMP", Image);

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    /**
     * Permite obtener la cantidad de imagenes almacenadas
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     *  Establece la cantidad de imagenes almacenadas en una categoria
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Obtiene el numero de veces que se edita, depende del numero de imagenes almacenadas
     * @return the iteracion
     */
    public static int getIteracion() {
        return iteracion;
    }

    /**
     * Establece el numero de veces que se edito
     * @param aIteracion the iteracion to set
     */
    public static void setIteracion(int aIteracion) {
        iteracion = aIteracion;
    }
}
