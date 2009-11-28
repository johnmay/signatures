package signature;

public class InvariantIntStringPair implements
        Comparable<InvariantIntStringPair> {

    public String string;

    public int value;

    public InvariantIntStringPair(String string, int value) {
        this.string = string;
        this.value = value;
    }
    
    public boolean equals(String string, int value) {
        return this.value == value && this.string.equals(string);
    }
    
    public boolean equals(InvariantIntStringPair o) {
        return this.value == o.value && this.string.equals(o.string);
    }

    public int compareTo(InvariantIntStringPair o) {
        int c = this.string.compareTo(o.string);
        if (c == 0) {
            if (this.value < o.value) {
                return -1;
            } else if (this.value > o.value){
                return 1;
            } else {
                return 0;
            }
        } else {
            return c;
        }
    }

}
