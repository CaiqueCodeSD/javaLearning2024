import java.util.ArrayList;
import java.util.Collections;

public class Main {

    ArrayList<Integer> numeros = new ArrayList<Integer>();

    numeros.add(61891);
    numeros.add(67871);
    numeros.add(636681);

    Collections.sort(numeros);

    int i = 0;

    for (Integer num : numeros) {
        System.out.println("No index [" + i + "] temos o número: " + num);
        i++;
    }
 
}

}
