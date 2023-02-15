public class Main {
    public static void main(String[] args) {
        Human hm = new Human("123", "Lisa", "Female");
        System.out.println("NIK: " + hm.getNIK());
        System.out.println("Name: " + hm.getName());
        System.out.println("JenisKelamin: " + hm.getJenisKl());
        
        System.out.println("===============");
        Mahasiswa mhs = new Mahasiswa("456", "Messi", "Male","1234", "FPMIPA", "Teknik Informatika");
        System.out.println("NIK: " + mhs.getNIK());
        System.out.println("Name: " + mhs.getName());
        System.out.println("JenisKelamin: " + mhs.getJenisKl());
        System.out.println("NIM: " + mhs.getNIM());
        System.out.println("Jurusan: " + mhs.getFakultas());
        System.out.println("Fakultas: " + mhs.getProdi());
        
        System.out.println("===============");
        CivitasAkademik dosen = new CivitasAkademik("678", "Smith", "9876", "FPMIPa", "Teknik Informatika");
        // System.out.println("Name: " + dosen.getName());
        // System.out.println("JenisKelamin: " + dosen.getJenisKl());
        // System.out.println("AsalUniv: " + dosen.getAsalUniv());
        // System.out.println("Email: " + dosen.getEmailEdu());
    }
}
