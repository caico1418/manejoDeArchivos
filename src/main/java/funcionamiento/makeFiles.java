package funcionamiento;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Edgar Gonzalez
 */

public class makeFiles {
    // Scanner 
    Scanner scan = new Scanner(System.in);
    
    // Funcion que Listar archivos del sistema
    public void listFiles() {
        File f = new File("/");
        
        System.out.println("[!] Listado de archivos del sistema [!]");
        for(File files : f.listFiles()) {
            System.out.println("Archivo -> " + files);
        }
    }
    
    // Funcion que crea un archivo
    public void makeFile() {
        try {
            String path;
            
            System.out.println("[!] Crear archivo nuevo [!]");
            System.out.println("Ingrese la ruta absoluta y el nombre del archivo ejemplo \\directorio\\file.txt");
            path = scan.nextLine();
          
            
            File f = new File(path);
            // Comprobar si el archivo no existe, de lo contrario lo crea
            if(f.exists()) {
                System.out.println("[!] El archivo ya existe [!]");
            }else {
                f.createNewFile();
                System.out.println("[+] Archivo Creado [+]");
            }
            
        }catch(Exception e) {
            System.out.println("Error " + e);
        }
    }
    
    public void modifyFile() {
        try{
        String path, content;
        System.out.println("Ingresa la ruta absoluta del archivo a modificar ejemplo \\directorio\\file.txt");
        path = scan.nextLine();
        File f = new File(path);
        
        // Escribir en el archivo
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.println("[!] Ingresa el contenido al archivo [!]");
        content = scan.nextLine();
        bw.write(content);
        System.out.println("[+] Archivo modificado [+]");
        bw.close();
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteFile() {
        String path;
        System.out.println("[+] Eliminar archivo [+]");
        System.out.println("Ingresa la ruta absoluta del archivo a eliminar ejemplo \\directorio\\file.txt");
        path = scan.nextLine();
        
        File f = new File(path);
        System.out.println("¿Desea eliminar el archivo si/no?");
        String elimination = scan.nextLine();
        if(elimination.equals("si")) {
            f.delete();
            System.out.println("El archivo se ha eliminado");
        }else{
                System.out.println("No se elimino el archivo");
        }
    }
    
    public void fileProperties() {
        String path;
        System.out.println("[!] Propiedades del archivo [!]");
        System.out.println("Ingresa la ruta absoluta del archivo ejemplo \\directorio\\file.txt");
        path = scan.nextLine();
        File f = new File(path);
        
        if(f.exists()) {
            System.out.println("Nombre del archivo: " + f.getName());
            System.out.println("Ruta del archivo: " + f.getParentFile());
            System.out.println("Tamaño del archivo: " + f.length());
        }
    }
}
