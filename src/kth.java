import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucasgagnon on 2/5/16.
 */
public class kth<E> {

    public kth() {}

    public ArrayList<E> function(List<E> list, int k){
        if (k <= 0) {
            System.out.println("k must be greater than or equal to 0.");
            throw(new ArrayIndexOutOfBoundsException());
        } else if (k - 1 >= list.size()) {
            return new ArrayList<E>();
        } else {
            ArrayList<E> newList = new ArrayList<E>();
            newList.add(list.get(k-1));
            newList.addAll(function(list.subList(k, list.size()), k));
            return newList;
        }
    }


}
