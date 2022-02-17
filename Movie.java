import java.util.Scanner;
 public class Movie{
    private String title;
    private String studio;
    private String ratings;
    Movie(){}
    Movie(String a , String b , String c){
        title=a;
        studio = b;
        ratings =c;
    }
    Movie(String a , String b ){
        title=a;
        studio = b;
        ratings ="PG";
    }

    public  void display(){
        System.out.println("The title of the movie is " + title);
        System.out.println("The studio of the movie is " + studio);
        System.out.println("The ratings of the movie is " + ratings);
        System.out.println();
    }
    public static Movie[] getPG(Movie [] arr,int x){
        int count=0;

        for(int i=0;i<x;i++){
            if(arr[i].ratings.equals("PG")) {
                count++;
            }
        }
        Movie[] value = new Movie [count];
        int temp =0;
        for(int i=0;i<x;i++){
            if(arr[i].ratings.equals("PG")) {
                value[temp]=arr[i];
                temp++;
            }
        }
        return value;
    }
    public static int getPG1(Movie [] arr,int y){
        int count=0;

        for(int i=0;i<y;i++){
            if(arr[i].ratings.equals("PG")) {
                count++;
            }
        }
        return count;
    }
}
class CINEMA {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        Movie m1 = new Movie("Casino Royales","Eon Productions","PG-13");
        m1.display();
        System.out.println("Enter number of movies :");
        int n=s.nextInt();
        s.nextLine();
        Movie [] arr = new Movie[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter name of the movie:");
            String name = s.nextLine();
            System.out.println("Enter studio of the movie :");
            String std = s.nextLine();
            System.out.println("Enter rating of the movie: ");
            String rat = s.nextLine();

            arr[i] = new Movie(name, std, rat);
        }
        int count= Movie.getPG1(arr,n);
        Movie[] a = Movie.getPG(arr,n);
        for (int  i =0;i<count;i++){
            a[i].display();
        }
    }
}
