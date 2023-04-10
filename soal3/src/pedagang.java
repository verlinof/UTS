public class pedagang extends penduduk{
    String nama;
    int pendapatan;
    public pedagang(String nama, int pendapatan) {
        super(nama, pendapatan);
    }
    public double pajak(){
        return this.pendapatan * 0.12;
    }
    public void bayar(){
        pendapatan -= this.pajak();
    }
}
