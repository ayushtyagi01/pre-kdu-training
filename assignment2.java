import java.util.*;
class Java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<5;i++){
            String st = sc.next();
            arr.add(st);
            set.add(st);
            if (map.containsKey(st)) {
                map.put(st, map.get(st) + 1);
            }
            else {
                map.put(st, 1);
            }
        }
        System.out.println("List Contains:");
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        System.out.println("Set Contains:");
        for (String s : set){
            System.out.println(s);
        }
        System.out.println("Frequency of words:");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Word = "+ entry.getKey() + ", Frequency = " + entry.getValue());
        }
    }
}