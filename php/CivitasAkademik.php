<?php
class CivitasAkademik extends Human {
    // attribute
    private $asal_universitas;
    private $email_edu;

    // Constructor
    public function __construct($NIK = '', $nama = '', $jenis_kelamin = '', $asal_universitas="", $email_edu="") {
        Human::__construct($NIK, $nama, $jenis_kelamin); // super
        $this->asal_universitas = $asal_universitas;
        $this->email_edu = $email_edu;

    }

    // getter and setter
    public function setAsalUniv($asal_univ) {
        $this->asal_universitas = $asal_univ;
    }

    public function getAsaluniv() {
        return $this->asal_universitas;
    }

    public function setEmailEdu($email) {
        $this->email_edu = $email;
    }

    public function getEmailEdu() {
        return $this->email_edu;
    }

    // destructor
    function __destruct(){}
}
?>