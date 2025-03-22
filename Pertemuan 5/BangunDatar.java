public abstract class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
    
    public interface IResize {
        public void zoomIn();
        public void zoomOut();
        public void zoom(int percent);
    }

    public int getJmlSisi(){
        return jmlSisi;
    }
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public String getBorder(){
        return border;
    }
    public void setBorder (String border){
        this.border = border;
    }
    public void printInfo (){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
    }
}

// masuk diprivate, tidak masuk kelas, dipanggil pake methoed yang public kayak get warna dll jangan pakai this