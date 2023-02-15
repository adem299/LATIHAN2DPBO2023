public class Human {
    private String NIK;
    private String name;
    private String jenis_kelamin;
    
    Human() {}
    public Human(String NIK, String name, String jenis_kelamin) {
        this.NIK = NIK;
        this.name = name;
        this.jenis_kelamin = jenis_kelamin;
    }
    
    public String getNIK() {
        return NIK;
    }
    public String getName() {
        return name;
    }
    public String getJenisKl() {
        return jenis_kelamin;
    }
    
}