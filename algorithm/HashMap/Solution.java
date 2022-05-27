import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        //입력, 중복처리
        for (String name : participant) {
            //getOrDefault = name의 값이 존재하면 name의 value 값을 넣어주고 없다면 0
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            //completion이랑 map.get(name)이랑 같으면 삭제
            if (map.get(name) == 1) {
                map.remove(name);
            } else {
                //(중복 값이면 value를 -1 넣겠다.)
                map.put(name, map.get(name) - 1);
            }
        }
        return map.keySet().iterator().next();
    }
}










