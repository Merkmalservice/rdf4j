/* Generated By:JJTree&JavaCC: Do not edit this line. SyntaxTreeBuilderConstants.java */
package org.eclipse.rdf4j.query.parser.sparql.ast;

/**
 * Token literal values and constants. Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface SyntaxTreeBuilderConstants {

	/** End of File. */
	int EOF = 0;
	/** RegularExpression Id. */
	int WS_CHAR = 1;
	/** RegularExpression Id. */
	int WHITESPACE = 2;
	/** RegularExpression Id. */
	int SINGLE_LINE_COMMENT = 3;
	/** RegularExpression Id. */
	int LPAREN = 4;
	/** RegularExpression Id. */
	int RPAREN = 5;
	/** RegularExpression Id. */
	int LBRACE = 6;
	/** RegularExpression Id. */
	int RBRACE = 7;
	/** RegularExpression Id. */
	int LBRACK = 8;
	/** RegularExpression Id. */
	int RBRACK = 9;
	/** RegularExpression Id. */
	int SEMICOLON = 10;
	/** RegularExpression Id. */
	int COMMA = 11;
	/** RegularExpression Id. */
	int DOT = 12;
	/** RegularExpression Id. */
	int EQ = 13;
	/** RegularExpression Id. */
	int NE = 14;
	/** RegularExpression Id. */
	int GT = 15;
	/** RegularExpression Id. */
	int LT = 16;
	/** RegularExpression Id. */
	int LE = 17;
	/** RegularExpression Id. */
	int GE = 18;
	/** RegularExpression Id. */
	int NOT = 19;
	/** RegularExpression Id. */
	int OR = 20;
	/** RegularExpression Id. */
	int AND = 21;
	/** RegularExpression Id. */
	int PLUS = 22;
	/** RegularExpression Id. */
	int MINUS = 23;
	/** RegularExpression Id. */
	int STAR = 24;
	/** RegularExpression Id. */
	int QUESTION = 25;
	/** RegularExpression Id. */
	int SLASH = 26;
	/** RegularExpression Id. */
	int PIPE = 27;
	/** RegularExpression Id. */
	int INVERSE = 28;
	/** RegularExpression Id. */
	int DT_PREFIX = 29;
	/** RegularExpression Id. */
	int NIL = 30;
	/** RegularExpression Id. */
	int ANON = 31;
	/** RegularExpression Id. */
	int IS_A = 32;
	/** RegularExpression Id. */
	int BASE = 33;
	/** RegularExpression Id. */
	int PREFIX = 34;
	/** RegularExpression Id. */
	int SELECT = 35;
	/** RegularExpression Id. */
	int CONSTRUCT = 36;
	/** RegularExpression Id. */
	int DESCRIBE = 37;
	/** RegularExpression Id. */
	int ASK = 38;
	/** RegularExpression Id. */
	int DISTINCT = 39;
	/** RegularExpression Id. */
	int REDUCED = 40;
	/** RegularExpression Id. */
	int AS = 41;
	/** RegularExpression Id. */
	int FROM = 42;
	/** RegularExpression Id. */
	int NAMED = 43;
	/** RegularExpression Id. */
	int WHERE = 44;
	/** RegularExpression Id. */
	int ORDER = 45;
	/** RegularExpression Id. */
	int GROUP = 46;
	/** RegularExpression Id. */
	int BY = 47;
	/** RegularExpression Id. */
	int ASC = 48;
	/** RegularExpression Id. */
	int DESC = 49;
	/** RegularExpression Id. */
	int LIMIT = 50;
	/** RegularExpression Id. */
	int OFFSET = 51;
	/** RegularExpression Id. */
	int OPTIONAL = 52;
	/** RegularExpression Id. */
	int GRAPH = 53;
	/** RegularExpression Id. */
	int UNION = 54;
	/** RegularExpression Id. */
	int MINUS_SETOPER = 55;
	/** RegularExpression Id. */
	int FILTER = 56;
	/** RegularExpression Id. */
	int HAVING = 57;
	/** RegularExpression Id. */
	int NOT_FUNC = 58;
	/** RegularExpression Id. */
	int EXISTS = 59;
	/** RegularExpression Id. */
	int STR = 60;
	/** RegularExpression Id. */
	int LANG = 61;
	/** RegularExpression Id. */
	int LANGMATCHES = 62;
	/** RegularExpression Id. */
	int DATATYPE = 63;
	/** RegularExpression Id. */
	int BOUND = 64;
	/** RegularExpression Id. */
	int SAMETERM = 65;
	/** RegularExpression Id. */
	int IS_IRI = 66;
	/** RegularExpression Id. */
	int IS_BLANK = 67;
	/** RegularExpression Id. */
	int IS_LITERAL = 68;
	/** RegularExpression Id. */
	int IS_NUMERIC = 69;
	/** RegularExpression Id. */
	int COALESCE = 70;
	/** RegularExpression Id. */
	int BNODE = 71;
	/** RegularExpression Id. */
	int STRDT = 72;
	/** RegularExpression Id. */
	int STRLANG = 73;
	/** RegularExpression Id. */
	int UUID = 74;
	/** RegularExpression Id. */
	int STRUUID = 75;
	/** RegularExpression Id. */
	int IRI = 76;
	/** RegularExpression Id. */
	int IF = 77;
	/** RegularExpression Id. */
	int IN = 78;
	/** RegularExpression Id. */
	int COUNT = 79;
	/** RegularExpression Id. */
	int SUM = 80;
	/** RegularExpression Id. */
	int MIN = 81;
	/** RegularExpression Id. */
	int MAX = 82;
	/** RegularExpression Id. */
	int AVG = 83;
	/** RegularExpression Id. */
	int SAMPLE = 84;
	/** RegularExpression Id. */
	int GROUP_CONCAT = 85;
	/** RegularExpression Id. */
	int SEPARATOR = 86;
	/** RegularExpression Id. */
	int REGEX = 87;
	/** RegularExpression Id. */
	int TRUE = 88;
	/** RegularExpression Id. */
	int FALSE = 89;
	/** RegularExpression Id. */
	int BIND = 90;
	/** RegularExpression Id. */
	int SERVICE = 91;
	/** RegularExpression Id. */
	int BINDINGS = 92;
	/** RegularExpression Id. */
	int VALUES = 93;
	/** RegularExpression Id. */
	int UNDEF = 94;
	/** RegularExpression Id. */
	int STRLEN = 95;
	/** RegularExpression Id. */
	int SUBSTR = 96;
	/** RegularExpression Id. */
	int STR_STARTS = 97;
	/** RegularExpression Id. */
	int STR_ENDS = 98;
	/** RegularExpression Id. */
	int STR_BEFORE = 99;
	/** RegularExpression Id. */
	int STR_AFTER = 100;
	/** RegularExpression Id. */
	int REPLACE = 101;
	/** RegularExpression Id. */
	int UCASE = 102;
	/** RegularExpression Id. */
	int LCASE = 103;
	/** RegularExpression Id. */
	int CONCAT = 104;
	/** RegularExpression Id. */
	int CONTAINS = 105;
	/** RegularExpression Id. */
	int ENCODE_FOR_URI = 106;
	/** RegularExpression Id. */
	int RAND = 107;
	/** RegularExpression Id. */
	int ABS = 108;
	/** RegularExpression Id. */
	int CEIL = 109;
	/** RegularExpression Id. */
	int FLOOR = 110;
	/** RegularExpression Id. */
	int ROUND = 111;
	/** RegularExpression Id. */
	int NOW = 112;
	/** RegularExpression Id. */
	int YEAR = 113;
	/** RegularExpression Id. */
	int MONTH = 114;
	/** RegularExpression Id. */
	int DAY = 115;
	/** RegularExpression Id. */
	int HOURS = 116;
	/** RegularExpression Id. */
	int MINUTES = 117;
	/** RegularExpression Id. */
	int SECONDS = 118;
	/** RegularExpression Id. */
	int TIMEZONE = 119;
	/** RegularExpression Id. */
	int TZ = 120;
	/** RegularExpression Id. */
	int MD5 = 121;
	/** RegularExpression Id. */
	int SHA1 = 122;
	/** RegularExpression Id. */
	int SHA224 = 123;
	/** RegularExpression Id. */
	int SHA256 = 124;
	/** RegularExpression Id. */
	int SHA384 = 125;
	/** RegularExpression Id. */
	int SHA512 = 126;
	/** RegularExpression Id. */
	int LOAD = 127;
	/** RegularExpression Id. */
	int CLEAR = 128;
	/** RegularExpression Id. */
	int DROP = 129;
	/** RegularExpression Id. */
	int ADD = 130;
	/** RegularExpression Id. */
	int MOVE = 131;
	/** RegularExpression Id. */
	int COPY = 132;
	/** RegularExpression Id. */
	int CREATE = 133;
	/** RegularExpression Id. */
	int INSERT = 134;
	/** RegularExpression Id. */
	int DATA = 135;
	/** RegularExpression Id. */
	int DELETE = 136;
	/** RegularExpression Id. */
	int WITH = 137;
	/** RegularExpression Id. */
	int SILENT = 138;
	/** RegularExpression Id. */
	int DEFAULT_GRAPH = 139;
	/** RegularExpression Id. */
	int ALL = 140;
	/** RegularExpression Id. */
	int INTO = 141;
	/** RegularExpression Id. */
	int TO = 142;
	/** RegularExpression Id. */
	int USING = 143;
	/** RegularExpression Id. */
	int Q_IRI_REF = 144;
	/** RegularExpression Id. */
	int PNAME_NS = 145;
	/** RegularExpression Id. */
	int PNAME_LN = 146;
	/** RegularExpression Id. */
	int BLANK_NODE_LABEL = 147;
	/** RegularExpression Id. */
	int VAR1 = 148;
	/** RegularExpression Id. */
	int VAR2 = 149;
	/** RegularExpression Id. */
	int LANGTAG = 150;
	/** RegularExpression Id. */
	int INTEGER = 151;
	/** RegularExpression Id. */
	int INTEGER_POSITIVE = 152;
	/** RegularExpression Id. */
	int INTEGER_NEGATIVE = 153;
	/** RegularExpression Id. */
	int DECIMAL = 154;
	/** RegularExpression Id. */
	int DECIMAL_POSITIVE = 155;
	/** RegularExpression Id. */
	int DECIMAL_NEGATIVE = 156;
	/** RegularExpression Id. */
	int DOUBLE = 157;
	/** RegularExpression Id. */
	int DOUBLE1 = 158;
	/** RegularExpression Id. */
	int DOUBLE2 = 159;
	/** RegularExpression Id. */
	int DOUBLE3 = 160;
	/** RegularExpression Id. */
	int EXPONENT = 161;
	/** RegularExpression Id. */
	int DOUBLE_POSITIVE = 162;
	/** RegularExpression Id. */
	int DOUBLE_NEGATIVE = 163;
	/** RegularExpression Id. */
	int STRING_LITERAL1 = 164;
	/** RegularExpression Id. */
	int STRING_LITERAL2 = 165;
	/** RegularExpression Id. */
	int STRING_LITERAL_LONG1 = 166;
	/** RegularExpression Id. */
	int STRING_LITERAL_LONG2 = 167;
	/** RegularExpression Id. */
	int SAFE_CHAR1 = 168;
	/** RegularExpression Id. */
	int SAFE_CHAR2 = 169;
	/** RegularExpression Id. */
	int SAFE_CHAR_LONG1 = 170;
	/** RegularExpression Id. */
	int SAFE_CHAR_LONG2 = 171;
	/** RegularExpression Id. */
	int ECHAR = 172;
	/** RegularExpression Id. */
	int HEX = 173;
	/** RegularExpression Id. */
	int ALPHA = 174;
	/** RegularExpression Id. */
	int NUM = 175;
	/** RegularExpression Id. */
	int PN_CHARS_BASE = 176;
	/** RegularExpression Id. */
	int PN_CHARS_U = 177;
	/** RegularExpression Id. */
	int VAR_CHAR = 178;
	/** RegularExpression Id. */
	int PN_CHARS = 179;
	/** RegularExpression Id. */
	int PN_PREFIX = 180;
	/** RegularExpression Id. */
	int PN_LOCAL = 181;
	/** RegularExpression Id. */
	int PLX = 182;
	/** RegularExpression Id. */
	int PERCENT = 183;
	/** RegularExpression Id. */
	int PN_LOCAL_ESC = 184;
	/** RegularExpression Id. */
	int VARNAME = 185;
	/** RegularExpression Id. */
	int TRIPLE_OPEN = 186;
	/** RegularExpression Id. */
	int TRIPLE_CLOSE = 187;

	/** Lexical state. */
	int DEFAULT = 0;

	/** Literal token values. */
	String[] tokenImage = {
			"<EOF>",
			"<WS_CHAR>",
			"<WHITESPACE>",
			"<SINGLE_LINE_COMMENT>",
			"\"(\"",
			"\")\"",
			"\"{\"",
			"\"}\"",
			"\"[\"",
			"\"]\"",
			"\";\"",
			"\",\"",
			"\".\"",
			"\"=\"",
			"\"!=\"",
			"\">\"",
			"\"<\"",
			"\"<=\"",
			"\">=\"",
			"\"!\"",
			"\"||\"",
			"\"&&\"",
			"\"+\"",
			"\"-\"",
			"\"*\"",
			"\"?\"",
			"\"/\"",
			"\"|\"",
			"\"^\"",
			"\"^^\"",
			"<NIL>",
			"<ANON>",
			"\"a\"",
			"\"base\"",
			"\"prefix\"",
			"\"select\"",
			"\"construct\"",
			"\"describe\"",
			"\"ask\"",
			"\"distinct\"",
			"\"reduced\"",
			"\"as\"",
			"\"from\"",
			"\"named\"",
			"\"where\"",
			"\"order\"",
			"\"group\"",
			"\"by\"",
			"\"asc\"",
			"\"desc\"",
			"\"limit\"",
			"\"offset\"",
			"\"optional\"",
			"\"graph\"",
			"\"union\"",
			"\"minus\"",
			"\"filter\"",
			"\"having\"",
			"\"not\"",
			"\"exists\"",
			"\"str\"",
			"\"lang\"",
			"\"langmatches\"",
			"\"datatype\"",
			"\"bound\"",
			"\"sameTerm\"",
			"<IS_IRI>",
			"\"isBlank\"",
			"\"isLiteral\"",
			"\"isNumeric\"",
			"\"coalesce\"",
			"\"bnode\"",
			"\"strdt\"",
			"\"strlang\"",
			"\"uuid\"",
			"\"struuid\"",
			"<IRI>",
			"\"if\"",
			"\"in\"",
			"\"count\"",
			"\"sum\"",
			"\"min\"",
			"\"max\"",
			"\"avg\"",
			"\"sample\"",
			"\"group_concat\"",
			"\"separator\"",
			"\"regex\"",
			"\"true\"",
			"\"false\"",
			"\"bind\"",
			"\"service\"",
			"\"bindings\"",
			"\"values\"",
			"\"UNDEF\"",
			"\"strlen\"",
			"\"substr\"",
			"\"strStarts\"",
			"\"strEnds\"",
			"\"strBefore\"",
			"\"strAfter\"",
			"\"replace\"",
			"\"ucase\"",
			"\"lcase\"",
			"\"concat\"",
			"\"contains\"",
			"\"encode_for_URI\"",
			"\"rand\"",
			"\"abs\"",
			"\"ceil\"",
			"\"floor\"",
			"\"round\"",
			"\"now\"",
			"\"year\"",
			"\"month\"",
			"\"day\"",
			"\"hours\"",
			"\"minutes\"",
			"\"seconds\"",
			"\"timezone\"",
			"\"tz\"",
			"\"md5\"",
			"\"sha1\"",
			"\"sha224\"",
			"\"sha256\"",
			"\"sha384\"",
			"\"sha512\"",
			"\"load\"",
			"\"clear\"",
			"\"drop\"",
			"\"add\"",
			"\"move\"",
			"\"copy\"",
			"\"create\"",
			"\"insert\"",
			"\"data\"",
			"\"delete\"",
			"\"with\"",
			"\"silent\"",
			"\"default\"",
			"\"all\"",
			"\"into\"",
			"\"to\"",
			"\"using\"",
			"<Q_IRI_REF>",
			"<PNAME_NS>",
			"<PNAME_LN>",
			"<BLANK_NODE_LABEL>",
			"<VAR1>",
			"<VAR2>",
			"<LANGTAG>",
			"<INTEGER>",
			"<INTEGER_POSITIVE>",
			"<INTEGER_NEGATIVE>",
			"<DECIMAL>",
			"<DECIMAL_POSITIVE>",
			"<DECIMAL_NEGATIVE>",
			"<DOUBLE>",
			"<DOUBLE1>",
			"<DOUBLE2>",
			"<DOUBLE3>",
			"<EXPONENT>",
			"<DOUBLE_POSITIVE>",
			"<DOUBLE_NEGATIVE>",
			"<STRING_LITERAL1>",
			"<STRING_LITERAL2>",
			"<STRING_LITERAL_LONG1>",
			"<STRING_LITERAL_LONG2>",
			"<SAFE_CHAR1>",
			"<SAFE_CHAR2>",
			"<SAFE_CHAR_LONG1>",
			"<SAFE_CHAR_LONG2>",
			"<ECHAR>",
			"<HEX>",
			"<ALPHA>",
			"<NUM>",
			"<PN_CHARS_BASE>",
			"<PN_CHARS_U>",
			"<VAR_CHAR>",
			"<PN_CHARS>",
			"<PN_PREFIX>",
			"<PN_LOCAL>",
			"<PLX>",
			"<PERCENT>",
			"<PN_LOCAL_ESC>",
			"<VARNAME>",
			"\"<<\"",
			"\">>\"",
	};

}
