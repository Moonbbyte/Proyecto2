package proyecto_2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;

public class JpegImageHandlerRotator extends ImageHandler {

    File Originalimage;
    BufferedImage img = null;
    byte[] filebytes;
    FileOutputStream salida;
/**
     * Constructor de la clase HilosRotator
     *
     * @param filename nombre de la imagen a editar
     */
    public JpegImageHandlerRotator(String filename) {
        super(filename);
    }
  /**
     * Metodo que permite la inicializacion de los metodos de edicion de imagen.
  *
     */   
    public void Todoslosmetodos(){
     try{
        readFile();
        generateFiles();
        rotarvertical();
        rotarhorizontal();
        pasaraJpg();
        
        }catch(Exception e){e.printStackTrace();}
    }
  /**
     * introduce la imagen solicitada a un array de bytes
     *
    
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
 /**
     * Genera una copia de la imagen introducida en el array de bits en formmato bmp
     
     */
    @Override
    public void generateFiles() throws Exception {
        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.handledFileName + ".bmp");
        salida.write(filebytes);
        salida.close();
        System.out.println("Imagen generada: " + this.handledFileName);

    }
/**
     *Pasa las imagenes editadas a un formato jpg
   
     */
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
/**
  * Metodo que hace rotar la imagen 180 sobre el eje vertical
  
  **/ 
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
/**
  * Metodo que permite rotar una imagen sobre el eje horizontal
  
  **/ 
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
