package com.CK;

public class Main {

    public static void main(String[] args) {
        new Solution().isStrobogrammatic("69");
    }
}

class Solution {
    public boolean isStrobogrammatic(String num) {
        // build a roated map:
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int ll = 0, rr = num.length() - 1;

        while(ll <= rr){
            char left = num.charAt(ll++);
            char right = num.charAt(rr--);
            if(!map.containsKey(left) || !map.containsKey(right))
                return false;
            if(left != map.get(right))
                return false;
        }

        return true;

    }
}