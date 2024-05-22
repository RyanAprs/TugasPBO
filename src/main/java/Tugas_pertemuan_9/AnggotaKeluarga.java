package Tugas_pertemuan_9;

import java.util.ArrayList;
import java.util.List;

public abstract class AnggotaKeluarga {
    private String nama;
    private int umur;
    private String pekerjaan;

    public AnggotaKeluarga(String nama, int umur, String pekerjaan) {
        this.nama = nama;
        this.umur = umur;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void perkenalan() {
        System.out.println("Halo, saya " + nama + ", berumur " + umur + " tahun dan saya bekerja sebagai " + pekerjaan + ".");
    }

    public abstract String getDetail();
}




