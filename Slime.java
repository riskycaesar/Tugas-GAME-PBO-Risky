public class Slime extends Musuh {
    public Slime() {
        // memanggil construktor kelas induk abstrak
        super("Slime Moani ", 50);
    }

    // wajib ada : dipaksa java untuk mengoverride
    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + "melompat dan menyiram cairam asam! player -15 hp");
    }

    @Override
    public void suaraKhas() {
        System.out.println("blobop blobop");
    }
}
