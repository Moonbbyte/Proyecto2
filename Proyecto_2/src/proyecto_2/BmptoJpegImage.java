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

    public BmptoJpegImage(String filename) {
        super(filename);
    }

    @Override
    public void readFile() throws Exception {
        img = new byte[1024 * 768];
        try {
            img = AgregarImagen(this.archivo);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public byte[] AgregarImagen(File archivo) {
        byte[] img1 = new byte[1024 * 768];
        try {
            entrada = new FileInputStream(archivo);
            entrada.read(img1);

        } catch (Exception e) {
            System.out.println(e);
        }
        return img1;
    }

    @Override
    public void generateFiles() throws Exception {
 salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\converted-"+getNombre()+".jpeg");
                        salida.write(img);
                        salida.close();
                  
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

}
