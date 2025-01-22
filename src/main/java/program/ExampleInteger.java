package program;

public class ExampleInteger implements Comparable<ExampleInteger> {
    int a;
    int b;
    int c;

    public ExampleInteger(int a) {
        this.a = a;
        this.b = a + 1;
        this.c = a - 1;
    }

    @Override
    public String toString() {
        return Integer.toString(a + b + c);
    }

    @Override
    public int compareTo(ExampleInteger other) {
        return Integer.compare(this.a, other.a);
    }
}
