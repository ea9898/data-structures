package structures.arraylist;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.set(1, 22);
        System.out.println(list);

        list.add(0, 33);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println(list.get(0));
    }
}
