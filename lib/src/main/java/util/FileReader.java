package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {

public static Stream<String> readFile(String fileName) throws IOException {
    Path path = Paths.get(fileName);
    Stream<String> lines = Files.lines(path);
    return lines;
}
}
