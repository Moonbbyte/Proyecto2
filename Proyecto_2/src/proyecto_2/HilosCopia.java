/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Brandon
 */
public class HilosCopia extends Thread {

    byte[] filebytes;
    String nombre;
    FileOutputStream salida;
    private int porcentaje = 0;
    private int size;
    private static int iteracion = 0;
/**
 * Constructor de la clase 
 * @param nombre establece el nombre de la imagen a editar
 **/
    public HilosCopia(String name) {
        this.nombre = name;
    }

    @Override
    public void run() {
        try {
            readFile();
            generateFiles();
            convertiraJpg();

        } catch (Exception e) {
        }

        ///////////////OBTENER JPG 
    }

    public void readFile() throws Exception {
        FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenes\\" + this.nombre + ".jpg");
        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        System.out.println("Imagen leida: " + this.nombre);

    }

    ////////GENERAR A BMP
    public void generateFiles() throws Exception {
        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\copia-" + this.nombre + ".bmp");
        salida.write(filebytes);
        salida.close();
        System.out.println("Imagen generada: " + this.nombre);

        ///////////////////////si se quiero borrar el archivo algun archivo copiado////////////////////////
        /*  File fichero= new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\copia-"+this.handledFileName+".bmp");         
                fichero.delete();*/
    }

    ////////CONVERTIR IMAGEN GENERADA EN JPG
    public void convertiraJpg() throws Exception {
        FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\copia-" + this.nombre + ".bmp");
        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        System.out.println("Imagen leida: " + this.nombre);
        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\copia-" + this.nombre + ".jpg");
        salida.write(filebytes);
        salida.close();
        System.out.println("Imagen generada: " + this.nombre);
        setIteracion(getIteracion() + 1);
     porcentaje=(int)((getIteracion()/size)*100);
     Convertidor.cargaproceso.setValue(porcentaje);
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
