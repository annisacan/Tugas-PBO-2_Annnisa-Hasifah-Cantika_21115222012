public class Asdos extends mahasiswa {
    private int jamNgasdos;

    public Asdos(String nama, int sks, int jamNgasdos) {
        super(nama, sks); //Downcasting
        jamSibuk = jamSibuk + jamNgasdos; 
        //TODO Auto-generated constructor stub
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void mailCheck() {
        System.out.println(getnama() + " adalah seorang asdos dengan jam sibuk " + getJamSibuk() + " ");
    }
    
    
}
