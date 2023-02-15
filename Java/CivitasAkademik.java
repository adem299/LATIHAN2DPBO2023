public class CivitasAkademik extends Human {
    private String asal_universitas;
    private String email_edu;
    
    public CivitasAkademik(String name, String NIK, String jenis_kelamin, String NIM, String fakultas, String prodi, String asal_universitas, String email_edu) {
        super(name, NIK, jenis_kelamin, NIM, fakultas,prodi);
        this.asal_universitas = asal_universitas;
        this.email_edu = email_edu;
    }
    
    public String getAsalUniv() {
        return asal_universitas;
    }
    
    public String getEmailEdu() {
        return email_edu;
    }
}

