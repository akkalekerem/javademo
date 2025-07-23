import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        //Örnek görevler:
        todoList.add("Java öğren");
        todoList.add("Spring Boot öğren");

        System.out.println("Güncel görevler:");
        for (int i = 0; i < todoList.size(); i++){
            System.out.println((i+1) + ". " + todoList.get(i));
        }

        //Silme işlemi
        System.out.print("Silmek istediğiniz görevin numarasını giriniz: ");
        int indexToDelete = scanner.nextInt();

        if (indexToDelete > 0 && indexToDelete <= todoList.size()){
            String removedTask = todoList.remove(indexToDelete -1);
            System.out.println("Silinen görev: " + removedTask);
        } else {
            System.out.println("Geçersiz bir görev numarası tuşladınız. ");
        }

        //Güncel görev listesi
        System.out.println("Güncel görevler: ");
        for (int i = 0; i< todoList.size(); i++){
            System.out.println((i+1)+ ". " +todoList.get(i));
        }

    }
}