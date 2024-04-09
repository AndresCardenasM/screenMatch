public class Main {
    public static void main(String[] args) {
        Movie miMovie = new Movie();
        miMovie.name = "Encanto";
        miMovie.releaseDate = 2021;
        miMovie.durationInMinutes = 120;
        miMovie.includedInThePlan= true;

        miMovie.showDataSheet();
        miMovie.evalua(3);
        miMovie.evalua(6);
        miMovie.evalua(10);
        System.out.println("Média de evaluaciones de la película: " +miMovie.calculaMedia());

        Movie newMovie = new Movie();
        newMovie.name = "Matrix";
        newMovie.releaseDate = 2000;
        newMovie.durationInMinutes = 180;

        System.out.println("Mi pelicula es: " + newMovie.name);
        System.out.println("Su fecha de lanzamiento fue: " + newMovie.releaseDate);
    }
}
