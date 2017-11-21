package MinMaxAbstract;
/**
 * Created by amour on 31.10.2017.
 */
public abstract class AbstractMinMaxGetter {
    protected int elements[];
    protected boolean isSorted;
    public AbstractMinMaxGetter(int elements[]) {
        System.arraycopy(elements,0,this.elements,0, elements.length);
        this.isSorted = false;
    }

    protected abstract void sort();

}
