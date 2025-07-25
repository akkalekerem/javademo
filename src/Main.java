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
        System.out.println("Görevler :");
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

        //Görev Silme
        System.out.print("Silmek istediğiniz görevin numarasını giriniz (yoksa 0): ");
        int deleteIndex = scanner.nextInt();
        scanner.nextLine();//Dummy read

        if (deleteIndex > 0 && deleteIndex <= todoList.size()) {
            String removedTask = todoList.remove(deleteIndex - 1);
            System.out.println("Silinen görev: " + removedTask);
        } else if (deleteIndex == 0) {
            System.out.println("Silme işlemi yapılmadı.");
        } else {
            System.out.println("Geçersiz numara tuşladınız.");
        }

        // Görev güncelleme
        System.out.print("Güncellemek istediğiniz görevin numarasını yazın: ");
        int  updateIndex = scanner.nextInt();
        scanner.nextLine();//dummy read
         if (updateIndex > 0 && updateIndex <= todoList.size()) {
             System.out.print("Yeni görev metnini girin: ");
             String updatedTask = scanner.nextLine();
             todoList.set(updateIndex - 1, updatedTask);
             System.out.println("Görev güncellendi.");
         } else if (updateIndex == 0) {
             System.out.println("Güncelleme yapılmadı.");
         } else {
             System.out.println("Geçersiz numara!");
         }
        //Güncel görev listesi
        System.out.println("Güncel görevler: ");
        for (int i = 0; i< todoList.size(); i++){
            System.out.println((i+1)+ ". " +todoList.get(i));
        }

        scanner.close();
    }
}