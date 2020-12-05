import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var cl = Thread.currentThread().getContextClassLoader();
        var is = cl.getResourceAsStream(args[0]);
        var cs = CharStreams.fromStream(is);

        var lexer = new BrainfLexer(cs);
        var tokens = new CommonTokenStream(lexer);
        var parser = new BrainfParser(tokens);

        var tree = parser.prog();

        var interpreter = new Interpreter();
        interpreter.visit(tree);
        interpreter.dumpMemory();
    }
}
