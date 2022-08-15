public class Convert_a_Number_to_Hexadecimal {
    public String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder b = new StringBuilder(8);
        do {
            b.append(asHex(num & 0xf));
        } while ((num >>>= 4) != 0);
        
        return b.reverse().toString();
    }
    
    char asHex(int v) {
        return (char) (v + (v < 10 ? 48 : 87));
    }
}
