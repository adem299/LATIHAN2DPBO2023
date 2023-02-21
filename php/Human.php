<?php
class Human {
    // attribute
    private $NIK;
    private $nama;
    private $jenis_kelamin;

    // Constructor
    public function __construct($NIK = '', $nama = '', $jenis_kelamin = '') {
        $this->NIK = $NIK;
        $this->nama = $nama;
        $this->jenis_kelamin = $jenis_kelamin;
    }

    // getter and setter
    public function setNIM($nik) {
        $this->NIK = $nik;
    }

    public function getNIK() {
        return $this->NIK;
    }

    public function setNama($nama) {
        $this->nama = $nama;
    }

    public function getNama() {
        return $this->nama;
    }

    public function setJenisK($jenis_kelamin) {
        $this->jenis_kelamin = $jenis_kelamin;
    }

    public function getJenisK() {
        return $this->jenis_kelamin;
    }

    // destructor
    function __destruct(){}
}
?>