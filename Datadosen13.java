public class Datadosen13 {
    public void dataSemuaDosen(Dosen13[] arrayOfDosen) {
        System.out.println("\nData Semua Dosen:");
        for (Dosen13 dosen : arrayOfDosen) {
            dosen.displayInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("\nJumlah Dosen Per Jenis Kelamin:");
        System.out.println("Pria: " + jumlahPria);
        System.out.println("Wanita: " + jumlahWanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        double rerataUsiaPria = jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0;
        double rerataUsiaWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("\nRata-rata Usia Dosen Per Jenis Kelamin:");
        System.out.println("Pria: " + rerataUsiaPria);
        System.out.println("Wanita: " + rerataUsiaWanita);
    }

    public void infoDosenPalingTua(Dosen13[] arrayOfDosen) {
        Dosen13 dosenTua = arrayOfDosen[0];

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }

        System.out.println("\nInformasi Dosen Paling Tua:");
        dosenTua.displayInfo();
    }

    public void infoDosenPalingMuda(Dosen13[] arrayOfDosen) {
        Dosen13 dosenMuda = arrayOfDosen[0];

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }

        System.out.println("\nInformasi Dosen Paling Muda:");
        dosenMuda.displayInfo();
    }
}