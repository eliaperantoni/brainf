import java.io.IOException;

public class Interpreter extends BrainfBaseVisitor<Void> {
    private Memory mem = new Memory();

    public void dumpMemory() {
        mem.dump();
    }

    @Override
    public Void visitMain(BrainfParser.MainContext ctx) {
        this.visit(ctx.prog());
        return null;
    }

    @Override
    public Void visitProg(BrainfParser.ProgContext ctx) {
        for (var cmd : ctx.cmd()) {
            this.visit(cmd);
        }
        return null;
    }

    @Override
    public Void visitGroup_lab(BrainfParser.Group_labContext ctx) {
        this.visit(ctx.group());
        return null;
    }

    @Override
    public Void visitGreat(BrainfParser.GreatContext ctx) {
        this.mem.right();
        return null;
    }

    @Override
    public Void visitLess(BrainfParser.LessContext ctx) {
        this.mem.left();
        return null;
    }

    @Override
    public Void visitPlus(BrainfParser.PlusContext ctx) {
        this.mem.put((byte) (this.mem.get() + 1));
        return null;
    }

    @Override
    public Void visitMinus(BrainfParser.MinusContext ctx) {
        this.mem.put((byte) (this.mem.get() - 1));
        return null;
    }

    @Override
    public Void visitDot(BrainfParser.DotContext ctx) {
        System.out.print((char) this.mem.get());
        return null;
    }

    @Override
    public Void visitComma(BrainfParser.CommaContext ctx) {
        byte b = 0;
        try {
            b = (byte) System.in.read();
        } catch (IOException e) {}

        this.mem.put(b);
        return null;
    }

    @Override
    public Void visitGroup(BrainfParser.GroupContext ctx) {
        while (this.mem.get() != 0) {
            this.visit(ctx.prog());
        }
        return null;
    }
}
