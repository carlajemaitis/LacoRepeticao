
package While;

import java.util.*;

public class Ex03
{
   public static void main(String[] args)
   {

   Scanner leia = new Scanner(System.in);
   int idade, menoresVinteUm, maioresCinquenta;
   idade = 0;
   menoresVinteUm = 0;
   maioresCinquenta = 0;

   while(idade >= 0)
   {
       System.out.println("Digite uma idade: ");  
       idade = leia.nextInt();
       if(idade > 50)
           {
               maioresCinquenta++;
           }
       else if(idade < 21)
           {
               menoresVinteUm++;
           }
   }
   System.out.println("Total de pessoas menores de 21 anos: " + menoresVinteUm);
   System.out.println("Total de pessoas mmaiores de 50 anos: " + menoresVinteUm);
   leia.close();
   }
}
