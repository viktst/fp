package com.fp.refactoring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WordCount {
    public long countInFileImperative(String searchWord, String filePath)
            throws IOException {
        long count = 0;
        return count;
    }

    public long countInFileFunctional(String searchWord, String filePath)
            throws IOException {
        return Files.lines(Paths.get(filePath))
                .flatMap(line -> Stream.of(line.split(" ")))
                .filter(word -> word.equals(searchWord))
                .count();
    }
}
