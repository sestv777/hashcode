package hashcode;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static final String INPUT_FILE = "input.txt";
    private static final String MANY_BOOKS = "many_books.txt";
    private static List<Integer> scores;
    private static int books;
    private static int librares;
    private static int days;

    public static void main(String[] args) throws IOException {

        List<String> input = FileUtils.readLines(new File(INPUT_FILE), Charset.defaultCharset());

        parseFirst(input);
        parseSecond(input);

        System.out.println(books);
        System.out.println(librares);
        System.out.println(days);

    }

    private static void parseFirst(List<String> input) {
        String[] firstLine = input.get(0).split(" ");
        books = Integer.parseInt(firstLine[0]);
        librares = Integer.parseInt(firstLine[1]);
        days = Integer.parseInt(firstLine[2]);
    }

    private static void parseSecond(List<String> line) {
        scores = Stream.of(line.get(1).split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
