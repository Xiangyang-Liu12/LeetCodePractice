package Strings;

public class GroupAnagrams {
    public List<List<Stirngs>> GroupAnagrams(String[] strs){
       List<List<String>> result = new ArrayList<>();
       Map<String, List<String>> map = new HashMap<>();

       for(String s : strs){
           char[] c = s.toCharArray();
           Arrays.sort(c);
           String sorted = new String(c);
           if(!map.contains(sorted)){
             map.put(s, new ArrayList<>());
           }

           map.get(sorted).add(s);
       }

       result.addAll(map.values);
       return result;
    }
}
