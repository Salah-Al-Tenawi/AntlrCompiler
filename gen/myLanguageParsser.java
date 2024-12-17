// Generated from C:/Users/SALAH/IdeaProjects/compiler/src/myLanguageParsser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class myLanguageParsser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, OPEN_BRAKETS=2, CLOSE_BRAKETS=3, NUMBER=4, SEMICOLEN=5, IMPORT=6, 
		LBRACE=7, ID=8, RBRACE=9, FROM=10, STRING=11, SEMICOLN=12, INTERFACE=13, 
		COLON=14, STRING_TYPE=15, NUMBER_TYPE=16, BOOLEAN_TYPE=17, ANY_TYPE=18;
	public static final int
		RULE_imports = 0, RULE_interface = 1, RULE_interfaceProperty = 2, RULE_type = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"imports", "interface", "interfaceProperty", "type"
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
			"COLON", "STRING_TYPE", "NUMBER_TYPE", "BOOLEAN_TYPE", "ANY_TYPE"
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(8);
			match(IMPORT);
			setState(9);
			match(LBRACE);
			setState(10);
			match(ID);
			setState(11);
			match(RBRACE);
			setState(12);
			match(FROM);
			setState(13);
			match(STRING);
			setState(14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(myLanguageParsser.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(myLanguageParsser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(myLanguageParsser.RBRACE, 0); }
		public List<InterfacePropertyContext> interfaceProperty() {
			return getRuleContexts(InterfacePropertyContext.class);
		}
		public InterfacePropertyContext interfaceProperty(int i) {
			return getRuleContext(InterfacePropertyContext.class,i);
		}
		public InterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceContext interface_() throws RecognitionException {
		InterfaceContext _localctx = new InterfaceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(INTERFACE);
			setState(17);
			match(ID);
			setState(18);
			match(LBRACE);
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				interfaceProperty();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfacePropertyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(myLanguageParsser.ID, 0); }
		public TerminalNode COLON() { return getToken(myLanguageParsser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLN() { return getToken(myLanguageParsser.SEMICOLN, 0); }
		public InterfacePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).enterInterfaceProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLanguageParsserListener ) ((myLanguageParsserListener)listener).exitInterfaceProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLanguageParsserVisitor ) return ((myLanguageParsserVisitor<? extends T>)visitor).visitInterfaceProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacePropertyContext interfaceProperty() throws RecognitionException {
		InterfacePropertyContext _localctx = new InterfacePropertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_interfaceProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(ID);
			setState(27);
			match(COLON);
			setState(28);
			type();
			setState(29);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(myLanguageParsser.STRING_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(myLanguageParsser.NUMBER_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(myLanguageParsser.BOOLEAN_TYPE, 0); }
		public TerminalNode ANY_TYPE() { return getToken(myLanguageParsser.ANY_TYPE, 0); }
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
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012\"\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0015\b\u0001\u000b"+
		"\u0001\f\u0001\u0016\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0000"+
		"\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000\u000f\u0012"+
		"\u001e\u0000\b\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000"+
		"\u0004\u001a\u0001\u0000\u0000\u0000\u0006\u001f\u0001\u0000\u0000\u0000"+
		"\b\t\u0005\u0006\u0000\u0000\t\n\u0005\u0007\u0000\u0000\n\u000b\u0005"+
		"\b\u0000\u0000\u000b\f\u0005\t\u0000\u0000\f\r\u0005\n\u0000\u0000\r\u000e"+
		"\u0005\u000b\u0000\u0000\u000e\u000f\u0005\f\u0000\u0000\u000f\u0001\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0005\r\u0000\u0000\u0011\u0012\u0005\b"+
		"\u0000\u0000\u0012\u0014\u0005\u0007\u0000\u0000\u0013\u0015\u0003\u0004"+
		"\u0002\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000"+
		"\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0005\t\u0000"+
		"\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001b\u0005\b\u0000\u0000"+
		"\u001b\u001c\u0005\u000e\u0000\u0000\u001c\u001d\u0003\u0006\u0003\u0000"+
		"\u001d\u001e\u0005\f\u0000\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u001f"+
		" \u0007\u0000\u0000\u0000 \u0007\u0001\u0000\u0000\u0000\u0001\u0016";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}