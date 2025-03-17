public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){
        setJmlSisi(1);
    }
    public Lingkaran (double diameter, String warna, String border){
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }
    public double getJari(){
        return jari;
    }
    public void setJari(double jari){
        this.jari = jari;
    }
    public double getLuas(){
        return Math.PI * jari * jari;
    }
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari: " + getJari());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Luas: " + getLuas());
    }
}

