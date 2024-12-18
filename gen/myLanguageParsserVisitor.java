// Generated from C:/Users/SALAH/IdeaProjects/compiler/src\myLanguageParsser.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link myLanguageParsser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(myLanguageParsser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(myLanguageParsser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#interfaceField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceField(myLanguageParsser.InterfaceFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#componentDeclration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclration(myLanguageParsser.ComponentDeclrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#componentConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentConfig(myLanguageParsser.ComponentConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#configField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigField(myLanguageParsser.ConfigFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#templateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBody(myLanguageParsser.TemplateBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(myLanguageParsser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(myLanguageParsser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#classbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassbody(myLanguageParsser.ClassbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#classmember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassmember(myLanguageParsser.ClassmemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#variableDeclartion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclartion(myLanguageParsser.VariableDeclartionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#functionDeclartion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclartion(myLanguageParsser.FunctionDeclartionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(myLanguageParsser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(myLanguageParsser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(myLanguageParsser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(myLanguageParsser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(myLanguageParsser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(myLanguageParsser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(myLanguageParsser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectMember(myLanguageParsser.ObjectMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(myLanguageParsser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(myLanguageParsser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLanguageParsser#arrayValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(myLanguageParsser.ArrayValueContext ctx);
}