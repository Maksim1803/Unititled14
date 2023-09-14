// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\Мои документы\\Skill factory2");
        String[] files = file.list();
        for (String fileName : files) {
            //метод проверяющий состав каталога
            //по указанному пути
            // и возвращающий true или false
            System.out.println(fileName);
        }
    }
}