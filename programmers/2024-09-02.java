class Solution {
    public int solution(String s) {
        
        //영문자에 대응하는 숫자로 치환 
        s = s.replace("zero", "0"); 
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");

        // 문자열을 int형으로 변환하여 저장 
        int answer = Integer.parseInt(s);
        
        return answer;
    }
}
