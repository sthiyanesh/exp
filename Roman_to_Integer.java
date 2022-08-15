public class Roman_to_Integer {
    public int romanToInt(String s) {
        int total = 0;
        int last = 0;
        int current = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            switch(c){
                case 'I':
                    current=1;
                    break;
                case 'V':
                    current=5;
                    break;
                case 'X':
                    current=10;
                    break;
                case 'L':
                    current=50;
                    break;
                case 'C':
                    current=100;
                    break;
                case 'D':
                    current=500;
                    break;
                case 'M':
                    current=1000;
                    break;
            }
            if(last<current){
                total=total-last-last+current;
            }else{
                total=total+current;
            }
            last=current;
        }
        return total;
    }
}
