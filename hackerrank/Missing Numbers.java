import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        HashMap<Integer, Integer> ori = new HashMap<>();
        HashMap<Integer, Integer> miss = new HashMap<>();
        LinkedHashSet<Integer> ans = new LinkedHashSet<>();
        for(int i=0; i<arr.size(); i++) {
            if(miss.containsKey(arr.get(i))) 
                miss.put(arr.get(i), miss.get(arr.get(i))+1);
            else 
                miss.put(arr.get(i), 1);
        }
        for(int i=0; i<brr.size(); i++) {
            if(ori.containsKey(brr.get(i))) 
                ori.put(brr.get(i), ori.get(brr.get(i))+1);
            else 
                ori.put(brr.get(i), 1);
        }
    
        for(Map.Entry<Integer, Integer> el: ori.entrySet()) {
            if(!miss.containsKey(el.getKey())) 
                ans.add(el.getKey());
            else if(miss.containsKey(el.getKey()) && miss.get(el.getKey()) < el.getValue()) 
                ans.add(el.getKey());
        }
        return new ArrayList<>(ans);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.missingNumbers(arr, brr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

