import java.util.LinkedList;

public class task1 {

    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(0, 8);
        linkList.add(1, 3);
        linkList.add(2, 1);
        linkList.add(3, 6);
        linkList.add(4, 2);
        System.out.println("Иначальный " + linkList);
        System.out.println("Перевернутый" + reverse(linkList));
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> linkList) {
        LinkedList<Integer> linkList2 = new LinkedList<>();
        for (int i = linkList.size() - 1; i >= 0; i--) {
            linkList2.add(linkList.get(i));
        }
        return linkList2;
    }

}
