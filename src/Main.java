import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listUni = new ArrayList<>();

        //Добавляем элементы в ArrayList
        listUni.add("MIT");
        listUni.add("Stanford");
        listUni.add("Harvard");
        listUni.add("Caltech");

        //Добавляем элементы по указанному индексу
        listUni.add(2,"Oxford");
        listUni.add(3,"Cambridge");


    }
}
