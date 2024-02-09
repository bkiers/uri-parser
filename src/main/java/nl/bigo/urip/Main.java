package nl.bigo.urip;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    private static void dump(String source) {
        URILexer lexer = new URILexer(CharStreams.fromString(source));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();

        for (Token t : tokenStream.getTokens()) {
            System.out.printf("%-30s '%s'%n",
                    URILexer.VOCABULARY.getSymbolicName(t.getType()),
                    t.getText().replace("\n", "\\n"));
        }
    }

    public static void main(String[] args) {

        String source = "https://google.com////s";

        dump(source);

        // CypherLexer lexer = new CypherLexer(CharStreams.fromString(source));
        // CypherParser parser = new CypherParser(new CommonTokenStream(lexer));

        // ParseTree root = parser.cypher();

        // System.out.println("\n" + root.toStringTree(parser));
    }
}
