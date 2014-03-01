/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import ast.ASTGenerator;
import ast.ASTNode;
import ast.PLp1Exception;
import ast.SourceVisitor;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.PLp1Lexer;

import parser.PLp1Parser;


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
                        e.printStackTrace();
			//System.out.println("Uncaught Interpreter Exception: "+e);
		}
	    repl();
	}
	
	public static void processCode(ANTLRInputStream code) throws IOException,
                PLp1Exception
	{
            // create a lexer that feeds off of input CharStream
            PLp1Lexer lexer = new PLp1Lexer(code);
            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer
            PLp1Parser parser = new PLp1Parser(tokens);
            ParseTree tree = parser.program();
            
            /*
             * This code below will only work once the AST stuff is implemented!
             * It will throw NullPointerException until fixed.
             * 
             */
            
            ASTNode ast = (ASTNode) tree.accept(new ASTGenerator());
            System.out.println(ast.accept(new SourceVisitor()));

            System.out.println("Success!");
	}
	

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String args []) throws FileNotFoundException, 
                IOException, PLp1Exception
	{
		if (args.length > 0) {
			processCode(new ANTLRFileStream(args[0]));			
		} else {
			repl();
		}
	}
    
}
