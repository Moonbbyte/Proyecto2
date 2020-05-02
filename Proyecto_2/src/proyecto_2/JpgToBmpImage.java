package proyecto_2;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class JpgToBmpImage extends ImageHandler {

    FileInputStream entrada;
    FileOutputStream salida;
   byte[] img;
    private File archivo;

    public JpgToBmpImage(String filename) {
        super(filename);
    }

    @Override
    public void readFile() throws Exception {
        img = new byte[1024 * 768];
        try {
           img= AgregarImagen(this.archivo);
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
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
    
    

    @Override
    public void generateFiles() throws Exception {
                        salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\file.bmp");
                        salida.write(img);
                        salida.close();
                        System.out.println("xD");
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

}
