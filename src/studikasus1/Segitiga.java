
package studikasus1;

import java.util.Scanner;




public class Segitiga {
    Scanner input=new Scanner (System.in);
    int tinggi,alas;
    double Hitung;
    void input (){
        
        System.out.println("Masukan nilai tinggi :");
        tinggi = input.nextInt();
        System.out.println("Masukan nilai alas : ");
        alas = input.nextInt();
        Hitung = (0.5*alas*tinggi);
    }
    void hitung (){
        System.out.println("Menghitung dengan rumus 0.5*alas*tinggi : ");
        System.out.println(Hitung);
    }
    double hasil(){
        System.out.println("============================");
        System.out.print("Hasil dari luas segitiga tersebut adalah : ");
        return Hitung;
    }
}
    