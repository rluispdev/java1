package pratic4;

public class MainPratic4 {
    public static void main(String[] args) {
        Person personObj = new Person();
        personObj.heyPerson();

        Calc calcObj = new Calc();
        int numberReturned =  calcObj.returnDouble(89);
        System.out.println(numberReturned);

        Music musicObj = new Music();
        musicObj.title = "A prometida";
        musicObj.artist = "Br'oz";
        musicObj.yearRelease = 2003;
        musicObj.rating = 0;
        musicObj.numRating = 0;
        musicObj.credits();

        musicObj.getRating(7.9);
        musicObj.getRating(8.1);
        musicObj.getRating(5.8);
        musicObj.getRating(3.6);
        musicObj.getRating(7.9);

        System.out.println(musicObj.rating);
        System.out.println(musicObj.returnMedia());

        Student study = new Student();
        study.name = "Roony";
        study.age = 30;
        study.student();

        Car carObj = new Car();
        carObj.model = "Fiat Uno";
        carObj.year = 2009;
        carObj.color = "Cinza";
        carObj.dataSheet();
        carObj.calcAgeCar(2024);









    }
}
