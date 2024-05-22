package Tugas_pertemuan_9;

class Anak extends AnggotaKeluarga {
    public Anak(String nama, int umur, String pekerjaan) {
        super(nama, umur, pekerjaan);
    }

    public void bermain() {
        System.out.println(getNama() + " sedang bermain.");
    }

    @Override
    public String getDetail() {
        return String.format(
                "======================================================\n" +
                        "|                       Anak                         |\n" +
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