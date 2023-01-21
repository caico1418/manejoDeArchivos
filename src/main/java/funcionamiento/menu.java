package funcionamiento;

import java.util.Scanner;
/**
 *
 * @author Edgar Gonzalez
 */
public class menu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        makeFiles m = new makeFiles(); 
        int opc = 0;
        do {
            System.out.println("    [!] Menu Principal [!]");
            System.out.println("1- Listar archivos del sistema.\n" + 
                           "2- Crear archivo nuevo.\n" + 
                           "3- Modificar archivo.\n" +
                           "4- Eliminar archivo.\n" +
                           "5- Propiedades del archivo.\n" +
                           "6- Cerrar Programa");
            
            // Leer entrada de datos y Validar.
            try {
                opc = scan.nextInt();
            }catch(Exception e) {
                System.out.println();
                System.out.println("\t[!] Error [!]\nDebe Ingresar solo numeros");
                System.out.println();
                scan.next();
            }
            
        // Llamada a las funciones de la clase makeFiles
        switch(opc) {
            case 1:
                m.listFiles();
                break;
            case 2:
                m.makeFile();
                break;
            case 3:
                m.modifyFile();
                break;
            case 4:
                m.deleteFile();
                break;
            case 5:
                m.fileProperties();
                break;
            case 6:
                System.out.println("[!] SALIENDO DEL PROGRAMA [!]");
                break;
            default:
                System.out.println("Error digite");
                break;
        }
        }while(opc != 6);
    }
    
}
