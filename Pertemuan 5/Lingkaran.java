public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran(){
        setJmlSisi(1);
    }
    public Lingkaran(double jari) {
        super(1, "Default", "Default");
        this.jari = jari;
    }
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi + 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
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

