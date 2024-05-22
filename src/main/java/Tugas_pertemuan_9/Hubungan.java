
package Tugas_pertemuan_9;

class Hubungan {
    private AnggotaKeluarga orangTua;
    private AnggotaKeluarga anak;

    public Hubungan(AnggotaKeluarga orangTua, AnggotaKeluarga anak) {
        this.orangTua = orangTua;
        this.anak = anak;
    }

    public AnggotaKeluarga getOrangTua() {
        return orangTua;
    }

    public AnggotaKeluarga getAnak() {
        return anak;
    }

    public String toString() {
        return String.format("%s adalah orang tua dari %s", orangTua.getNama(), anak.getNama());
    }
}
