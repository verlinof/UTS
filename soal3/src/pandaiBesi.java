public class pandaiBesi extends penduduk{
    String nama;
    int pendapatan;
    public pandaiBesi(String nama, int pendapatan) {
        super(nama, pendapatan);
    }
    public double pajak(){
        return this.pendapatan * 0.12;
    }
    public void bayar(){
        pendapatan -= this.pajak();
    }
}
