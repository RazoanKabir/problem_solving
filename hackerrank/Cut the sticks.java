import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> cutTheSticks(List<Integer> arr) {
    List<Integer> result = new ArrayList<>();
    Collections.sort(arr);
    while(!arr.isEmpty()) {
        if(arr.get(0) == arr.get(arr.size()-1)) {
            result.add(arr.size());
            break;
        }
        result.add(arr.size());
        for(int j=0;j<arr.size();) {
           if(arr.get(j)< arr.get(j+1)){
               for(int i=j+1; i< arr.size(); i++) {
                   arr.set(i, arr.get(i)-arr.get(j));
               }
               arr.remove(j);
               break;
           } else if(arr.get(j) == arr.get(j+1)) {
               arr.remove(j);
           }  
        }
    }
    return result;

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

        List<Integer> result = Result.cutTheSticks(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
