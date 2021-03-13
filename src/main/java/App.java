import java.util.Arrays;
import java.util.List;

/**
 * App class.
 *
 * @author joao.rodrigues
 */
public class App {

  public static void main(String[] args) {

    List<String> list = Arrays.asList("1", "2", "3", "4");
    Integer number = list.stream()
            .map(c -> Integer.parseInt(c))
            .filter(c -> c % 2 != 0)
            .reduce(0, (acc, cur) -> acc + cur);
    System.out.println(number);

  }

}
