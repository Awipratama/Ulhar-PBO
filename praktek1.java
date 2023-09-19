public class praktek1 {
    public static void main(String[]args){
        praktek2 objek = new praktek2();
        objek.perkataan();

        objek.nama="Awik";
        objek.umur= 16;
        objek.tinggibadan = 161;

        System.out.println("nama  saya : " + objek.nama);
        System.out.println("Umur saya : " + objek.umur);
        System.out.println("tinggi badan saya " + objek.tinggibadan);

        objek.Panggil();
    }
}