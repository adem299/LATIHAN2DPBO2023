class Mahasiswa extends Human {
    private String NIM;
    private String fakultas;
    private String prodi;
    Mahasiswa() {}
    Mahasiswa(String NIK, String NIM, String nama, String jenis_kelamin, String fakultas, String prodi) {
        // konstruktor langsung isi attribut
        super(NIK, nama, jenis_kelamin);
        this.NIM = NIM;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }

    // setter
    public void setFakultas(String fk) {
        this.fakultas = fk;
    }
    public void setProdi(String prd) {
        this.prodi = prd;
    }
    public void setNIM(String nim) {
        this.NIM = nim;
    }

    //getter
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
