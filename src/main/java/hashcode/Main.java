package hashcode;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

public class Main {

    private static final String INPUT_FILE = "input.txt";
    private static final String MANY_BOOKS = "many_books.txt";


    public static void main(String[] args) throws IOException {

        List<String> input = FileUtils.readLines(new File(INPUT_FILE), Charset.defaultCharset());

        String[] firstLine = input.get(0).split(" ");
        String books = firstLine[0];
        String librares = firstLine[1];
        String deadline = firstLine[2];

        System.out.println(books);
        System.out.println(librares);
        System.out.println(deadline);

    }

}
