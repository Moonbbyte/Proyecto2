package proyecto_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BmptoJpegImage extends ImageHandler {

    private String nombre = "xD";
    FileInputStream entrada;
    FileOutputStream salida;
    byte[] img;
    private File archivo;
/**
 * Constructor de la clase
 * @param filename establece a todo el programa el nombre de la imagen a editar
 **/
    public BmptoJpegImage(String filename) {
        super(filename);
    }
 /**
     * Introduce la imagen bmp solicitada al array de bytes
     **/
    @Override
    public void readFile() throws Exception {
        img = new byte[1024 * 768];
        try {
            img = AgregarImagen(this.archivo);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
/**
     * Retorna la imagen al metodo readFile()
     * @param archivo ingresa la imagen para su respectiva edicion
     * @return byte[] img1 retorna un array de bytes
     **/
    public byte[] AgregarImagen(File archivo) {
        byte[] img1 = new byte[1024 * 768];
        try {
            entrada = new FileInputStream(archivo);
            entrada.read(img1);
            entrada.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return img1;
    }
/**
 * Crea una copia jpg de la imagen  introducida al array de archivos
 **/
    @Override
    public void generateFiles() throws Exception {
 salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\converted-"+getNombre()+".jpeg");
                        salida.write(img);
                        salida.close();
                  
    }
    
      /**
       * Retorna el archivo donde esta almacenada una imagen
       * @return File retorna el archivo con la imagen almacenada
       **/
    public File getArchivo() {
        return archivo;
    }
/**
 * Ingresa una imagen para un Archivo
 * @param archivo ingresa una nuevo imagen para un archivo.
 **/
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

       /**
     * Retorna el nombre de la imagen a editar.
     * @return String nombre retorna el nombre de la imagen a editar
     */
    public String getNombre() {
        return nombre;
    }
/**
     * Establece el nombre de la imagen a editar
     * @param nombre Define el nombre de la imagen a editar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
