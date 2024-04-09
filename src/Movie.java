public class Movie {
    String name;
    int releaseDate;
    int durationInMinutes;
    boolean includedInThePlan;
    double evaluationsSum;
    int evaluationsTotal;

    void showDataSheet(){
        System.out.println("El nombre de la pelicula es: "+ name);
        System.out.println("Su fecha de lanzamiento  fue: "+ releaseDate);
        System.out.println("Duracion en minutos de la pelicula: " + durationInMinutes);
    }
    void evalua(double nota){
        evaluationsSum += nota;
        evaluationsTotal++;
    }
    double calculaMedia(){
        return evaluationsSum / evaluationsTotal;
    }
}
