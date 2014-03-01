package ast;

public interface Visitor<T> {

	public T visit(AddNode n) throws PLp1Exception;
	public T visit(SubNode n) throws PLp1Exception;
	public T visit(MultiplyNode n) throws PLp1Exception;
	public T visit(DivideNode n) throws PLp1Exception;
        public T visit(LetNode n) throws PLp1Exception;
        public T visit(AndNode n) throws PLp1Exception;
        public T visit(ArgumentListNode n) throws PLp1Exception;
        public T visit(AssignNode n) throws PLp1Exception;
        public T visit(BodyNode n) throws PLp1Exception;
        public T visit(BooleanNode n) throws PLp1Exception;
        public T visit(CallNode n) throws PLp1Exception;
        public T visit(ClassNode n) throws PLp1Exception;
        public T visit(CreateNode n) throws PLp1Exception;
        public T visit(EqualNode n) throws PLp1Exception;
        public T visit(FloatNode n) throws PLp1Exception;
        public T visit(FunctionDefinitionNode n) throws PLp1Exception;
        public T visit(GreaterEqualNode n) throws PLp1Exception;
        public T visit(GreaterNode n) throws PLp1Exception;
        public T visit(IfNode n) throws PLp1Exception;
        public T visit(InstanceVariableListNode n) throws PLp1Exception;
        public T visit(IntegerNode n) throws PLp1Exception;
        public T visit(LambdaNode n) throws PLp1Exception;
        public T visit(LessEqualNode n) throws PLp1Exception;
        public T visit(LessNode n) throws PLp1Exception;
        public T visit(LetDeclListNode n) throws PLp1Exception;
        public T visit(LetDeclNode n) throws PLp1Exception;
        public T visit(ListNode n) throws PLp1Exception;
        public T visit(MethodListNode n) throws PLp1Exception;
        public T visit(MethodNode n) throws PLp1Exception;
        public T visit(MethodRefNode n) throws PLp1Exception;
        public T visit(NotEqualNode n) throws PLp1Exception;
        public T visit(NotNode n) throws PLp1Exception;
        public T visit(NullNode n) throws PLp1Exception;
        public T visit(OrNode n) throws PLp1Exception;
        public T visit(ParameterListNode n) throws PLp1Exception;
        public T visit(ParenNode n) throws PLp1Exception;
        public T visit(ProgramNode n) throws PLp1Exception;
        public T visit(StringNode n) throws PLp1Exception;
        public T visit(SwitchNode n) throws PLp1Exception;
        public T visit(SwitchCaseListNode n) throws PLp1Exception;
        public T visit(SwitchCaseNode n) throws PLp1Exception;
        public T visit(VarDefNode n) throws PLp1Exception;
        public T visit(VarRefNode n) throws PLp1Exception; 
}
