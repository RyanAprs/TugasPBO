package Tugas_pertemuan_9;

class OrangTua extends AnggotaKeluarga {
    public OrangTua(String nama, int umur, String pekerjaan) {
        super(nama, umur, pekerjaan);
    }

    public void berikanBimbingan() {
        System.out.println(getNama() + " memberikan bimbingan.");
    }

    @Override
    public String getDetail() {
        return String.format(
                "======================================================\n" +
                        "|                  Orang_Tua                         |\n" +
                        "======================================================\n" +
                        "|----------------------------------------------------|\n" +
                        "| Nama          : %-34s |\n" +
                        "| Umur          : %-34d |\n" +
                        "| Pekerjaan     : %-34s |\n" +
                        "|----------------------------------------------------|\n",
                getNama(), getUmur(), getPekerjaan()
        );
    }
}
