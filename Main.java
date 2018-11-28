import java.util.*;

public class Main {

    public static void main(String[] args) {
        
    }

    public ArrayList<String> shift_array (ArrayList<String> arr) {
        ArrayList<String> shifted_arr = new ArrayList<>();
        shifted_arr.add(arr.get(arr.size()-1));
        for (int i = 0; i < arr.size() - 1; i ++)
            shifted_arr.add(arr.get(i));
        return shifted_arr;
    }
}
