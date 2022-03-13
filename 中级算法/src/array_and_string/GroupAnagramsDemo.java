package array_and_string;

/**
 * @author hey
 * @description 字母异位词分组
 * @create 2020-05-21-20:24
 */
public class GroupAnagramsDemo {
   /* public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length==0)return new ArrayList<>();
        Map<String,List> ans = new HashMap<>();
        for (String str : strs) {
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String key = String.valueOf(a);
            if (!ans.containsKey(key)) {
                ans.put(key,new ArrayList());
            }
            ans.get(key).add(str);
        }
        return new ArrayList<>(ans.values());
    }*/
}
