package log;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Log {

    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromStream(Files.newInputStream(Paths.get("t.log")));
        LogLexer lexer = new LogLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LogParser parser = new LogParser(tokenStream);
        ParseTree parseTree = parser.log();
        LogVisitorImpl logVisitor = new LogVisitorImpl();
        logVisitor.visit(parseTree);
        logVisitor.ips.forEach(System.out::println);
    }
}
