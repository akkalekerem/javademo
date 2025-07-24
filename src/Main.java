import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        //Örnek görevler:
        todoList.add("Java öğren");
        todoList.add("Spring Boot öğren");

        //Görevleri göster
        System.out.println("Görevler:");
        for (int i = 0; i < todoList.size(); i++){
            System.out.println((i + 1) + ". " + todoList.get(i));
        }

        //Yeni görev ekleme
        System.out.print("Yeni görev giriniz(Boş bırakılırsa eklenmez): ");
        String newTask = scanner.nextLine();

        if (!newTask.trim().isEmpty()){
            todoList.add(newTask);//Görevi listeye ekle
            System.out.println("Yeni görev eklendi.");
        } else {
            System.out.println("Boş görev eklenmedi.");
        }


        //Güncel görev listesi
        System.out.println("Güncel görevler: ");
        for (int i = 0; i< todoList.size(); i++){
            System.out.println((i+1)+ ". " +todoList.get(i));
        }
        scanner.close();
    }
}