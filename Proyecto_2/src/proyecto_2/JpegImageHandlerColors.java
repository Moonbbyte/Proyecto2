
package proyecto_2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class JpegImageHandlerColors extends ImageHandler {
byte[] filebytes;
 FileOutputStream salida;
 
    public JpegImageHandlerColors(String filename) {
        super(filename);
    }
/////////////////////////////////////////////LEER UNA IMAGENA A JPG
    @Override
    public void readFile() throws Exception {
         FileInputStream input = new FileInputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenes\\"+this.handledFileName+".jpg");
                filebytes = new byte[input.available()];
		input.read(filebytes);
		input.close();
		System.out.println("Imagen leida: " + this.handledFileName);
   
    }
//////////////////////CREAR UN ARCHIVO BMP
    @Override
    public void generateFiles() throws Exception {
         salida = new FileOutputStream("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\"+this.handledFileName+".bmp");
		salida.write(filebytes);
		salida.close();
		System.out.println("Imagen generada: " + this.handledFileName);      
   
      File archivo= new File("C:\\Users\\Brandon\\Documents\\NetBeansProjects\\Proyecto2\\Imagenesconvertidas\\"+this.handledFileName+".bmp");
      BufferedImage img=null;
      img=ImageIO.read(archivo);
    }
    
    
    
    public void rojo(){
       
    
    }
}
