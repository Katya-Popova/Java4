import java.util.LinkedList;
//Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(0, 8);
        linkList.add(1, 3);
        linkList.add(2, 1);
        linkList.add(3, 6);
        linkList.add(4, 2);
        System.out.println("Иначальный список " + linkList);
        System.out.println("Выберите нужное: ");
        System.out.println("1: enqueue() - помещает элемент в конец очереди");
        System.out.println("2: dequeue() - возвращает первый элемент из очереди и удаляет его");
        System.out.println("3: first() - возвращает первый элемент из очереди, не удаляя");
        Scanner scanner = new Scanner(System.in);
        String op = scanner.nextLine(); 
        scanner.close(); 
        switch (op) {
            case "1":
            enqueue (linkList, 15);
                break;
            case "2":
            dequeue(linkList);
                break;
            case "3":
            first (linkList);
                break;
        }
    }

  
    public static LinkedList<Integer> enqueue (LinkedList<Integer> linkList, int num){
        linkList.addLast(num);
        System.out.println(linkList);
        return linkList;
    }

    public static LinkedList<Integer> dequeue(LinkedList<Integer> linkList){
        linkList.removeFirst();
        System.out.println(linkList);
        return linkList;     
    }

    public static LinkedList<Integer> first (LinkedList<Integer> linkList){
        System.out.println(linkList.getFirst());
        return linkList;     
   }
    
}