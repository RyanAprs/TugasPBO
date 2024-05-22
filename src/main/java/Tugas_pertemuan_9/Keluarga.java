package Tugas_pertemuan_9;

public class Keluarga {
    public static void main(String[] args) {
        OrangTua ayah = new OrangTua("Unang", 45, "Pegawai Swasta");
        Anak anak = new Anak("Ryan", 10, "Pelajar");

        Hubungan hubungan = new Hubungan(ayah, anak);
        
        System.out.println(hubungan);

        System.out.println(ayah.getDetail());
        System.out.println(anak.getDetail());

        ayah.perkenalan();
        ayah.berikanBimbingan();

        anak.perkenalan();
        anak.bermain();
    }
}
