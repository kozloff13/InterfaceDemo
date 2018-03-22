public class Hello implements IHello{

    int start;
    int val;

    Hello() {
        start = 0;
        val = 0;
    }


    @Override
    public int getNext() {
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
