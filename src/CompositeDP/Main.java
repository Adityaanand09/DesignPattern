package CompositeDP;


public class Main {
    public static void main(String args[]){
        Directory movieFolder = new Directory("Movies");
        IFileSystem movie = new File("Dhoom");
        movieFolder.add(movie);
        Directory comedyMovies = new Directory("comedy movies");
        comedyMovies.add(new File("Hulchul"));
        comedyMovies.add(new File("golmaal"));

        movieFolder.add(comedyMovies);
        movieFolder.ls();
    }
}
