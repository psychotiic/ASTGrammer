/**
 * 
 */
package visitor;

import ast.*;
import util.PLp1Error;

/**
 * @author carr
 *
 */
public interface Visitor<T> {

	public T visit(ArgumentListNode n) throws PLp1Error;
	public T visit(AssignNode n) throws PLp1Error;
	public T visit(BodyNode n) throws PLp1Error;
	public T visit(BooleanNode n) throws PLp1Error;
	public T visit(CallNode n) throws PLp1Error;
	public T visit(ClassNode n) throws PLp1Error;
	public T visit(SwitchCaseNode n) throws PLp1Error;
	public T visit(SwitchNode n) throws PLp1Error;
	public T visit(FunctionDefinitionNode n) throws PLp1Error;
	public T visit(FloatNode n) throws PLp1Error;
	public T visit(LambdaNode n) throws PLp1Error;
	public T visit(IfNode n) throws PLp1Error;
	public T visit(IntegerNode n) throws PLp1Error;
	public T visit(ListNode n) throws PLp1Error;
	public T visit(MethodNode n) throws PLp1Error;
	public T visit(MethodRefNode n) throws PLp1Error;
	public T visit(CreateNode n) throws PLp1Error;
	public T visit(StringNode n) throws PLp1Error;
	public T visit(VarRefNode n) throws PLp1Error;
	public T visit(LetNode n) throws PLp1Error;
	public T visit(AddNode n) throws PLp1Error;
	public T visit(SubNode n) throws PLp1Error;
	public T visit(MultiplyNode n) throws PLp1Error;
	public T visit(DivideNode n) throws PLp1Error;
	public T visit(NotNode n) throws PLp1Error;
	public T visit(OrNode n) throws PLp1Error;
	public T visit(AndNode n) throws PLp1Error;
	public T visit(EqualNode n) throws PLp1Error;
	public T visit(NotEqualNode n) throws PLp1Error;
	public T visit(LessNode n) throws PLp1Error;
	public T visit(LessEqualNode n) throws PLp1Error;
	public T visit(GreaterNode n) throws PLp1Error;
	public T visit(GreaterEqualNode n) throws PLp1Error;
	public T visit(ParenNode n) throws PLp1Error;
	public T visit(ParameterListNode n) throws PLp1Error;
	public T visit(LetDeclNode n) throws PLp1Error;
	public T visit(LetDeclListNode n) throws PLp1Error;
	public T visit(SwitchCaseListNode n) throws PLp1Error;
        public T visit(NullNode n) throws PLp1Error;
        public T visit(ProgramNode n) throws PLp1Error;
        public T visit(InstanceVariableListNode n) throws PLp1Error;
        public T visit(MethodListNode n) throws PLp1Error;
        public T visit(VarDefNode n) throws PLp1Error;
}
