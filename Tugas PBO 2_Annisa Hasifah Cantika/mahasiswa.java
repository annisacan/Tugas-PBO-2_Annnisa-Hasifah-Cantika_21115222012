public class mahasiswa extends element{

    private int sks;
    public int jamSibuk;

    public mahasiswa(String nama, int sks) {
        super(nama); //DownCasting
        jamSibuk = sks*3;
        //TODO Auto-generated constructor stub
    }

    public int getJamSibuk() {
        return jamSibuk;        
    }    
    public void mailCheck() {
        System.out.println(getnama() + "adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk() + " ");       
    }

    
}
