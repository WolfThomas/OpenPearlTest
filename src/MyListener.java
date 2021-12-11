public class MyListener extends SmallPearlBaseListener {

    private SmallPearlParser parser;
    public MyListener(SmallPearlParser parser) { this.parser = parser;  }



    public void exitProgram(SmallPearlParser.ProgramContext ctx) {
        System.out.println(">>> in MyListener for function");
        System.out.println(parser.getTokenStream().getText(ctx));
    }
}