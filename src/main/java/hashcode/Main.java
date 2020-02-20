package hashcode;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

public class Main {

    private static final String INPUT_FILE = "input.txt";


    public static void main(String[] args) throws IOException {

        List<String> input = FileUtils.readLines(new File(INPUT_FILE), Charset.defaultCharset());

        String firstLine = input.get(0);
        String books = firstLine.substring(0, 1);
        String librares = firstLine.substring(2, 3);
        String deadline = firstLine.substring(4, 5);

        System.out.println(books);
        System.out.println(librares);
        System.out.println(deadline);

    }

}
