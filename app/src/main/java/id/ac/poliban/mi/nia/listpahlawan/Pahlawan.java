package id.ac.poliban.mi.nia.listpahlawan;

public class Pahlawan {
    private String gambarPahlawan;
    private String namaPahlawan;
    private String asalPahlawan;
    private String deskripsiPahlawan;

    public Pahlawan(String gambarPahlawan, String namaPahlawan, String asalPahlawan, String deskripsiPahlawan) {
        this.gambarPahlawan = gambarPahlawan;
        this.namaPahlawan = namaPahlawan;
        this.asalPahlawan = asalPahlawan;
        this.deskripsiPahlawan = deskripsiPahlawan;
    }

    public String getGambarPahlawan() {
        return gambarPahlawan;
    }

    public void setGambarPahlawan(String gambarPahlawan) {
        this.gambarPahlawan = gambarPahlawan;
    }

    public String getNamaPahlawan() {
        return namaPahlawan;
    }

    public void setNamaPahlawan(String namaPahlawan) {
        this.namaPahlawan = namaPahlawan;
    }

    public String getAsalPahlawan() {
        return asalPahlawan;
    }

    public void setAsalPahlawan(String asalPahlawan) {
        this.asalPahlawan = asalPahlawan;
    }

    public String getDeskripsiPahlawan() {
        return deskripsiPahlawan;
    }

    public void setDeskripsiPahlawan(String deskripsiPahlawan) {
        this.deskripsiPahlawan = deskripsiPahlawan;
    }
}
