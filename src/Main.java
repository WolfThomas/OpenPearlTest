/*
 [A "BSD license"]
 Copyright (c) 2021 Thomas Wolf
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:

 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

  private static HashMap<String, Integer> m_rules = new HashMap();

  public static void main(String[] args) throws IOException {
    //runTest(args);
    sumOfRules();
  }
  private static void sumOfRules() throws IOException {
    boolean fileNotFound = false;
    int count = 0;
    String fileName = "GeneratedRules";
    String fileSuffix = ".txt";

    while (!fileNotFound) {
      Path fileRules = Paths.get(fileName + count + fileSuffix);
      if (Files.exists(fileRules)) {
        List<String> lines = Files.lines(fileRules, StandardCharsets.UTF_8).collect(Collectors.toList());

        for (var line : lines) {
          if (line != null) {
            if (!m_rules.containsKey(line)) {
              m_rules.put(line, 0);
            }
            m_rules.put(line, m_rules.get(line) + 1);
          }
        }

        count++;
      } else {
        fileNotFound = true;
      }
    }

    try (FileWriter fileWriter = new FileWriter("SumRulesUsed.txt", false)) {
      m_rules.forEach((r, c) -> {
        try {
          fileWriter.write(r + "; " + c + System.lineSeparator());
        } catch (IOException e) {
          e.printStackTrace();
        }
      });
    } catch (IOException ex) {
      System.out.println("Error:" + ex);
    }
  }
  private static void runTest(String[] args) {
    try {
      // DEBUG
      Path path = Paths.get("");
      String directoryName = path.toAbsolutePath().toString();
      // DEBUG

      Path filePath = Paths.get("Generated0.prl");

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
      var lexer = new OpenPearlLexer(input);

      TokenStream tokenStream = new CommonTokenStream(lexer);
      var parser = new OpenPearlParser(tokenStream);
      parser.setBuildParseTree(true);

      var walker = new ParseTreeWalker();
      MyListener listener = new MyListener(parser);
      walker.walk(new OpenPearlBaseListener(), parser.program());


      //generator.printDebugOutput();
    } catch (IOException ex) {
      System.out.println("Error:"+ex);
    }
  }
}
