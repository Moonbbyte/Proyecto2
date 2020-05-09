/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author Brandon
 */
public class JpegImageHandlerRotator1 extends ImageHandler {
    File Originalimage;
    BufferedImage img = null;
    byte[] filebytes;
    FileOutputStream salida;

    public JpegImageHandlerRotator1(String filename) {
        super(filename);
    }
    
    public void Todoslosmetodos(){
     try{
        readFile();
        generateFiles();
        rotarvertical();
        rotarhorizontal();
        pasaraJpg();
        
        }catch(Exception e){e.printStackTrace();}
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

    public void pasaraJpg() throws Exception {
        String name="Hrotation-"+this.handledFileName;

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                name = "Vrotation-" + this.handledFileName;
            } else if (i == 1) {
                name = "Hrotation-" + this.handledFileName;
            }
            FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + name + ".bmp");
            filebytes = new byte[input.available()];
            input.read(filebytes);
            input.close();
            System.out.println("Imagen leida: " + this.handledFileName);

            salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + name+ ".jpg");
            salida.write(filebytes);
            salida.close();
            System.out.println("Imagen generada: " + this.handledFileName);

        }

    }

    public void rotarvertical() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.handledFileName + ".bmp");
        try {
            img = ImageIO.read(Originalimage);
            BufferedImage rot = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
            for (int y = 0; y < img.getHeight(); y++) {
                for (int x = 0; x < img.getWidth(); x++) {

                    rot.setRGB((img.getWidth() - 1) - x, y, img.getRGB(x, y));

                }

            }
            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\Vrotation-" + this.handledFileName + ".bmp");
            ImageIO.write(rot, "BMP", Image);
        } catch (Exception e) {
        }

    }

    public void rotarhorizontal() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.handledFileName + ".bmp");
        try {
            img = ImageIO.read(Originalimage);
            BufferedImage rot = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
            for (int y = 0; y < img.getHeight(); y++) {
                for (int x = 0; x < img.getWidth(); x++) {

                    rot.setRGB(x, (img.getHeight() - 1) - y, img.getRGB(x, y));

                }

            }
            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\Hrotation-" + this.handledFileName + ".bmp");
            ImageIO.write(rot, "BMP", Image);

        } catch (Exception e) {
        }

    }
}
