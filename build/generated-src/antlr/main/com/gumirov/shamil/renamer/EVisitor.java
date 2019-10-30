// Generated from com/gumirov/shamil/renamer/E.g4 by ANTLR 4.7.1

package com.gumirov.shamil.renamer;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(EParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#interfaces1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaces1(EParser.Interfaces1Context ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#imports1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports1(EParser.Imports1Context ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#what1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhat1(EParser.What1Context ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#wherefrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWherefrom(EParser.WherefromContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#body1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody1(EParser.Body1Context ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(EParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#anondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnondef(EParser.AnondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#props}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProps(EParser.PropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#name1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName1(EParser.Name1Context ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#reacttype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReacttype(EParser.ReacttypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(EParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#propname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropname(EParser.PropnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#constR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstR(EParser.ConstRContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#body2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody2(EParser.Body2Context ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(EParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#block2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock2(EParser.Block2Context ctx);
}