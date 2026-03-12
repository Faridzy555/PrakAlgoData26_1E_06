package P4_Kuis1;

class SmartHomeDevice06 {

    String nama;
    double konsumsiPower;
    double standbyPower;

    // konstruktor default
    SmartHomeDevice06 () {}

    // konstruktor parameter
    SmartHomeDevice06 (String nama, double konsumsiPower, double standByPower) {
        this.nama = nama;
        this.konsumsiPower = konsumsiPower;
        this.standbyPower = standByPower;
    }

    // menghitung total energi aktual
    double totalEnergiAktual (double energi) {
        return energi = konsumsiPower + standbyPower;
    }

    // menghitung rasio efesiensi
    double rasioEfesiensi (double efesiensi) {
        return standbyPower / totalEnergiAktual(efesiensi);
    }

    // print data
    void printData () {
        System.out.println("Nama device      : " + nama);
        System.out.println("Konsumsi power   : " + konsumsiPower);
        System.out.println("StandbyPower     : " + standbyPower);
        System.out.println("TotalEnergiAktual: " + totalEnergiAktual(konsumsiPower));
        System.out.println("Rasio efesiensi  : " + rasioEfesiensi(konsumsiPower));
    }
}