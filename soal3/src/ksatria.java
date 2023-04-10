public class ksatria extends penduduk{
    String nama;
    int pendapatan;
    public ksatria(String nama, int pendapatan) {
        super(nama, pendapatan);
    }
    public double pajak(){
        return this.pendapatan * 0.18;
    }
    public void bayar(){
        pendapatan -= this.pajak();
    }
}
