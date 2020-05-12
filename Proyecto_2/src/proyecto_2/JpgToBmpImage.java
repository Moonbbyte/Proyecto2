package proyecto_2;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class JpgToBmpImage extends ImageHandler {
   private  String nombre="xD";
   private static String tipo="";
    FileInputStream entrada;
    FileOutputStream salida;
   byte[] img;
    private File archivo;
/**
 * Constructor de la clase
 * @param filename establece a todo el programa el nombre de la imagen a editar
 **/
    public JpgToBmpImage(String filename) {
        super(filename);
        
    }
  /**
     * Introduce la imagen jpg solicitada al array de bytes
     **/
    @Override
    public void readFile() throws Exception {
        img = new byte[1024 * 768];
        try {
           img= AgregarImagen(this.archivo);
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    /**
     * Retorna la imagen al metodo readFile()
     * @return byte[] img1 retorna un array de bytes
     **/
    public byte[] AgregarImagen(File archivo){
    byte[]  img1 = new byte[1024 * 768];
     try {
            entrada = new FileInputStream(archivo);
            entrada.read(img1);
            
        } catch (Exception e) {
            System.out.println(e);
        }
     return img1;
    }
    
    
/**
 * Crea una copia bmp de la imagen  introducida al array de archivos
 **/
    @Override
    public void generateFiles() throws Exception {
                        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\converted-"+getNombre()+".bmp");
                        salida.write(img);
                        salida.close();
                  
    }
    
    public void cargarImagen() throws Exception{
                    
    
    
    }
    
    public void crearImagen() throws Exception{
    
    
    }
    
    
    
    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo
     */
    public static String getTipo() {
        return tipo;
    }

    /**
     * @param aTipo the tipo to set
     */
    public static void setTipo(String aTipo) {
        tipo = aTipo;
    }

}
