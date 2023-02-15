public class Mahasiswa extends Human {
    private String NIM;
    private String fakultas;
    private String prodi;
    
    public Mahasiswa(String NIK, String name, String jenis_kelamin, String NIM, String fakultas, String prodi) {
        super(NIK, name, jenis_kelamin);
        this.NIM = NIM;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }
    
    public String getNIM() {
        return NIM;
    }
    
    public String getFakultas() {
        return fakultas;
    }
    
    public String getProdi() {
        return prodi;
    }
}
