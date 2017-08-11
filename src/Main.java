import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in), ssc;
        int state = 0;
        String line, nationality, name;
        Person p1 = null, p2 = null;
        List<Round> l = null;
        while (state != 99) {
            line = sc.nextLine();
            switch (state) {
                case 0:
                    if (line.equals(".")) {
                        state = 99;
                    } else {
                        l = new ArrayList<>();
                        ssc = new Scanner(line);
                        nationality = ssc.next();
                        name = ssc.next();
                        p1 = new Person(nationality, name);
                        state = 1;
                    }
                    break;
                case 1:
                    ssc = new Scanner(line);
                    nationality = ssc.next();
                    name = ssc.next();
                    p2 = new Person(nationality, name);
                    state = 2;
                    break;
                case 2:
                    switch (line) {
                        case ".":
                            System.out.println(new Game(p1, p2, l));
                            state = 99;
                            break;
                        case "-":
                            System.out.println(new Game(p1, p2, l));
                            state = 0;
                            break;
                        default:
                            ssc = new Scanner(line);
                            String symbolOne = ssc.next();
                            String symbolTwo = ssc.next();
                            l.add(new Round(symbolOne, symbolTwo));
                            break;
                    }
                    break;
            }
        }
    }
}