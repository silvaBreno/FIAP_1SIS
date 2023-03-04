import java.util.Scanner;

public class testinho {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int j = 0;   
        int k = 0;       
        String sc = "";
        
        
        for(int i=0; i<=j++;i++){
            
             sc = teclado.nextLine();
             
            for(k=0; k<=j++; k++){
                System.out.println((contador+1) + " " + sc);
                contador++;
                break;
            }
        }
        
        teclado.close();
    }

}
