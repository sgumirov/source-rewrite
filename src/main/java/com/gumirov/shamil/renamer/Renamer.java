package com.gumirov.shamil.renamer;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Renamer extends EBaseListener {
    TokenStreamRewriter rewriter;

    public Renamer(TokenStream stream) {
        rewriter = new TokenStreamRewriter(stream);
    }

    @Override
    public void exitDef(EParser.DefContext ctx) {
        super.exitDef(ctx);
        rewriter.replace(ctx.constR().start.getTokenIndex(), "function ");
        EParser.TemplateContext templ = ctx.template();
        EParser.PropsContext props = ctx.anondef().props();
        rewriter.insertAfter(ctx.name1().start, "("
                + (props != null ? props.getText()+ ": " : "")
                + (templ != null && props != null? templ.propname().getText() : "")
                +"): JSX.Element");
        ArrayList<ParserRuleContext> todel = new ArrayList<>();
        todel.add(ctx.anondef());
        todel.add(ctx.reacttype());
        if (templ != null) todel.add(ctx.template());
        todel.forEach(d -> rewriter.delete(d.start, d.stop));
    }

    private static void execute(String name) throws IOException {
        InputStream res = Renamer.class.getClassLoader().getResourceAsStream(name);
        if (res == null) {
            System.err.println("Resource not found");
            System.exit(-1);
        }
        CharStream is = CharStreams.fromStream(res);
        ELexer lexer = new ELexer(is);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EParser parser = new EParser(tokens);
        Renamer renamer = new Renamer(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(renamer, parser.file());
        System.out.println(renamer.rewriter.getText());
    }
    public static void main(String[] args) throws IOException {
        execute("params.tsx");
//        execute("no_params.tsx");
//        execute("no_params_short.tsx");
    }
}
