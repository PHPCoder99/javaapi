import java.util.ArrayList;

public class Sem3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(-1);
        arr.add(-2);
        ArrayList<Integer> x = task1(arr);
        for (Integer integer : x) {
            System.out.println(integer);
        }

        System.out.println("---");
        System.out.println(findMin(arr));

        System.out.println("---");
        System.out.println(findMax(arr));

        System.out.println("---");
        System.out.println(findAvg(arr));
    }

    public static ArrayList<Integer> task1(ArrayList<Integer> arr){
        ArrayList<Integer> arrOdd = new ArrayList<>();
        for (Integer integer : arr) {
            if (integer % 2 != 0) {
                arrOdd.add(integer);
            }
        }
        return arrOdd;
    }

    public static Integer findMin(ArrayList<Integer> arr){
        Integer min = arr.get(0);
        for (Integer integer : arr) {
            if (integer < min){
                min = integer;
            }
        }
        return min;
    }

    public static Integer findMax(ArrayList<Integer> arr){
        Integer max = arr.get(0);
        for (Integer integer : arr) {
            if (integer > max){
                max = integer;
            }
        }
        return max;
    }

    public static Double findAvg(ArrayList<Integer> arr){
        Double summa = 0.0;
        for (Integer integer : arr) {
            summa += integer;
        }
        return summa / arr.size();
    }
}
