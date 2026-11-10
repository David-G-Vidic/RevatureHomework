package StarterExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum consequat purus vitae mollis dignissim. Sed vel nisi ante. Vivamus ultrices cursus odio, quis scelerisque nunc sollicitudin vel. Phasellus congue mauris vitae metus ornare, vel ultrices dolor suscipit. Pellentesque imperdiet ipsum felis, et laoreet libero bibendum sed. Quisque pellentesque rhoncus leo sed rutrum. Maecenas ac ex commodo, lacinia mauris sed, ullamcorper libero. In ac posuere tellus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Mauris leo sem, pellentesque vel egestas vitae, ornare eget dui. In quam sem, convallis ut nisi ac, auctor finibus massa. Sed vitae odio et ex gravida tincidunt. Nullam quis tellus risus. Nunc semper tincidunt aliquet.";

        //sanitize string remove punctuation, numbers, but keep spaces, all to lower case
        lorem = lorem.replaceAll("[^\\p{L} ]", "").toLowerCase();
        String[] loremArr = lorem.split("\\s+");

        //Add words and counts to a map
        Map<String, Integer> map = new HashMap<>();
        for (String s : loremArr){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        //Convert to an ArrayList
        ArrayList<Map.Entry<String, Integer>> mapArr = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            mapArr.add(entry);//other option mapArr.addAll(map.entrySet());
        }

        //sort array by value in reversed order
        mapArr.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        //print out results in readable fashion
        for (Map.Entry<String, Integer> entry : mapArr) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
