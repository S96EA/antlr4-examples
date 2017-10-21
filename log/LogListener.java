// Generated from /home/neild47/IdeaProjects/JsonParser/src/log/Log.g4 by ANTLR 4.7
package log;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogParser}.
 */
public interface LogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(LogParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(LogParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParser#ip}.
	 * @param ctx the parse tree
	 */
	void enterIp(LogParser.IpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#ip}.
	 * @param ctx the parse tree
	 */
	void exitIp(LogParser.IpContext ctx);
}