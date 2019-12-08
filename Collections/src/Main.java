import java.util.*;


public class Main {
    public static void main(String[] args) {
        int size = 100000;
        Long StartTime, EndTime;

        System.out.println("ARRAY LIST AND LINKED LIST");
        System.out.println();
        //create
        StartTime = System.nanoTime();
        LinkedList<Integer> linkList = new LinkedList<>();
        EndTime = System.nanoTime();
        System.out.printf("Creating: LinkedList - " + (EndTime - StartTime));
        StartTime = System.nanoTime();
        ArrayList<Integer> arrList = new ArrayList<>();
        EndTime = System.nanoTime();
        System.out.println(", ArrayList  - " + (EndTime - StartTime));
        System.out.println();

        //add
        StartTime = System.nanoTime();
        for(int j = 0; j < size; j++){
            linkList.add(j);
        }
        EndTime = System.nanoTime();
        System.out.printf("Adding: LinkedList - " + (EndTime - StartTime));
        StartTime = System.nanoTime();
        for(int j = 0; j < size; j++){
            arrList.add(j);
        }
        EndTime = System.nanoTime();
        System.out.println(", ArrayList  - " + (EndTime - StartTime));
        System.out.println();

        StartTime = System.nanoTime();
        linkList.add(size/2,-1);
        EndTime = System.nanoTime();
        System.out.printf("Adding (middle): LinkedList - " + (EndTime - StartTime));
        StartTime = System.nanoTime();
        arrList.add(size/2,-1);
        EndTime = System.nanoTime();
        System.out.println(", ArrayList - " + (EndTime - StartTime));
        size++;
        System.out.println();

        //remove
        StartTime = System.nanoTime();
        linkList.remove(size/2);
        EndTime = System.nanoTime();
        System.out.printf("Remove (middle):  LinkedList - " + (EndTime - StartTime));
        StartTime = System.nanoTime();
        arrList.remove(size/2);
        EndTime = System.nanoTime();
        System.out.println(", ArrayList - "+ (EndTime - StartTime));
        size--;
        System.out.println();

        //set
        StartTime = System.nanoTime();
        linkList.set(size/2, - 99);
        EndTime = System.nanoTime();
        System.out.printf("Set (middle): LinkedList - " + (EndTime - StartTime));
        StartTime = System.nanoTime();
        arrList.set(size/2, -99);
        EndTime = System.nanoTime();
        System.out.println(", ArrayList - " + (EndTime - StartTime));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




        System.out.println("HASH SET, LINKED HASH SET AND TREE SET");
        System.out.println();

        //create
        StartTime = System.nanoTime();
        HashSet<Integer> set = new HashSet<>();
        EndTime = System.nanoTime();
        System.out.printf("Creating: HashSet - " + (EndTime - StartTime));
        StartTime = System.nanoTime();
        LinkedHashSet<Integer> linkSet = new LinkedHashSet<>();
        EndTime = System.nanoTime();
        System.out.printf(", LinkedHashSet - " + (EndTime - StartTime));
        StartTime = System.nanoTime();
        TreeSet<Integer> tree = new TreeSet<>();
        EndTime = System.nanoTime();
        System.out.println(", TreeSet - " + (EndTime - StartTime));
        System.out.println();

        //add
        StartTime = System.nanoTime();
        for(int i = 0; i < size; i++)
            set.add(i);
        EndTime = System.nanoTime();
        System.out.printf("Add: HashSet - "+ (EndTime-StartTime));
        StartTime = System.nanoTime();
        for(int i = 0; i < size; i++)
            linkSet.add(i);
        EndTime = System.nanoTime();
        System.out.printf(", LinkedHashSet - "+ (EndTime-StartTime));
        StartTime = System.nanoTime();
        for(int i = 0; i < size; i++)
            tree.add(i);
        EndTime = System.nanoTime();
        System.out.println(", TreeSet - "+ (EndTime-StartTime));
        System.out.println();

        //Remove
        StartTime = System.nanoTime();
        set.remove(size/2);
        EndTime = System.nanoTime();
        System.out.printf("Remove (middle): HashSet - "+ (EndTime-StartTime));
        StartTime = System.nanoTime();
        linkSet.remove(size/2);
        EndTime = System.nanoTime();
        System.out.printf(", LinkedHashSet - "+ (EndTime-StartTime));
        StartTime = System.nanoTime();
        tree.remove(size/2);
        EndTime = System.nanoTime();
        System.out.println(", TreeSet - "+ (EndTime-StartTime));
        System.out.println();

        //contains
        StartTime = System.nanoTime();
        set.contains(size/4);
        EndTime = System.nanoTime();
        System.out.printf("Contains (middle): HashSet - "+ (EndTime-StartTime));
        StartTime = System.nanoTime();
        linkSet.contains(size/4);
        EndTime = System.nanoTime();
        System.out.printf(", LinkedHashSet - "+ (EndTime-StartTime));
        StartTime = System.nanoTime();
        tree.contains(size/4);
        EndTime = System.nanoTime();
        System.out.println(", TreeSet - "+ (EndTime-StartTime));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




        System.out.println("HASH MAP, LINKED HASH MAP AND TREE MAP");
        System.out.println();

        //create
        StartTime = System.nanoTime();
        HashMap<Integer, String> Map = new HashMap<>();
        EndTime = System.nanoTime();
        System.out.printf("Creating: HashMap - " + (EndTime - StartTime));
        StartTime = System.nanoTime();
        LinkedHashMap<Integer, String> linkM = new LinkedHashMap<>();
        EndTime = System.nanoTime();
        System.out.printf(", LinkedHashMap - " + (EndTime - StartTime));
        StartTime = System.nanoTime();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        EndTime = System.nanoTime();
        System.out.println(", TreeMap - " + (EndTime - StartTime));
        System.out.println();

        //put
        StartTime = System.nanoTime();
        for(int i = 0; i < size; i++)
            Map.put(i,((Integer)i).toString());
        EndTime = System.nanoTime();
        System.out.printf("Put: HashMap - "+ (EndTime-StartTime));
        StartTime = System.nanoTime();
        for(int i = 0; i < size; i++)
            linkM.put(i,((Integer)i).toString());
        EndTime = System.nanoTime();
        System.out.printf(", LinkedHashMap - "+ (EndTime-StartTime));
        StartTime = System.nanoTime();
        for(int i = 0; i < size; i++)
            treeMap.put(i,((Integer)i).toString());
        EndTime = System.nanoTime();
        System.out.println(", TreeMap - "+ (EndTime-StartTime));
        System.out.println();

        //remove
        StartTime = System.nanoTime();
        Map.remove(size/2);
        EndTime = System.nanoTime();
        System.out.printf("Remove (middle): HashMap - "+ (EndTime-StartTime));
        StartTime = System.nanoTime();
        linkM.remove(size/2);
        EndTime = System.nanoTime();
        System.out.printf(", LinkedHashMap - "+ (EndTime-StartTime));
        StartTime = System.nanoTime();
        treeMap.remove(size/2);
        EndTime = System.nanoTime();
        System.out.println(", TreeMap - "+ (EndTime-StartTime));
        System.out.println();

        //contains
        StartTime = System.nanoTime();
        Map.containsValue(size/4);
        EndTime = System.nanoTime();
        System.out.printf("Contains (middle): HashMap - "+ (EndTime-StartTime));
        StartTime = System.nanoTime();
        linkM.containsValue(size/4);
        EndTime = System.nanoTime();
        System.out.printf(", LinkedHashMap - "+ (EndTime-StartTime));
        StartTime = System.nanoTime();
        treeMap.containsValue(size/4);
        EndTime = System.nanoTime();
        System.out.println(", TreeMap - "+ (EndTime-StartTime));
    }
}