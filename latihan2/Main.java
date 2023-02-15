public class Main {
    public static void main(String[] args) {
        Human human = new Human("Lisa", "25");
        System.out.println("Name: " + human.get());
        System.out.println("Name: " + human.getName());
        System.out.println("Name: " + human.getName());
        System.out.println("Age: " + human.getAge());
        
        Mahasiswa mahasiswa = new Mahasiswa("Jane", "20", "123456", "Teknik Informatika", 3.75);
        System.out.println("Name: " + mahasiswa.getName());
        System.out.println("Age: " + mahasiswa.getAge());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Jurusan: " + mahasiswa.getJurusan());
        System.out.println("IPK: " + mahasiswa.getIpk());
        
        CivitasAkademik dosen = new CivitasAkademik("Rose", "678", "Female", "UPI", "Rose@edu");
        System.out.println("Name: " + dosen.getName());
        System.out.println("Age: " + dosen.getAge());
        System.out.println("Jabatan: " + dosen.getJabatan());
        System.out.println("Unit Kerja: " + dosen.getUnitKerja());
    }
}
