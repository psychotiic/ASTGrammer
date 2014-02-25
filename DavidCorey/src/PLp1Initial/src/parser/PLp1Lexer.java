// Generated from parser\PLp1.g4 by ANTLR 4.1

package parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLp1Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTNUM=1, FLOATNUM=2, STRING=3, NEWLINE=4, WS=5, CLASS=6, CREATE=7, ENDIF=8, 
		ELSE=9, FALSE=10, FUNCTION=11, IF=12, LAMBDA=13, LET=14, METHOD=15, NULL=16, 
		SWITCH=17, THEN=18, TRUE=19, DEFAULT=20, INIT=21, CASE=22, RB=23, LB=24, 
		COLON=25, RP=26, AND=27, ASSIGN=28, COMMA=29, DIVIDE=30, DOT=31, EQUAL=32, 
		GREATER=33, GREATEREQUAL=34, INVOKE=35, LBK=36, LESS=37, LESSEQUAL=38, 
		LP=39, MINUS=40, MULTIPLY=41, NOT=42, NOTEQUAL=43, OR=44, PLUS=45, RBK=46, 
		ID=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"INTNUM", "FLOATNUM", "STRING", "NEWLINE", "WS", "'class'", "'create'", 
		"'endif'", "'else'", "'false'", "'function'", "'if'", "'lambda'", "'let'", 
		"'method'", "'null'", "'switch'", "'then'", "'true'", "'default'", "'init'", 
		"'case'", "'}'", "'{'", "':'", "')'", "'&'", "'='", "','", "'/'", "'.'", 
		"'=='", "'>'", "'>='", "'->'", "'['", "'<'", "'<='", "'('", "'-'", "'*'", 
		"'!'", "'!='", "'|'", "'+'", "']'", "ID"
	};
	public static final String[] ruleNames = {
		"ALPHA", "DIGIT", "POSITIVE", "INTNUM", "EXPONENT", "FLOATNUM", "STRING", 
		"NEWLINE", "WS", "CLASS", "CREATE", "ENDIF", "ELSE", "FALSE", "FUNCTION", 
		"IF", "LAMBDA", "LET", "METHOD", "NULL", "SWITCH", "THEN", "TRUE", "DEFAULT", 
		"INIT", "CASE", "RB", "LB", "COLON", "RP", "AND", "ASSIGN", "COMMA", "DIVIDE", 
		"DOT", "EQUAL", "GREATER", "GREATEREQUAL", "INVOKE", "LBK", "LESS", "LESSEQUAL", 
		"LP", "MINUS", "MULTIPLY", "NOT", "NOTEQUAL", "OR", "PLUS", "RBK", "ID"
	};


	public PLp1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PLp1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7: NEWLINE_action((RuleContext)_localctx, actionIndex); break;

		case 8: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\61\u0144\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\7\5r\n\5\f\5\16\5u\13\5\3\5\5\5"+
		"x\n\5\3\6\3\6\5\6|\n\6\3\6\6\6\177\n\6\r\6\16\6\u0080\3\7\3\7\3\7\6\7"+
		"\u0086\n\7\r\7\16\7\u0087\3\7\5\7\u008b\n\7\3\b\3\b\7\b\u008f\n\b\f\b"+
		"\16\b\u0092\13\b\3\b\3\b\3\t\5\t\u0097\n\t\3\t\3\t\3\t\3\t\3\n\6\n\u009e"+
		"\n\n\r\n\16\n\u009f\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\64\7\64\u0140\n\64\f\64\16\64\u0143\13\64"+
		"\2\65\3\2\1\5\2\1\7\2\1\t\3\1\13\2\1\r\4\1\17\5\1\21\6\2\23\7\3\25\b\1"+
		"\27\t\1\31\n\1\33\13\1\35\f\1\37\r\1!\16\1#\17\1%\20\1\'\21\1)\22\1+\23"+
		"\1-\24\1/\25\1\61\26\1\63\27\1\65\30\1\67\31\19\32\1;\33\1=\34\1?\35\1"+
		"A\36\1C\37\1E \1G!\1I\"\1K#\1M$\1O%\1Q&\1S\'\1U(\1W)\1Y*\1[+\1],\1_-\1"+
		"a.\1c/\1e\60\1g\61\1\3\2\t\4\2C\\c|\3\2\62;\3\2\63;\4\2GGgg\4\2--//\3"+
		"\2))\4\2\13\13\"\"\u014a\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\3i\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2"+
		"\r\u0082\3\2\2\2\17\u008c\3\2\2\2\21\u0096\3\2\2\2\23\u009d\3\2\2\2\25"+
		"\u00a3\3\2\2\2\27\u00a9\3\2\2\2\31\u00b0\3\2\2\2\33\u00b6\3\2\2\2\35\u00bb"+
		"\3\2\2\2\37\u00c1\3\2\2\2!\u00ca\3\2\2\2#\u00cd\3\2\2\2%\u00d4\3\2\2\2"+
		"\'\u00d8\3\2\2\2)\u00df\3\2\2\2+\u00e4\3\2\2\2-\u00eb\3\2\2\2/\u00f0\3"+
		"\2\2\2\61\u00f5\3\2\2\2\63\u00fd\3\2\2\2\65\u0102\3\2\2\2\67\u0107\3\2"+
		"\2\29\u0109\3\2\2\2;\u010b\3\2\2\2=\u010d\3\2\2\2?\u010f\3\2\2\2A\u0111"+
		"\3\2\2\2C\u0113\3\2\2\2E\u0115\3\2\2\2G\u0117\3\2\2\2I\u0119\3\2\2\2K"+
		"\u011c\3\2\2\2M\u011e\3\2\2\2O\u0121\3\2\2\2Q\u0124\3\2\2\2S\u0126\3\2"+
		"\2\2U\u0128\3\2\2\2W\u012b\3\2\2\2Y\u012d\3\2\2\2[\u012f\3\2\2\2]\u0131"+
		"\3\2\2\2_\u0133\3\2\2\2a\u0136\3\2\2\2c\u0138\3\2\2\2e\u013a\3\2\2\2g"+
		"\u013c\3\2\2\2ij\t\2\2\2j\4\3\2\2\2kl\t\3\2\2l\6\3\2\2\2mn\t\4\2\2n\b"+
		"\3\2\2\2os\5\7\4\2pr\5\5\3\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t"+
		"x\3\2\2\2us\3\2\2\2vx\7\62\2\2wo\3\2\2\2wv\3\2\2\2x\n\3\2\2\2y{\t\5\2"+
		"\2z|\t\6\2\2{z\3\2\2\2{|\3\2\2\2|~\3\2\2\2}\177\5\5\3\2~}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\f\3\2\2\2\u0082"+
		"\u0083\5\t\5\2\u0083\u0085\7\60\2\2\u0084\u0086\5\5\3\2\u0085\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008a\3\2\2\2\u0089\u008b\5\13\6\2\u008a\u0089\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\16\3\2\2\2\u008c\u0090\7)\2\2\u008d\u008f\n\7\2\2\u008e\u008d"+
		"\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7)\2\2\u0094\20\3\2\2\2"+
		"\u0095\u0097\7\17\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\7\f\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\t\2\2\u009b"+
		"\22\3\2\2\2\u009c\u009e\t\b\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2"+
		"\b\n\3\2\u00a2\24\3\2\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7n\2\2\u00a5"+
		"\u00a6\7c\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7u\2\2\u00a8\26\3\2\2\2\u00a9"+
		"\u00aa\7e\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7c\2\2"+
		"\u00ad\u00ae\7v\2\2\u00ae\u00af\7g\2\2\u00af\30\3\2\2\2\u00b0\u00b1\7"+
		"g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5"+
		"\7h\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9"+
		"\7u\2\2\u00b9\u00ba\7g\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd"+
		"\7c\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\36\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"\u00c5\7e\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7q\2\2"+
		"\u00c8\u00c9\7p\2\2\u00c9 \3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7h\2"+
		"\2\u00cc\"\3\2\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7"+
		"o\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7c\2\2\u00d3$"+
		"\3\2\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7v\2\2\u00d7"+
		"&\3\2\2\2\u00d8\u00d9\7o\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7v\2\2\u00db"+
		"\u00dc\7j\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7f\2\2\u00de(\3\2\2\2\u00df"+
		"\u00e0\7p\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7n\2\2"+
		"\u00e3*\3\2\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7y\2\2\u00e6\u00e7\7k\2"+
		"\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7j\2\2\u00ea,\3\2"+
		"\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef.\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3"+
		"\7w\2\2\u00f3\u00f4\7g\2\2\u00f4\60\3\2\2\2\u00f5\u00f6\7f\2\2\u00f6\u00f7"+
		"\7g\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7w\2\2\u00fa"+
		"\u00fb\7n\2\2\u00fb\u00fc\7v\2\2\u00fc\62\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe"+
		"\u00ff\7p\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7v\2\2\u0101\64\3\2\2\2\u0102"+
		"\u0103\7e\2\2\u0103\u0104\7c\2\2\u0104\u0105\7u\2\2\u0105\u0106\7g\2\2"+
		"\u0106\66\3\2\2\2\u0107\u0108\7\177\2\2\u01088\3\2\2\2\u0109\u010a\7}"+
		"\2\2\u010a:\3\2\2\2\u010b\u010c\7<\2\2\u010c<\3\2\2\2\u010d\u010e\7+\2"+
		"\2\u010e>\3\2\2\2\u010f\u0110\7(\2\2\u0110@\3\2\2\2\u0111\u0112\7?\2\2"+
		"\u0112B\3\2\2\2\u0113\u0114\7.\2\2\u0114D\3\2\2\2\u0115\u0116\7\61\2\2"+
		"\u0116F\3\2\2\2\u0117\u0118\7\60\2\2\u0118H\3\2\2\2\u0119\u011a\7?\2\2"+
		"\u011a\u011b\7?\2\2\u011bJ\3\2\2\2\u011c\u011d\7@\2\2\u011dL\3\2\2\2\u011e"+
		"\u011f\7@\2\2\u011f\u0120\7?\2\2\u0120N\3\2\2\2\u0121\u0122\7/\2\2\u0122"+
		"\u0123\7@\2\2\u0123P\3\2\2\2\u0124\u0125\7]\2\2\u0125R\3\2\2\2\u0126\u0127"+
		"\7>\2\2\u0127T\3\2\2\2\u0128\u0129\7>\2\2\u0129\u012a\7?\2\2\u012aV\3"+
		"\2\2\2\u012b\u012c\7*\2\2\u012cX\3\2\2\2\u012d\u012e\7/\2\2\u012eZ\3\2"+
		"\2\2\u012f\u0130\7,\2\2\u0130\\\3\2\2\2\u0131\u0132\7#\2\2\u0132^\3\2"+
		"\2\2\u0133\u0134\7#\2\2\u0134\u0135\7?\2\2\u0135`\3\2\2\2\u0136\u0137"+
		"\7~\2\2\u0137b\3\2\2\2\u0138\u0139\7-\2\2\u0139d\3\2\2\2\u013a\u013b\7"+
		"_\2\2\u013bf\3\2\2\2\u013c\u0141\5\3\2\2\u013d\u0140\5\3\2\2\u013e\u0140"+
		"\5\5\3\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142h\3\2\2\2\u0143\u0141\3\2\2\2"+
		"\16\2sw{\u0080\u0087\u008a\u0090\u0096\u009f\u013f\u0141";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}