<?php
class Mahasiswa extends CivitasAkademik {
    // attribute
    private $NIM;
    private $fakultas;
    private $prodi;

    // Constructor
    public function __construct($NIK = '', $nama = '', $jenis_kelamin = '', $asal_universitas="", $email_edu="", $NIM="", $fakultas="", $prodi="") {
        CivitasAkademik::__construct($NIK, $nama, $jenis_kelamin, $asal_universitas, $email_edu);
        $this->NIM = $NIM;
        $this->fakultas = $fakultas;
        $this->prodi = $prodi;

    }

    // getter and setter
    public function setNIM($nim) {
        $this->NIM = $nim;
    }

    public function getNIM() {
        return $this->NIM;
    }

    public function setFakultas($fakultas) {
        $this->fakultas = $fakultas;
    }

    public function getFakultas() {
        return $this->fakultas;
    }
    
    public function setProdi($prodi) {
        $this->prodi = $prodi;
    }

    public function getProdi() {
        return $this->prodi;
    }

    // destructor
    function __destruct(){}
}
?>