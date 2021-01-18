
package studikasus1;


public class StudiKasus1 {

    
    public static void main(String[] args) {
        System.out.println("Selamat menghitung !");
        
        Segitiga tiga = new Segitiga();
        tiga.input();
        tiga.hitung();
        
        System.out.println(tiga.hasil());
    }
    
}
