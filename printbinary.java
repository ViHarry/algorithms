public class binaryprint {
    public static void main(String[] args) {
        print("", 0, 4);
    }

    public static void print(String s, int d, int N) {
        if(d==N) {
            System.out.println(s);
            return;
        }
	// Reverse below two lines to print binary numbers in increasing order
        print(s+"1", d+1, N);
        print(s+"0", d+1, N);
    }
}
