public class MyListener extends OpenPearlBaseListener {

    private OpenPearlParser parser;
    public MyListener(OpenPearlParser parser) { this.parser = parser;  }



    public void exitProgram(OpenPearlParser.ProgramContext ctx) {
        System.out.println(">>> in MyListener for function");
        System.out.println(parser.getTokenStream().getText(ctx));
    }
}