package For;

import java.util.*;

public class Ex02
{
   public static void main(String[] args)
   {

   Scanner leia = new Scanner(System.in);
   int num, pares, impares, i;
   pares = 0;
   impares = 0;

   for(i = 1; i <= 10; i++)
   {
       System.out.println("Digite o " + i + "º número: " );
   num = leia.nextInt();

       if(num % 2 == 0)
       {
           pares++;
       }
       else
       {
           impares++;
       }
   }
   System.out.println("Total de números pares: " + pares);
   System.out.println("Total de números ímpares: " + impares);
   leia.close();
}
}
