import java.util.Scanner;
public class KorttipakkaOhjelma {

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        korttiPakka pakka = new korttiPakka();

        String annettu;
        boolean lopetus = false;


        do {
            System.out.print("Anna pelikortin maa(-lopettaa): ");
            annettu = input.nextLine();
            if(!annettu.equals("-")){
                System.out.print("Anna pelikortin numero: ");
                int annettuNumero = input2.nextInt();
                pelikortti pelikortti = new pelikortti(annettu, annettuNumero);

                pakka.lisää(pelikortti);




            }
            else
                lopetus = true;


        } while (!lopetus);
        System.out.println();

System.out.println("Korttipakassa on " +pakka.annaKoko()+" korttia:");
int o = 0;
while ( o < pakka.annaKoko() ) {

    System.out.println(pakka.anna(o));
    o++;
}




        }





        }




