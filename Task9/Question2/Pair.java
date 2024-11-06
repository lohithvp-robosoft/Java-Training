package Task9.Question2;

public class Pair<T, U> {
    private T var1;
    private U var2;

    Pair(T var1, U var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public T getVar1() {
        return var1;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    public U getVar2() {
        return var2;
    }

    public void setVar2(U var2) {
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return "Var1 : " + var1 + ", Var2 : " + var2;
    }
}
