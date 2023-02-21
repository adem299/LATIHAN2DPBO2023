#include <iostream>
#include <string>
#include <list>
using namespace std;
#include "Mahasiswa.cpp"

int main() {

    // Tampung data mahasiswa
    list <Mahasiswa> listMhs;
    
    // input dengan metode[#1]
    Mahasiswa mhs (123, "Lisa", "Female", "UPI", "lisa@edu", 500, "MIPA", "Ilkom");
    listMhs.push_back(mhs);

    // input data sesuai inputan
    int n;

    cout << "Masukan jumlah inputan: ";
    cin >> n;
    cin.ignore();
    
    int tempNIK, tempNIM;
    string tempNama, tempJenisK, tempAsalUniv, tempEmail, tempFakultas, tempProdi; 
    for(int i = 0; i < n; i++) {
        cout << ">>== New Mahasisa " + to_string(i+1) << endl;
        cout << "Masukan NIK             : ";
        cin >> tempNIK;
        cin.ignore();
        cout << "Masukan Nama            : ";
        getline(cin, tempNama);
        cout << "Masukan jenisKelamin    : ";
        getline(cin, tempJenisK);
        cout << "Masukan AsalUniversitas : ";
        getline(cin, tempAsalUniv);
        cout << "Masukan EmailEdu        : ";
        getline(cin, tempEmail);
        cout << "Masukan NIM             : ";
        cin >> tempNIM;
        cin.ignore();
        cout << "Masukan Fakultas        : ";
        getline(cin, tempFakultas);
        cout << "Masukan prodi           : ";
        getline(cin, tempProdi);
        
        Mahasiswa newMhs(tempNIK, tempNama, tempJenisK, tempAsalUniv, tempEmail, tempNIM, tempFakultas, tempProdi);
        listMhs.push_back(newMhs);
    }

    cout << endl;

    // Tampilkan data mahasiswa dari listMhs
    list<Mahasiswa>::iterator it;
    int x=1;
    for(it = listMhs.begin(); it != listMhs.end(); it++) {
        cout << ">>>== Mahasiswa " + to_string(x++) << endl;
        cout << "NIK          : " + to_string(it->getNIK()) << endl;
        cout << "Nama         : " + it->getNama() << endl;
        cout << "JenisKelamin : " + it->getJenisK() << endl;
        cout << "Asal_univ    : " + it->getAsalUniv() << endl;
        cout << "Email_edu    : " + it->getEmailEdu() << endl;
        cout << "NIM          : " + to_string(it->getNIM())<< endl;
        cout << "Fakultas     : " + it->getFakultas() << endl;
        cout << "Prodi        : " + it->getProdi() << endl;
        cout << endl;
    }

    return 0;
}