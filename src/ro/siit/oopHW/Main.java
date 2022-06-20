package ro.siit.oopHW;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Main main = new Main();

    public static void main(String[] args) {
        ArrayList bookList = new ArrayList();
        bookList.add(new Novel("Moara cu Noroc", 393, "Drama"));
        bookList.add(new ArtAlbum("80's Disco Scene", 44, "7/10"));
        bookList.add(new Novel("The Great Gatsby", 821, "Fiction"));
        Scanner keyboard = new Scanner(System.in);
        int option;
        int novelOrAlbum;
        do {
            showOptions();
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    System.out.println("1. Add a novel\n2. Add an art album");
                    novelOrAlbum = keyboard.nextInt();
                    switch (novelOrAlbum) {
                        case 1 -> {
                            Novel novel = main.takeNovelInput();
                            bookList.add(novel);
                            System.out.println("Your novel has been added to the catalog successfully");
                        }
                        case 2 -> {
                            ArtAlbum artAlbum = main.takeArtAlbumInput();
                            bookList.add(artAlbum);
                            System.out.println("Your art album has been added to the catalog successfully");
                        }
                        default -> System.out.println("Please enter a valid option");
                    }
                    break;
                case 2:
                    removeByIndex(bookList, keyboard);
                    if (bookList.size() == 0){
                        System.out.println("The last book in your catalog has been remvoed\nYou have no books");
                    }
                    break;
                case 3:
                    if (bookList.size() == 0){
                        System.out.println("You have no books in your catalog");
                    }
                    bookList.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Thank you for using this program");
                    break;
                default:
                    System.out.println("Invalid option\nPlease choose again");
            }
        } while (option != 4);
    }

    private static void showOptions() {
        System.out.println("\n~Menu~\n1. Add a book\n2. Remove a book\n3. List all my books\n4. Exit\nChoose your option:");
    }

    private Novel takeNovelInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter novel name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter novel genre: ");
        String genre = keyboard.nextLine();
        System.out.println("Enter number of pages ");
        int numberOfPages = keyboard.nextInt();

        return new Novel(name, numberOfPages, genre);

    }

    private ArtAlbum takeArtAlbumInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the art album name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter the paper quality rating : ");
        String paperQuality = keyboard.nextLine();
        System.out.println("Enter number of pages ");
        int numberOfPages = keyboard.nextInt();

        return new ArtAlbum(name, numberOfPages, paperQuality);
    }

    private static void removeByIndex(ArrayList bookList, Scanner keyboard) {
        System.out.println("Enter the index of the book you wish to remove\n(for example the first book would be index 0, the second one index 1, the third one index 2 and so on...)");
        int index = keyboard.nextInt();
        if (index > bookList.size()) {
            System.out.println("The index you have entered is invalid\nPlease enter the correct index");
        }
        if (index < bookList.size()){
        bookList.remove(index);
        System.out.println("The book with the index of " + index + " has been removed successfully");}
    }
}