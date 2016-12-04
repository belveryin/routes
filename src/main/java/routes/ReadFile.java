package routes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {
    public static List<String> getLines(String fileName) {
        List<String> lines = new ArrayList<>();

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            lines = stream.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}
