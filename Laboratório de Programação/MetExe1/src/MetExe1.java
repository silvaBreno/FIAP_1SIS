import java.util.Scanner;

public class MetExe1 {

	public static void main(String[] args)
	{
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean resultado;
        	
        System.out.print("Informe um n�mero: ");
        numero = teclado.nextInt();
        
        resultado = positivoOUnegativo(numero);
        if (resultado == true)
        	System.out.println("O n�mero � positivo.");
        else
        	System.out.println("O n�mero � negativo.");
        
        teclado.close();
	}
    public static boolean positivoOUnegativo (int numero)
    {
    	boolean positivo;
    	
    	if (numero > 0)
    		positivo = true;
    	else
    		positivo = false;
    	
    	return positivo;
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        