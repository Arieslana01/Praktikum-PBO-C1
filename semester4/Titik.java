public class Titik {
    double absis;
    double ordinat;

    Titik(){
        absis = 0;
        ordinat = 0;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis (double x){
        absis = x;
    }

    void setOrdinat (double y){
        absis = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat +  ")");
    }

}