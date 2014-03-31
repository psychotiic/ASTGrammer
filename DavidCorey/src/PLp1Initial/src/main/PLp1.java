/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import ast.ASTNode;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import parser.PLp1Lexer;

import parser.PLp1Parser;

import org.antlr.v4.runtime.tree.ParseTree;
import util.Environment;
import util.PLp1Error;
import visitor.ASTGenerator;
import visitor.EvalVisitor;
import visitor.SourceVisitor;


/**
 *
 * @author carr
 */
public class PLp1 {
	private static String getUserInput() throws IOException {
		String curLine = ""; // Line read from standard in
		
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);

		curLine = in.readLine();
		
		return curLine;
	}
	
	private static void repl()
	{
	    System.out.print( "====> ");
	    try {
			processCode(new ANTLRInputStream(getUserInput()));
		} catch (IOException e) {
			System.out.println("Error reading input");
		} catch (Error e) {
			System.out.println("Uncaught Interpreter Error: "+e);
		} catch (Exception e) {
			System.out.println("Uncaught Interpreter Exception: "+e);
		}
	    repl();
	}
	
	public static void processCode(ANTLRInputStream code) throws IOException
	{
            // create a lexer that feeds off of input CharStream
            PLp1Lexer lexer = new PLp1Lexer(code);
            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer
            PLp1Parser parser = new PLp1Parser(tokens);
            ParseTree t = parser.program();
            
            ASTNode ast = (ASTNode)t.accept(new ASTGenerator());
            
            try {
                //System.out.println(ast.accept(new SourceVisitor()));
                System.out.println(ast.accept(new EvalVisitor(new Environment())));
            } catch (PLp1Error ex) {
                System.err.println(ex.getMessage());
            }
	}
	

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String args []) throws FileNotFoundException, IOException
	{
		if (args.length > 0) {
			processCode(new ANTLRFileStream(args[0]));			
		} else {
			repl();
		}
	}
    
}
