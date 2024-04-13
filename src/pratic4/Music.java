package pratic4;

public class Music {

        String title;
        String artist;
        int yearRelease;
        double rating;
        int totalRating;
        int numRating;

        void credits(){
            System.out.println("Nome da musica: " + title);
            System.out.println("Artista: " + artist);
            System.out.println("Ano de Lançamento: " + yearRelease);
            System.out.println("Avaliação: " + rating);
            System.out.println("Número de avaliações: " + totalRating);
        }

        void getRating(double grade){
             rating += grade;
             totalRating += 1;
        };

        double returnMedia(){
           return rating / totalRating;
        };

}
