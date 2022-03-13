package daily.week4;

import java.util.*;

/**
 * @description: 49. 字母异位词分组
 * @create: 2020-12-14-13:01
 * @author: Hey
 */

/*
    1.对字符串数组排序,使得每一组字母异位词只有一个key.
    2.把字母不同的字符串作为map的key,该key所对应的value则是一组字母异位词
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagrams(strs);
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if (!map.containsKey(s)) {
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}















