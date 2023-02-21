<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  </head>
  <body>
    <div class="container text-center">
        <div class="w-100 d-flex align-items-center justify-content-center p-5">
            
            <?php
            require_once 'Human.php';
            require_once 'CivitasAkademik.php';
            require_once 'Mahasiswa.php';

            $listMhs = array();

            $mhs1 = new Mahasiswa(123, "Lisa", "Female", "Tokyo University", "Lisa@tokyo.edu", 5432155, "Science", "Astronomy");
            $mhs2 = new Mahasiswa(321, "Ade", "Male", "UPI", "ade@upi.edu", 2108799, "FPMIPA", "Ilmu Komputer");
            $mhs3 = new Mahasiswa(666, "Buggy", "Male", "EastBlue", "bug@lucky.edu", 1456969, "Marine", "Kelautan");
            $mhs4 = new Mahasiswa(987, "Patrik", "Male", "BikiniBottom", "pat@bb.edu", 1456969, "WFH", "Relax");

            // add data mhs ke listMhs
            $listMhs[] = $mhs1;
            $listMhs[] = $mhs2;
            $listMhs[] = $mhs3;
            $listMhs[] = $mhs4;


            // menampilkan tabel
            echo "<table border='1'>
            <tr class='bg-secondary'>
                <th>No</th>
                <th>NIK</th>
                <th>Nama</th>
                <th>JenisKelamin</th>
                <th>AsalUniversitas</th>
                <th>EmailEdu</th>
                <th>NIM</th>
                <th>Fakultas</th>
                <th>Prodi</th>
            </tr>";

            // menampilkan data mahasiswa pada tabel
            $i = 1;
            foreach ($listMhs as $mhs) {
                echo "<tr>
                    <td>".$i++ . "</td>
                    <td>".$mhs->getNIK()."</td>
                    <td>".$mhs->getNama()."</td>
                    <td>".$mhs->getjenisK()."</td>
                    <td>".$mhs->getAsalUniv()."</td>
                    <td>".$mhs->getEmailEdu()."</td>
                    <td>".$mhs->getNIM()."</td>
                    <td>".$mhs->getFakultas()."</td>
                    <td>".$mhs->getProdi()."</td>
                </tr>";
            }

            echo "</table>";

            ?>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
  </body>
</html>