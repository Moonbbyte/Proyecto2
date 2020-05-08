package proyecto_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class HilosFormato extends Thread {

    private  String nombre;
    private  String tipo;
    byte[] filebytes;
    FileInputStream entrada;
    FileOutputStream salida;

/////////////////contructor
    public HilosFormato(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

////////////////METODO RUN//////////////// 
    @Override
    public void run() {
    try{
    readFile();
    generateFiles();
    }catch(Exception e){}          
    }
//////////////////////////////OBTENER IMAGENES

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
////////////////////////////GRABAR ARCHIVO
    }

///////////////////////////////////CREAR IMAGENES
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
    //////////////// IMPRIMIRIA EL ARCHIVO SI NO FUERA TAN COMPLICADO PASSAR LOS DATOS
    }
    
    
    
    
    
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param aNombre the nombre to set
     */
    public  void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * @return the tipo
     */
    public  String getTipo() {
        return tipo;
    }

    /**
     * @param aTipo the tipo to set
     */
    public  void setTipo(String aTipo) {
        tipo = aTipo;
    }

}
