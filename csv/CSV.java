package csv;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CSV {
    public static void main(String[] args) throws IOException {
        CSVLexer lexer = new CSVLexer(CharStreams.fromStream(Files.newInputStream(Paths.get("t.csv"))));
        CSVParser parser = new CSVParser(new CommonTokenStream(lexer));
        CSVParser.FileContext parseTree = parser.file();
        CSVVisitorImpl visitor = new CSVVisitorImpl();
        System.out.println(visitor.visit(parseTree));
    }
}
