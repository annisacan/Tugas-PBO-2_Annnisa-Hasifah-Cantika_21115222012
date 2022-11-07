public class dosen extends element {
    private int jumlahHariKerja;
    private int jamSibuk;

    public dosen (String nama, int jumlahHariKerja) {
        super(nama); //DownCasting
        jamSibuk = jumlahHariKerja * 8;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void mailCheck() {
        System.out.println(getnama() + "adalah seorang dosen dengan jam sibuk " + getJamSibuk() + " ");
    }
}
