// Generated from C:/Users/SALAH/IdeaProjects/compiler/src/myLanguageParsser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link myLanguageParsser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface myLanguageParsserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(myLanguageParsser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface(myLanguageParsser.InterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#interfaceProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceProperty(myLanguageParsser.InterfacePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(myLanguageParsser.TypeContext ctx);
}