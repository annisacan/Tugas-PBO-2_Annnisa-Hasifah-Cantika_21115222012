public class Shimulathor{
    
    public static void main(String[] args) {
        int total_jamsibuk;
        //poly
        Asdos n = new Asdos("Fairuzikun", 21, 10);
        dosen i = new dosen("Raja OP Damanaik", 5);
        mahasiswa a = new mahasiswa("Firman", 20); 
        dosen x = new dosen("Nivotko", 3);
        mahasiswa c = new mahasiswa("Nid to pass this sem", 23);

        //upcasting
        mahasiswa s = new Asdos("Angel-chan", 20, 4);     

        n.mailCheck();
        i.mailCheck();
        s.mailCheck();
        a.mailCheck();
        c.mailCheck();
        x.mailCheck();
        total_jamsibuk = n.jamSibuk+i.getJamSibuk()+c.jamSibuk+a.getJamSibuk()+s.jamSibuk+x.getJamSibuk();
        
        System.out.println("Total jam sibuk elemen Fasilkom adalah "+ total_jamsibuk + " ");


    }
}
