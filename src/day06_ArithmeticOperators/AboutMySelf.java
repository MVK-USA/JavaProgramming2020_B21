package day06_ArithmeticOperators;

public class AboutMySelf {

    public static void main(String[] args) {
        //String firstName = "John", lastName = "Daniel", fullName =firstName+ " "+ lastName

        String firstName = "John";
        String lastName = "Daniel";
        String fullName = firstName + " "+lastName;

        String from = "USA";
        String favoriteBook = "Data Structure in JAVA";
        String favoriteShow = "Game of Throne";

        System.out.println("Full name is: "+fullName);
        System.out.println("From: "+from);
        System.out.println("Favorite book is: "+favoriteBook);
        System.out.println("Favorite show is: "+ "\""+ favoriteShow+ "\"");

    }

    /*
    variables: firstName, lastName, fullName, from, favoriteBook, favoriteShow
    output:
       Full name is: YourFullName
       From: YourCountryName
       Favorite book is: "YourFavoriteBook"
       Favorite Show is: "YourFavoriteShow"

     */
}
