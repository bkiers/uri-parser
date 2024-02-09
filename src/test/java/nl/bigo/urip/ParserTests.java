package nl.bigo.urip;

import java.util.Scanner;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import java.io.File;

import static org.junit.Assert.fail;

public class ParserTests {

    @Test
    public void validTest() throws Exception {

         var lexer = new URILexer(CharStreams.fromString(""));
         var parser = new URIParser(new CommonTokenStream(lexer));

         lexer.removeErrorListeners();
         parser.removeErrorListeners();

         parser.setErrorHandler(new BailErrorStrategy());

         var scanner = new Scanner(new File("./uris/valid.txt"));

         while (scanner.hasNextLine()) {
             var line = scanner.nextLine();

             if (line.trim().isEmpty() || line.startsWith("#")) {
                 continue;
             }

             try {
                 lexer.setInputStream(CharStreams.fromString(line));
                 parser.setTokenStream(new CommonTokenStream(lexer));
                 parser.parse();

                 System.out.println("OK valid URI: " + line);
             }
             catch (Exception e) {
                 fail("ERROR: " + line + " -> " + e.getMessage());
             }
         }
    }

    @Test
    public void invalidTest() throws Exception {

        var lexer = new URILexer(CharStreams.fromString(""));
        var parser = new URIParser(new CommonTokenStream(lexer));

        lexer.removeErrorListeners();
        parser.removeErrorListeners();

        parser.setErrorHandler(new BailErrorStrategy());

        var scanner = new Scanner(new File("./uris/invalid.txt"));

        while (scanner.hasNextLine()) {
            var line = scanner.nextLine();

            if (line.trim().isEmpty() || line.startsWith("#")) {
                continue;
            }

            try {
                lexer.setInputStream(CharStreams.fromString(line));
                parser.setTokenStream(new CommonTokenStream(lexer));
                parser.parse();

                fail("Expected an error for: " + line);
            }
            catch (Exception e) {
                System.out.println("OK, rejected invalid URI: " + line);
            }
        }
    }
}
