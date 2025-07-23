import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args){
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1 - Görev Ekle \n 2 - Görevleri Listele \n 3 - Çıkış");
            String secim = scanner.nextLine(); //Kullanıcının seçimini oku

            if (secim.equals("1")){
                System.out.print("Yeni görev");
                String gorev = scanner.nextLine();
                todoList.add(gorev);
            } else if (secim.equals("2")){
                System.out.println("Yapılacaklar: ");
                for (int i = 0; i < todoList.size(); i++){
                    System.out.println((i + 1) + ". " + todoList.get(i));
                }
            } else if (secim.equals("3")){
                System.out.println("Sisremden çıkılıyor...");
                break; // Döngüyü sonlandır
            } else {
                System.out.println("Geçersiz giriş!!"); //Hata mesajı
            }

        }
        scanner.close();
    }

}
