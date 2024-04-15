import com.aluracursos.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie miMovie = new Movie();
        miMovie.setName("Encanto");
        miMovie.setReleaseDate(2021);
        miMovie.setDurationInMinutes(120);
        miMovie.setIncludedInThePlan(true);

        miMovie.showDataSheet();
        miMovie.evalua(3);
        miMovie.evalua(6);
        miMovie.evalua(10);
        System.out.println(miMovie.getEvaluationsTotal());
        System.out.println("Média de evaluaciones de la película: " +miMovie.calculaMedia());

//        com.aluracursos.screenmatch.models.Movie newMovie = new com.aluracursos.screenmatch.models.Movie();
//        newMovie.name = "Matrix";
//        newMovie.releaseDate = 2000;
//        newMovie.durationInMinutes = 180;
//
//        System.out.println("Mi pelicula es: " + newMovie.name);
//        System.out.println("Su fecha de lanzamiento fue: " + newMovie.releaseDate);
    }
}
