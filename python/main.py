from Mahasiswa import Mahasiswa

listMhs = []

# masukan jumlah mahasiswa
n = int(input("Masukan jumlah Mahasiswa yang di input: "))

# input dengan metode[#1]
mhs1 = Mahasiswa(123, "Lisa", "Female", "UPI", "l1sa@upi.edu", 321, "FPMIPA", "ILKOM")

listMhs.append(mhs1)

# input dengan metode[#2]

mhs2 = Mahasiswa()

mhs2.setNIK(567)
mhs2.setNama("Sana")
mhs2.setJenisK("Female")
mhs2.setAsalUniv("UIN Bandung")
mhs2.setEmail("san@gmail.com")
mhs2.setNIM("987")
mhs2.setFakultas("Kesehatan")
mhs2.setProdi("MIPA")
listMhs.append(mhs2)

# input data mahasiswa baru sebanyak n buah
for i in range(n):
    print(">>=== new Mahasiswa " + str((i+1)))
    nik = int(input("Masukan NIK         : "))
    nama = str(input("Masukan Nama        : "))
    jenisK = str(input("Masukan JenisKelamin: "))
    asalUniv = str(input("Masukan AsalUniv    : "))
    email = str(input("Masukan emailEdu    : "))
    nim = str(input("Masukan NIM         : "))
    fakultas = str(input("Masukan fakultas    : "))
    prodi = str(input("Masukan prodi       : "))
    print("")
    newMhs = Mahasiswa(nik, nama, jenisK, asalUniv, email, nim, fakultas, prodi)
    listMhs.append(newMhs)

# print data mahasiswa yang di tersedia di listMhs
for i, data in enumerate(listMhs):
    print(">>=== Mahasiswa " + str(i+1) + " ===<<")
    print("NIK          : " + str(data.getNIK()))
    print("Nama         : " + str(data.getNama()))
    print("JenisKelamin : " + str(data.getJenisK()))
    print("Asal Univ    : " + str(data.getAsalUniv()))
    print("Email        : " + str(data.getEmail()))
    print("NIM          : " + str(data.getNIM()))
    print("Fakultas     : " + str(data.getFakultas()))
    print("Prodi        : " + str(data.getProdi()))
    print("")