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
public class JpegImageHandlerBn1 extends ImageHandler {

    File Originalimage;
    BufferedImage img = null;
    byte[] filebytes;
    FileOutputStream salida;
    private int porcentaje = 0;
    private int size;
    private static int iteracion = 0;

    public JpegImageHandlerBn1(String filename) {
        super(filename);
    }

    public void Todoslosmetodos() {
        try {
            readFile();
            generateFiles();
            BN();
            convertirjpg();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void readFile() throws Exception {
        FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenes\\" + this.handledFileName + ".jpg");
        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        System.out.println("Imagen leida: " + this.handledFileName);
    }

    @Override
    public void generateFiles() throws Exception {
        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.handledFileName + ".bmp");
        salida.write(filebytes);
        salida.close();
        System.out.println("Imagen generada: " + this.handledFileName);
    }

    public void convertirjpg() throws Exception {
        FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\BN-" + this.handledFileName + ".bmp");
        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\BN-" + this.handledFileName + ".jpg");
        salida.write(filebytes);
        salida.close();
        iteracion++;
        porcentaje = (int) ((iteracion / getSize()) * 100);
        Convertidor.cargaproceso.setValue(porcentaje);

    }

    public void BN() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.handledFileName + ".bmp");
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

            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\BN-" + this.handledFileName + ".bmp");
            ImageIO.write(img, "BMP", Image);

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
}
