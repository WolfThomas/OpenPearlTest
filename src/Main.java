import org.antlr.v4.runtime.*;

import java.io.File;
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

      Path filePath = Paths.get("PearlTest.prl");

      for(int i=0; i < args.length; i++) {
        String option = args[i];

        if (option.startsWith("-h") || option.startsWith("-H")){
          System.out.println("-f/-F Source file path");
        }
        else if (option.startsWith("-f") || option.startsWith("-F")) {
          if ((i+1) <args.length) {
            filePath = Paths.get(args[i + 1]);
          }
          else {
            System.out.println("Error: invalid filepath");
          }
        }
      }

      //ANTLRStringStream in = new ANTLRStringStream("12*(5-6)");
      //ExpLexer lexer = new ExpLexer(in);
      //CommonTokenStream tokens = new CommonTokenStream(lexer);
      //ExpParser parser = new ExpParser(tokens);
      //parser.eval();

      if (filePath==null) {
        System.out.println("Error: no file specified. See -h for help.");
        return;
      }
      File file = new File(filePath.toString());
      if (!file.exists()) {
        System.out.println("Error: file not found. See -h for help.");
        return;
      }

      CharStream input = CharStreams.fromFileName(filePath.toString());
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
