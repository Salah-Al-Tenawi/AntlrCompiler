// Generated from C:/Users/SALAH/IdeaProjects/compiler/src\myLanguageParsser.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myLanguageParsser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, OPEN_BRAKETS=2, CLOSE_BRAKETS=3, NUMBER=4, SEMICOLEN=5, IMPORT=6, 
		LBRACE=7, ID=8, RBRACE=9, FROM=10, STRING=11, SEMICOLN=12, INTERFACE=13, 
		COLON=14, AT_SYMBOL=15, COMPONENT=16, LPAREN=17, RPAREN=18, COMMA=19, 
		SELECTOR=20, STANDALONE=21, BOOLEAN=22, IMPORTS=23, TEMPLATE=24, COMA=25, 
		EXPORT=26, CLASS=27, SEMI=28, RLPAREN=29, LBRACKET=30, RBRACKET=31, EQUAL=32, 
		THIS=33, DOT=34, NULL=35, STRING_TYPE=36, NUMBER_TYPE=37, BOOLEAN_TYPE=38, 
		ANY_TYPE=39;
	public static final int
		RULE_imports = 0, RULE_file = 1, RULE_interfaceDeclaration = 2, RULE_interfaceField = 3, 
		RULE_componentDeclration = 4, RULE_componentConfig = 5, RULE_configField = 6, 
		RULE_templateBody = 7, RULE_style = 8, RULE_classDeclaration = 9, RULE_classbody = 10, 
		RULE_classmember = 11, RULE_variableDeclartion = 12, RULE_functionDeclartion = 13, 
		RULE_functionParameters = 14, RULE_functionParameter = 15, RULE_functionBody = 16, 
		RULE_statement = 17, RULE_array = 18, RULE_expression = 19, RULE_assignmentExpression = 20, 
		RULE_objectMember = 21, RULE_literal = 22, RULE_type = 23, RULE_arrayValue = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"imports", "file", "interfaceDeclaration", "interfaceField", "componentDeclration", 
			"componentConfig", "configField", "templateBody", "style", "classDeclaration", 
			"classbody", "classmember", "variableDeclartion", "functionDeclartion", 
			"functionParameters", "functionParameter", "functionBody", "statement", 
			"array", "expression", "assignmentExpression", "objectMember", "literal", 
			"type", "arrayValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'('", "')'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "OPEN_BRAKETS", "CLOSE_BRAKETS", "NUMBER", "SEMICOLEN", 
			"IMPORT", "LBRACE", "ID", "RBRACE", "FROM", "STRING", "SEMICOLN", "INTERFACE", 
			"COLON", "AT_SYMBOL", "COMPONENT", "LPAREN", "RPAREN", "COMMA", "SELECTOR", 
			"STANDALONE", "BOOLEAN", "IMPORTS", "TEMPLATE", "COMA", "EXPORT", "CLASS", 
			"SEMI", "RLPAREN", "LBRACKET", "RBRACKET", "EQUAL", "THIS", "DOT", "NULL", 
			"STRING_TYPE", "NUMBER_TYPE", "BOOLEAN_TYPE", "ANY_TYPE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "myLanguageParsser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myLanguageParsser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(myLanguageParsser.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(myLanguageParsser.LBRACE, 0); }
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public TerminalNode RBRACE() { return getToken(myLanguageParsser.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(myLanguageParsser.FROM, 0); }
		public TerminalNode STRING() { return getToken(myLanguageParsser.STRING, 0); }
		public TerminalNode SEMICOLN() { return getToken(myLanguageParsser.SEMICOLN, 0); }
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_imports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(IMPORT);
			setState(51);
			match(LBRACE);
			setState(52);
			match(ID);
			setState(53);
			match(RBRACE);
			setState(54);
			match(FROM);
			setState(55);
			match(STRING);
			setState(56);
			match(SEMICOLN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileContext extends ParserRuleContext {
		public List<InterfaceDeclarationContext> interfaceDeclaration() {
			return getRuleContexts(InterfaceDeclarationContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration(int i) {
			return getRuleContext(InterfaceDeclarationContext.class,i);
		}
		public List<ComponentDeclrationContext> componentDeclration() {
			return getRuleContexts(ComponentDeclrationContext.class);
		}
		public ComponentDeclrationContext componentDeclration(int i) {
			return getRuleContext(ComponentDeclrationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTERFACE) | (1L << AT_SYMBOL) | (1L << EXPORT))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTERFACE:
					{
					setState(58);
					interfaceDeclaration();
					}
					break;
				case AT_SYMBOL:
					{
					setState(59);
					componentDeclration();
					}
					break;
				case EXPORT:
					{
					setState(60);
					classDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(myLanguageParsser.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(myLanguageParsser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(myLanguageParsser.RBRACE, 0); }
		public List<InterfaceFieldContext> interfaceField() {
			return getRuleContexts(InterfaceFieldContext.class);
		}
		public InterfaceFieldContext interfaceField(int i) {
			return getRuleContext(InterfaceFieldContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(INTERFACE);
			setState(67);
			match(ID);
			setState(68);
			match(LBRACE);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				interfaceField();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(74);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceFieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public TerminalNode COLON() { return getToken(myLanguageParsser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLN() { return getToken(myLanguageParsser.SEMICOLN, 0); }
		public InterfaceFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterInterfaceField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitInterfaceField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitInterfaceField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceFieldContext interfaceField() throws RecognitionException {
		InterfaceFieldContext _localctx = new InterfaceFieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interfaceField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			match(COLON);
			setState(78);
			type();
			setState(79);
			match(SEMICOLN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentDeclrationContext extends ParserRuleContext {
		public TerminalNode AT_SYMBOL() { return getToken(myLanguageParsser.AT_SYMBOL, 0); }
		public TerminalNode COMPONENT() { return getToken(myLanguageParsser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(myLanguageParsser.LPAREN, 0); }
		public ComponentConfigContext componentConfig() {
			return getRuleContext(ComponentConfigContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myLanguageParsser.RPAREN, 0); }
		public ComponentDeclrationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterComponentDeclration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitComponentDeclration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitComponentDeclration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclrationContext componentDeclration() throws RecognitionException {
		ComponentDeclrationContext _localctx = new ComponentDeclrationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_componentDeclration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(AT_SYMBOL);
			setState(82);
			match(COMPONENT);
			setState(83);
			match(LPAREN);
			setState(84);
			componentConfig();
			setState(85);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentConfigContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(myLanguageParsser.LBRACE, 0); }
		public List<ConfigFieldContext> configField() {
			return getRuleContexts(ConfigFieldContext.class);
		}
		public ConfigFieldContext configField(int i) {
			return getRuleContext(ConfigFieldContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(myLanguageParsser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(myLanguageParsser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myLanguageParsser.COMMA, i);
		}
		public ComponentConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterComponentConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitComponentConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitComponentConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentConfigContext componentConfig() throws RecognitionException {
		ComponentConfigContext _localctx = new ComponentConfigContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(LBRACE);
			setState(88);
			configField();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(89);
				match(COMMA);
				setState(90);
				configField();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigFieldContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(myLanguageParsser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(myLanguageParsser.COLON, 0); }
		public TerminalNode STRING() { return getToken(myLanguageParsser.STRING, 0); }
		public TerminalNode STANDALONE() { return getToken(myLanguageParsser.STANDALONE, 0); }
		public TerminalNode BOOLEAN() { return getToken(myLanguageParsser.BOOLEAN, 0); }
		public TerminalNode IMPORTS() { return getToken(myLanguageParsser.IMPORTS, 0); }
		public ArrayValueContext arrayValue() {
			return getRuleContext(ArrayValueContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(myLanguageParsser.TEMPLATE, 0); }
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TerminalNode COMA() { return getToken(myLanguageParsser.COMA, 0); }
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public ConfigFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterConfigField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitConfigField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitConfigField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigFieldContext configField() throws RecognitionException {
		ConfigFieldContext _localctx = new ConfigFieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_configField);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(SELECTOR);
				setState(99);
				match(COLON);
				setState(100);
				match(STRING);
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(STANDALONE);
				setState(102);
				match(COLON);
				setState(103);
				match(BOOLEAN);
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(IMPORTS);
				setState(105);
				match(COLON);
				setState(106);
				arrayValue();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(TEMPLATE);
				setState(108);
				match(COLON);
				setState(109);
				templateBody();
				setState(110);
				match(COMA);
				}
				break;
			case RBRACE:
			case COMMA:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				style();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateBodyContext extends ParserRuleContext {
		public TemplateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterTemplateBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitTemplateBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitTemplateBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBodyContext templateBody() throws RecognitionException {
		TemplateBodyContext _localctx = new TemplateBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_templateBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleContext extends ParserRuleContext {
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(myLanguageParsser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(myLanguageParsser.CLASS, 0); }
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public ClassbodyContext classbody() {
			return getRuleContext(ClassbodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(EXPORT);
			setState(120);
			match(CLASS);
			setState(121);
			match(ID);
			setState(122);
			classbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassbodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(myLanguageParsser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(myLanguageParsser.RBRACE, 0); }
		public List<ClassmemberContext> classmember() {
			return getRuleContexts(ClassmemberContext.class);
		}
		public ClassmemberContext classmember(int i) {
			return getRuleContext(ClassmemberContext.class,i);
		}
		public ClassbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterClassbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitClassbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitClassbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassbodyContext classbody() throws RecognitionException {
		ClassbodyContext _localctx = new ClassbodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(LBRACE);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(125);
				classmember();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassmemberContext extends ParserRuleContext {
		public VariableDeclartionContext variableDeclartion() {
			return getRuleContext(VariableDeclartionContext.class,0);
		}
		public FunctionDeclartionContext functionDeclartion() {
			return getRuleContext(FunctionDeclartionContext.class,0);
		}
		public ClassmemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classmember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterClassmember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitClassmember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitClassmember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassmemberContext classmember() throws RecognitionException {
		ClassmemberContext _localctx = new ClassmemberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classmember);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				variableDeclartion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				functionDeclartion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclartionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public TerminalNode COLON() { return getToken(myLanguageParsser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(myLanguageParsser.SEMI, 0); }
		public VariableDeclartionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclartion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterVariableDeclartion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitVariableDeclartion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitVariableDeclartion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclartionContext variableDeclartion() throws RecognitionException {
		VariableDeclartionContext _localctx = new VariableDeclartionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclartion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ID);
			setState(138);
			match(COLON);
			setState(139);
			type();
			setState(140);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclartionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(myLanguageParsser.LPAREN, 0); }
		public TerminalNode RLPAREN() { return getToken(myLanguageParsser.RLPAREN, 0); }
		public TerminalNode COLON() { return getToken(myLanguageParsser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionDeclartionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclartion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterFunctionDeclartion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitFunctionDeclartion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitFunctionDeclartion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclartionContext functionDeclartion() throws RecognitionException {
		FunctionDeclartionContext _localctx = new FunctionDeclartionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDeclartion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ID);
			setState(143);
			match(LPAREN);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(144);
				functionParameters();
				}
			}

			setState(147);
			match(RLPAREN);
			setState(148);
			match(COLON);
			setState(149);
			type();
			setState(150);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(myLanguageParsser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(myLanguageParsser.COLON, i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			functionParameter();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(153);
				match(COLON);
				setState(154);
				functionParameter();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public TerminalNode COLON() { return getToken(myLanguageParsser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
			setState(161);
			match(COLON);
			setState(162);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(myLanguageParsser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(myLanguageParsser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(LBRACE);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << ID) | (1L << STRING) | (1L << BOOLEAN) | (1L << LBRACKET) | (1L << THIS) | (1L << NULL))) != 0)) {
				{
				{
				setState(165);
				statement();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VariableDeclartionContext variableDeclartion() {
			return getRuleContext(VariableDeclartionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(myLanguageParsser.SEMI, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				variableDeclartion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				expression();
				setState(175);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(myLanguageParsser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(myLanguageParsser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myLanguageParsser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myLanguageParsser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LBRACKET);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << ID) | (1L << STRING) | (1L << BOOLEAN) | (1L << LBRACKET) | (1L << THIS) | (1L << NULL))) != 0)) {
				{
				setState(180);
				expression();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(181);
					match(COMMA);
					setState(182);
					expression();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(190);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(myLanguageParsser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectMemberContext objectMember() {
			return getRuleContext(ObjectMemberContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentExpression);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(ID);
				setState(199);
				match(EQUAL);
				setState(200);
				expression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				objectMember();
				setState(202);
				match(EQUAL);
				setState(203);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectMemberContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(myLanguageParsser.THIS, 0); }
		public TerminalNode DOT() { return getToken(myLanguageParsser.DOT, 0); }
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public ObjectMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterObjectMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitObjectMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitObjectMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectMemberContext objectMember() throws RecognitionException {
		ObjectMemberContext _localctx = new ObjectMemberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_objectMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(THIS);
			setState(208);
			match(DOT);
			setState(209);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(myLanguageParsser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(myLanguageParsser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(myLanguageParsser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(myLanguageParsser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << NULL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(myLanguageParsser.STRING_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(myLanguageParsser.NUMBER_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(myLanguageParsser.BOOLEAN_TYPE, 0); }
		public TerminalNode ANY_TYPE() { return getToken(myLanguageParsser.ANY_TYPE, 0); }
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING_TYPE) | (1L << NUMBER_TYPE) | (1L << BOOLEAN_TYPE) | (1L << ANY_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayValueContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(myLanguageParsser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(myLanguageParsser.RBRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(myLanguageParsser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myLanguageParsser.ID, i);
		}
		public ArrayValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValueContext arrayValue() throws RecognitionException {
		ArrayValueContext _localctx = new ArrayValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(LBRACKET);
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(216);
					match(ID);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(224);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00e3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		">\b\u0001\n\u0001\f\u0001A\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002G\b\u0002\u000b\u0002\f\u0002H\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\\\b\u0005\n\u0005"+
		"\f\u0005_\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006r\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u007f\b\n\n"+
		"\n\f\n\u0082\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u0088"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0092\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u009c\b\u000e\n\u000e\f\u000e\u009f"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00a7\b\u0010\n\u0010\f\u0010\u00aa\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00b2\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00b8\b\u0012\n\u0012\f\u0012\u00bb\t\u0012\u0003\u0012\u00bd\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00c5\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00ce\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u00da\b\u0018\n\u0018"+
		"\f\u0018\u00dd\t\u0018\u0003\u0018\u00df\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0002\u0004"+
		"\u0000\u0004\u0004\u000b\u000b\u0016\u0016##\u0002\u0000\b\b$\'\u00e0"+
		"\u00002\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0004B"+
		"\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\bQ\u0001\u0000"+
		"\u0000\u0000\nW\u0001\u0000\u0000\u0000\fq\u0001\u0000\u0000\u0000\u000e"+
		"s\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012w\u0001"+
		"\u0000\u0000\u0000\u0014|\u0001\u0000\u0000\u0000\u0016\u0087\u0001\u0000"+
		"\u0000\u0000\u0018\u0089\u0001\u0000\u0000\u0000\u001a\u008e\u0001\u0000"+
		"\u0000\u0000\u001c\u0098\u0001\u0000\u0000\u0000\u001e\u00a0\u0001\u0000"+
		"\u0000\u0000 \u00a4\u0001\u0000\u0000\u0000\"\u00b1\u0001\u0000\u0000"+
		"\u0000$\u00b3\u0001\u0000\u0000\u0000&\u00c4\u0001\u0000\u0000\u0000("+
		"\u00cd\u0001\u0000\u0000\u0000*\u00cf\u0001\u0000\u0000\u0000,\u00d3\u0001"+
		"\u0000\u0000\u0000.\u00d5\u0001\u0000\u0000\u00000\u00d7\u0001\u0000\u0000"+
		"\u000023\u0005\u0006\u0000\u000034\u0005\u0007\u0000\u000045\u0005\b\u0000"+
		"\u000056\u0005\t\u0000\u000067\u0005\n\u0000\u000078\u0005\u000b\u0000"+
		"\u000089\u0005\f\u0000\u00009\u0001\u0001\u0000\u0000\u0000:>\u0003\u0004"+
		"\u0002\u0000;>\u0003\b\u0004\u0000<>\u0003\u0012\t\u0000=:\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>A\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@\u0003\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005\r\u0000"+
		"\u0000CD\u0005\b\u0000\u0000DF\u0005\u0007\u0000\u0000EG\u0003\u0006\u0003"+
		"\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005"+
		"\t\u0000\u0000K\u0005\u0001\u0000\u0000\u0000LM\u0005\b\u0000\u0000MN"+
		"\u0005\u000e\u0000\u0000NO\u0003.\u0017\u0000OP\u0005\f\u0000\u0000P\u0007"+
		"\u0001\u0000\u0000\u0000QR\u0005\u000f\u0000\u0000RS\u0005\u0010\u0000"+
		"\u0000ST\u0005\u0011\u0000\u0000TU\u0003\n\u0005\u0000UV\u0005\u0012\u0000"+
		"\u0000V\t\u0001\u0000\u0000\u0000WX\u0005\u0007\u0000\u0000X]\u0003\f"+
		"\u0006\u0000YZ\u0005\u0013\u0000\u0000Z\\\u0003\f\u0006\u0000[Y\u0001"+
		"\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000`a\u0005\t\u0000\u0000a\u000b\u0001\u0000\u0000\u0000bc\u0005\u0014"+
		"\u0000\u0000cd\u0005\u000e\u0000\u0000dr\u0005\u000b\u0000\u0000ef\u0005"+
		"\u0015\u0000\u0000fg\u0005\u000e\u0000\u0000gr\u0005\u0016\u0000\u0000"+
		"hi\u0005\u0017\u0000\u0000ij\u0005\u000e\u0000\u0000jr\u00030\u0018\u0000"+
		"kl\u0005\u0018\u0000\u0000lm\u0005\u000e\u0000\u0000mn\u0003\u000e\u0007"+
		"\u0000no\u0005\u0019\u0000\u0000or\u0001\u0000\u0000\u0000pr\u0003\u0010"+
		"\b\u0000qb\u0001\u0000\u0000\u0000qe\u0001\u0000\u0000\u0000qh\u0001\u0000"+
		"\u0000\u0000qk\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\r\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u000f\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000v\u0011\u0001\u0000\u0000\u0000wx\u0005"+
		"\u001a\u0000\u0000xy\u0005\u001b\u0000\u0000yz\u0005\b\u0000\u0000z{\u0003"+
		"\u0014\n\u0000{\u0013\u0001\u0000\u0000\u0000|\u0080\u0005\u0007\u0000"+
		"\u0000}\u007f\u0003\u0016\u000b\u0000~}\u0001\u0000\u0000\u0000\u007f"+
		"\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005\t\u0000\u0000\u0084\u0015\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0003\u0018\f\u0000\u0086\u0088\u0003\u001a"+
		"\r\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0017\u0001\u0000\u0000\u0000\u0089\u008a\u0005\b\u0000\u0000"+
		"\u008a\u008b\u0005\u000e\u0000\u0000\u008b\u008c\u0003.\u0017\u0000\u008c"+
		"\u008d\u0005\u001c\u0000\u0000\u008d\u0019\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005\b\u0000\u0000\u008f\u0091\u0005\u0011\u0000\u0000\u0090\u0092"+
		"\u0003\u001c\u000e\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005\u001d\u0000\u0000\u0094\u0095\u0005\u000e\u0000\u0000\u0095\u0096"+
		"\u0003.\u0017\u0000\u0096\u0097\u0003 \u0010\u0000\u0097\u001b\u0001\u0000"+
		"\u0000\u0000\u0098\u009d\u0003\u001e\u000f\u0000\u0099\u009a\u0005\u000e"+
		"\u0000\u0000\u009a\u009c\u0003\u001e\u000f\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u001d\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\b\u0000"+
		"\u0000\u00a1\u00a2\u0005\u000e\u0000\u0000\u00a2\u00a3\u0003.\u0017\u0000"+
		"\u00a3\u001f\u0001\u0000\u0000\u0000\u00a4\u00a8\u0005\u0007\u0000\u0000"+
		"\u00a5\u00a7\u0003\"\u0011\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\t\u0000\u0000\u00ac!"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b2\u0003\u0018\f\u0000\u00ae\u00af\u0003"+
		"&\u0013\u0000\u00af\u00b0\u0005\u001c\u0000\u0000\u00b0\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b2#\u0001\u0000\u0000\u0000\u00b3\u00bc\u0005\u001e\u0000"+
		"\u0000\u00b4\u00b9\u0003&\u0013\u0000\u00b5\u00b6\u0005\u0013\u0000\u0000"+
		"\u00b6\u00b8\u0003&\u0013\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8"+
		"\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005\u001f\u0000\u0000\u00bf%\u0001\u0000\u0000\u0000\u00c0\u00c5"+
		"\u0003,\u0016\u0000\u00c1\u00c5\u0005\b\u0000\u0000\u00c2\u00c5\u0003"+
		"$\u0012\u0000\u00c3\u00c5\u0003(\u0014\u0000\u00c4\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\'\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0005\b\u0000\u0000\u00c7\u00c8\u0005 \u0000\u0000\u00c8"+
		"\u00ce\u0003&\u0013\u0000\u00c9\u00ca\u0003*\u0015\u0000\u00ca\u00cb\u0005"+
		" \u0000\u0000\u00cb\u00cc\u0003&\u0013\u0000\u00cc\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000"+
		"\u0000\u00ce)\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005!\u0000\u0000\u00d0"+
		"\u00d1\u0005\"\u0000\u0000\u00d1\u00d2\u0005\b\u0000\u0000\u00d2+\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0007\u0000\u0000\u0000\u00d4-\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0007\u0001\u0000\u0000\u00d6/\u0001\u0000\u0000"+
		"\u0000\u00d7\u00de\u0005\u001e\u0000\u0000\u00d8\u00da\u0005\b\u0000\u0000"+
		"\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000"+
		"\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000"+
		"\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000"+
		"\u00de\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u001f\u0000\u0000"+
		"\u00e11\u0001\u0000\u0000\u0000\u0011=?H]q\u0080\u0087\u0091\u009d\u00a8"+
		"\u00b1\u00b9\u00bc\u00c4\u00cd\u00db\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}