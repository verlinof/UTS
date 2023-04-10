public class petani extends penduduk{
    String nama;
    int pendapatan;
    public petani(String nama, int pendapatan) {
        super(nama, pendapatan);
    }
    public double pajak(){
        return this.pendapatan * 0.03;
    }
    public void bayar(){
        pendapatan -= this.pajak();
    }
}
