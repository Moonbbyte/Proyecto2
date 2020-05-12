package proyecto_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class HilosFormato extends Thread {
    private int porcentaje=0;
    private int size;
    private static int iteracion=0;
    private  String nombre;
    private  String tipo;
    byte[] filebytes;
    FileInputStream entrada;
    FileOutputStream salida;

/**
 * Constructor de la clase
 * @param nombre establece a todo el programa el nombre de la imagen a editar
 * @param tipo establece el tipo de imagen introducida
 * 
 **/
    public HilosFormato(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
/**
 * Metodo que permite iniciar los demas metodos a traves de hilos
   **/
    @Override
    public void run() {
    try{
    readFile();
    generateFiles();
    }catch(Exception e){}          
    }
/**
     * Introduce la imagen  solicitada al array de bytes en el formato solicitado
     **/
    public void readFile() throws Exception {
        if (getTipo().equals("jpg")) {

            FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenes\\" + getNombre() + ".jpg");
            filebytes = new byte[input.available()];
            input.read(filebytes);
            input.close();
            System.out.println("Imagen leida: " + getNombre());

        } else if (getTipo().equals("bmp")) {
            FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\ImagenesBmp\\" + getNombre() + ".bmp");
            filebytes = new byte[input.available()];
            input.read(filebytes);
            input.close();
            System.out.println("Imagen leida: " + getNombre());

        }

    }

/**
 * Crea una copia en el formato solicitado de la imagen  introducida al array de archivos
 **/
    public void generateFiles() throws Exception{
     if(getTipo().equals("bmp")){
        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\Converted-" +getNombre()+ ".jpg");
        salida.write(filebytes);
        salida.close();
     }else if (getTipo().equals("jpg")) {
       salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\Converted-" +getNombre()+ ".bmp");
       salida.write(filebytes);
       salida.close();
     }
        setIteracion(getIteracion() + 1);
     porcentaje=(int)((getIteracion()/size)*100);
     Convertidor.cargaproceso.setValue(porcentaje);
    
    }
    
    
    
    
    
    
    
    /**
     * Permite obtener el nombre de la imagen que se esta editando
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * Establece el nombre de la imagen a editar
     * @param aNombre the nombre to set
     */
    public  void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Permite obtener el tipo de la imagen que se esta editando
     * @return the tipo
     */
    public  String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de la imagen a editar
     * @param aTipo the tipo to set
     */
    public  void setTipo(String aTipo) {
        tipo = aTipo;
    }

    /**
     * @return the numero
     */
 
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
     * @return the iteracion
     */
    public static int getIteracion() {
        return iteracion;
    }

    /**
     * @param aIteracion the iteracion to set
     */
    public static void setIteracion(int aIteracion) {
        iteracion = aIteracion;
    }

}
