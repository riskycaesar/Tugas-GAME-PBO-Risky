public class Zombie extends Musuh {
    public Zombie() {
        // memanggil construktor kelas induk abstrak
        super("Zombie Soni ", 150);
    }

    // wajib ada : dipaksa java untuk mengoverride
    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + "melompat mencakar dengan kuku yang tajam dan mengigit! player -20 hp");
    }
    @Override
    public void suaraKhas() {
        System.out.println("kicau kicau kicau mania");
    }
}
