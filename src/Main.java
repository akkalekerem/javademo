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
            System.out.println((i + 1) + ". " + todoList.get(i));
        }

        //Görev güncelleme
        System.out.print("Düzenlemek istediğiniz görevin numarasını giriniz: ");
        int indexToUpdate = scanner.nextInt();
        scanner.nextLine(); //BU KISIM ÇOK ÖNEMLİ YAPMAYI UNUTMA

        if (indexToUpdate > 0 && indexToUpdate <= todoList.size()){
            System.out.print("Yeni görev Başlığını giriniz: ");
            String newTask = scanner.nextLine();
            todoList.set(indexToUpdate - 1, newTask);
            System.out.println("Görev güncellendi.");
        } else {
            System.out.println("Geçersiz bir görev numarası tuşladınız. ");
        }

        //Güncel görev listesi
        System.out.println("Güncel görevler: ");
        for (int i = 0; i< todoList.size(); i++){
            System.out.println((i+1)+ ". " +todoList.get(i));
        }
        scanner.close();
    }
}