package DoWhile;

import java.util.*;

public class Ex05
{
   public static void main(String[] args)
   {


   Scanner leia = new Scanner(System.in);
   int num, soma;
   soma = 0;


   do
   {
       System.out.println("Digite um número: ");
       num = leia.nextInt();
       if(num % 2 == 0)
           {
               soma = soma + num;
           }
   }
   while(num != 0);


   System.out.println("A soma dos números é: " + soma);
   leia.close();
   }
}
