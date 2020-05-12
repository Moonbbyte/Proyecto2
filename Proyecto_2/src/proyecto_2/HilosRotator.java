package proyecto_2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;

public class HilosRotator extends Thread {

    File Originalimage;
    BufferedImage img = null;
    byte[] filebytes;
    FileOutputStream salida;
    String nombre;
    private int porcentaje = 0;
    private int size;
    private static int iteracion = 0;

    /**
     * Constructor de la clase HilosRotator
     *
     * @param nombre nombre de la imagen a editar
     */
    public HilosRotator(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que permite la inicializacion de los metodos de edicion de imagen con procedimiento de hilos
  *
     */
    @Override
    public void run() {
        try {
            readFile();
            generateFiles();
            rotarvertical();
            rotarhorizontal();
            pasaraJpg();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * introduce la imagen solicitada a un array de bytes
     *
    
  *
     */
    public void readFile() throws Exception {
        FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenes\\" + this.nombre + ".jpg");
        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        System.out.println("Imagen leida: " + this.nombre);
    }

    /**
     * Genera una copia de la imagen introducida en el array de bits en formmato bmp
     
     */
    public void generateFiles() throws Exception {
        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.nombre + ".bmp");
        salida.write(filebytes);
        salida.close();
        System.out.println("Imagen generada: " + this.nombre);

    }

    /**
     *Pasa las imagenes editadas a un formato jpg
   
     */
    public void pasaraJpg() throws Exception {
        String name = "Hrotation-" + this.nombre;

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                name = "Vrotation-" + this.nombre;
            } else if (i == 1) {
                name = "Hrotation-" + this.nombre;
                setIteracion(getIteracion() + 1);
                porcentaje = (int) ((getIteracion() / getSize()) * 100);
                Convertidor.cargaproceso.setValue(porcentaje);
            }
            FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + name + ".bmp");
            filebytes = new byte[input.available()];
            input.read(filebytes);
            input.close();
            System.out.println("Imagen leida: " + this.nombre);

            salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + name + ".jpg");
            salida.write(filebytes);
            salida.close();
            System.out.println("Imagen generada: " + this.nombre);

        }

    }
/**
  * Metodo que hace rotar la imagen 180 sobre el eje vertical
  
  **/ 
    public void rotarvertical() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.nombre + ".bmp");
        try {
            img = ImageIO.read(Originalimage);
            BufferedImage rot = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
            for (int y = 0; y < img.getHeight(); y++) {
                for (int x = 0; x < img.getWidth(); x++) {

                    rot.setRGB((img.getWidth() - 1) - x, y, img.getRGB(x, y));

                }

            }
            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\Vrotation-" + this.nombre + ".bmp");
            ImageIO.write(rot, "BMP", Image);
        } catch (Exception e) {
        }

    }
/**
  * Metodo que permite rotar una imagen sobre el eje horizontal
  
  **/ 
    public void rotarhorizontal() {
        this.Originalimage = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\" + this.nombre + ".bmp");
        try {
            img = ImageIO.read(Originalimage);
            BufferedImage rot = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
            for (int y = 0; y < img.getHeight(); y++) {
                for (int x = 0; x < img.getWidth(); x++) {

                    rot.setRGB(x, (img.getHeight() - 1) - y, img.getRGB(x, y));

                }

            }
            File Image = new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\Hrotation-" + this.nombre + ".bmp");
            ImageIO.write(rot, "BMP", Image);

        } catch (Exception e) {
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
     * Establece la cantidad de imagenes almacenadas en una categoria
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Retorna elnumero de veces que se edito.
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
