public class CivitasAkademik extends Human {
    private String asal_universitas;
    private String email_edu;
    
    public CivitasAkademik(String NIK, String NIM, String nama, String jenis_kelamin, String fakultas,  String prodi, String asal_universitas, String email_edu) {
        super(NIK, NIM, nama, jenis_kelamin, fakultas, prodi);
        this.asal_universitas = asalUniv;
        this.email_edu = email_edu;
    }
    
    public String getEmailEdu() {
        return email_edu;
    }
    
    public String getAsalUnv() {
        return asal_universitas;
    }
}

