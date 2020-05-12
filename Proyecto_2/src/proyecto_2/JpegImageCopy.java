package proyecto_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;

public class JpegImageCopy extends ImageHandler {

    byte[] filebytes;
    FileOutputStream salida;
/**
 * Constructor de la clase 
 * @param filename establece el nombre de la imagen a editar
 **/
    public JpegImageCopy(String filename) {
        super(filename);
    }
    /**
     * Introduce la imagen solicitada al array de bytes
     **/
    
    @Override
    public void readFile() throws Exception {
        FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\copia-" + this.handledFileName + ".bmp");

        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        System.out.println("Imagen leida: " + this.handledFileName);

    }

  /**
 * Crea una copia jpg de la imagen  introducida al array de archivos
 **/
    @Override
    public void generateFiles() throws Exception {
        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\copia-" + this.handledFileName + ".jpg");
        salida.write(filebytes);
        salida.close();
        System.out.println("Imagen generada: " + this.handledFileName);

        ///////////////////////si se quiero borrar el archivo algun archivo copiado////////////////////////
        /*  File fichero= new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\copia-"+this.handledFileName+".bmp");         
                fichero.delete();*/
    }

}
