package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        
        Matematika abdi = new Matematika(3,2);
        
        System.out.println("hasil penjumlahan: "+abdi.setPenjumlahan());
        System.out.println("hasil pengurangan: "+abdi.setPengurangan());
        System.out.println("hasil perkalian: "+abdi.setPerkalian());
        System.out.println("hasil pembagian: "+abdi.setPembagian());
    }
}
