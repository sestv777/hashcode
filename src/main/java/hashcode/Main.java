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
        System.out.println(input);

    }

}
