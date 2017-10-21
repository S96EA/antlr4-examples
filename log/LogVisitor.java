// Generated from /home/neild47/IdeaProjects/JsonParser/src/log/Log.g4 by ANTLR 4.7
package log;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(LogParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogParser#ip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp(LogParser.IpContext ctx);
}