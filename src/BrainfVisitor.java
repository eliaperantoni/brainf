// Generated from C:/Users/peran/code/brainf/src\Brainf.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BrainfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BrainfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BrainfParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(BrainfParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrainfParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(BrainfParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code great}
	 * labeled alternative in {@link BrainfParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreat(BrainfParser.GreatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code less}
	 * labeled alternative in {@link BrainfParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(BrainfParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link BrainfParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(BrainfParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link BrainfParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(BrainfParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link BrainfParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(BrainfParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comma}
	 * labeled alternative in {@link BrainfParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(BrainfParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code group_lab}
	 * labeled alternative in {@link BrainfParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_lab(BrainfParser.Group_labContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrainfParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(BrainfParser.GroupContext ctx);
}