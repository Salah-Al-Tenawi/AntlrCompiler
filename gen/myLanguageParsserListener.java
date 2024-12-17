// Generated from C:/Users/SALAH/IdeaProjects/compiler/src/myLanguageParsser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myLanguageParsser}.
 */
public interface myLanguageParsserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(myLanguageParsser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(myLanguageParsser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#interface}.
	 * @param ctx the parse tree
	 */
	void enterInterface(myLanguageParsser.InterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#interface}.
	 * @param ctx the parse tree
	 */
	void exitInterface(myLanguageParsser.InterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#interfaceProperty}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceProperty(myLanguageParsser.InterfacePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#interfaceProperty}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceProperty(myLanguageParsser.InterfacePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(myLanguageParsser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(myLanguageParsser.TypeContext ctx);
}