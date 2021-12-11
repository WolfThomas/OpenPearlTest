import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

  public static void main(String[] args) {
    try {

      // DEBUG
      Path path = Paths.get("");
      String directoryName = path.toAbsolutePath().toString();
      // DEBUG

      //ANTLRStringStream in = new ANTLRStringStream("12*(5-6)");
      //ExpLexer lexer = new ExpLexer(in);
      //CommonTokenStream tokens = new CommonTokenStream(lexer);
      //ExpParser parser = new ExpParser(tokens);
      //parser.eval();

      CharStream input = CharStreams.fromFileName("code.txt");
      var lexer = new SmallPearlLexer(input);

      TokenStream tokenStream = new CommonTokenStream(lexer);
      var parser = new SmallPearlParser(tokenStream);
      parser.setBuildParseTree(true);

      var walker = new ParseTreeWalker();
      MyListener listener = new MyListener(parser);
      walker.walk(new SmallPearlBaseListener(), parser.program());


      //generator.printDebugOutput();
    } catch (IOException ex) {
      System.out.println("Error:"+ex);
    }

  }
}
