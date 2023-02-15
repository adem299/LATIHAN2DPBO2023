public class Human {
    private String NIK;
    private String nama;
    private String jenis_kelamin;
    
    Human() {}
    public Human(String NIK, String nama, String jenis_kelamin) {
        // konstruktor langsung isi attribut
        this.NIK = NIK;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
    }

    // setter

    public void setNIK(String nik) {
        this.NIK = nik;
    }
    public void setNama(String nm) {
        this.nama = nm;
    }
    public void setJenisK(String jk) {
        this.jenis_kelamin =jk;
    }

    // getter
    public String getNIK() {
        return NIK;
    }

    public String getNama() {
        return nama;
    }
    public String getJenisK() {
        return jenis_kelamin;
    }
}