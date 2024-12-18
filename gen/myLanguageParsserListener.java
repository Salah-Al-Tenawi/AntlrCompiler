// Generated from C:/Users/SALAH/IdeaProjects/compiler/src\myLanguageParsser.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link myLanguageParsser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(myLanguageParsser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(myLanguageParsser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(myLanguageParsser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(myLanguageParsser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#interfaceField}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceField(myLanguageParsser.InterfaceFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#interfaceField}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceField(myLanguageParsser.InterfaceFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#componentDeclration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclration(myLanguageParsser.ComponentDeclrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#componentDeclration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclration(myLanguageParsser.ComponentDeclrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void enterComponentConfig(myLanguageParsser.ComponentConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void exitComponentConfig(myLanguageParsser.ComponentConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#configField}.
	 * @param ctx the parse tree
	 */
	void enterConfigField(myLanguageParsser.ConfigFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#configField}.
	 * @param ctx the parse tree
	 */
	void exitConfigField(myLanguageParsser.ConfigFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#templateBody}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBody(myLanguageParsser.TemplateBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#templateBody}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBody(myLanguageParsser.TemplateBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(myLanguageParsser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(myLanguageParsser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(myLanguageParsser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(myLanguageParsser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#classbody}.
	 * @param ctx the parse tree
	 */
	void enterClassbody(myLanguageParsser.ClassbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#classbody}.
	 * @param ctx the parse tree
	 */
	void exitClassbody(myLanguageParsser.ClassbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#classmember}.
	 * @param ctx the parse tree
	 */
	void enterClassmember(myLanguageParsser.ClassmemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#classmember}.
	 * @param ctx the parse tree
	 */
	void exitClassmember(myLanguageParsser.ClassmemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#variableDeclartion}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclartion(myLanguageParsser.VariableDeclartionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#variableDeclartion}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclartion(myLanguageParsser.VariableDeclartionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#functionDeclartion}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclartion(myLanguageParsser.FunctionDeclartionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#functionDeclartion}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclartion(myLanguageParsser.FunctionDeclartionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(myLanguageParsser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(myLanguageParsser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(myLanguageParsser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(myLanguageParsser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(myLanguageParsser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(myLanguageParsser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(myLanguageParsser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(myLanguageParsser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(myLanguageParsser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(myLanguageParsser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(myLanguageParsser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(myLanguageParsser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(myLanguageParsser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(myLanguageParsser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#objectMember}.
	 * @param ctx the parse tree
	 */
	void enterObjectMember(myLanguageParsser.ObjectMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#objectMember}.
	 * @param ctx the parse tree
	 */
	void exitObjectMember(myLanguageParsser.ObjectMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(myLanguageParsser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(myLanguageParsser.LiteralContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link myLanguageParsser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(myLanguageParsser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLanguageParsser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(myLanguageParsser.ArrayValueContext ctx);
}