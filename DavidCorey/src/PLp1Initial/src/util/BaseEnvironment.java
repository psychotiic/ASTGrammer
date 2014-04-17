/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import util.ValueFactory.ValueType;

/**
 *
 * @author carr
 */
public class BaseEnvironment extends Environment {

    private static ValueFactory factory = new ValueFactory();
    /**
     *
     */
    private static final long serialVersionUID = -3135942080438916540L;

    static class First extends BuiltinFunction {

        @Override
        public Value invoke(Environment env, List<Value> args)
                throws PLp1Error {
            Value op = args.get(0);

            if (op instanceof ListValue) {
                try {
                    return ((ListValue) op).first();
                } catch (IndexOutOfBoundsException e) {
                    throw new PLp1Error("Applied first to null list");
                }
            } else {
                throw new PLp1Error("Applied first to non-list");
            }
        }

        @Override
        public Value addValue(Object val) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    static class Rest extends BuiltinFunction {

        @Override
        public Value invoke(Environment env, List<Value> args)
                throws PLp1Error {
            Value op = args.get(0);

            if (op instanceof ListValue) {
                try {
                    return ((ListValue) op).rest();
                } catch (IndexOutOfBoundsException e) {
                    throw new PLp1Error("Applied rest to null list");
                }
            } else {
                throw new PLp1Error("Applied rest to non-list");
            }
        }

        @Override
        public Value addValue(Object val) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    static class Insert extends BuiltinFunction {

        @Override
        public Value invoke(Environment env, List<Value> args)
                throws PLp1Error {
            Value op1 = args.get(0);
            Value op2 = args.get(1);

            if (op2 instanceof ListValue) {
                return ((ListValue) op2).insert(op1);
            } else {
                throw new PLp1Error("Applied insert to non-list");
            }
        }

        @Override
        public Value addValue(Object val) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    static class PLp1List extends BuiltinFunction {

        @Override
        public Value invoke(Environment env, List<Value> args)
                throws PLp1Error {
            return factory.makeValue(ValueType.LIST).addValue(args);
        }

        @Override
        public Value addValue(Object val) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    static class IsEmpty extends BuiltinFunction {

        @Override
        public Value invoke(Environment env, List<Value> args)
                throws PLp1Error {
            Value op = args.get(0);

            if (op instanceof ListValue) {
                return factory.makeValue(ValueType.BOOL).addValue(((ListValue) op).length() == 0);
            } else {
                throw new PLp1Error("Applied empty? to non-list");
            }
        }

        @Override
        public Value addValue(Object val) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    static class IsPair extends BuiltinFunction {

        @Override
        public Value invoke(Environment env, List<Value> args)
                throws PLp1Error {
            Value op = args.get(0);

            if (op instanceof ListValue) {
                return factory.makeValue(ValueType.BOOL).addValue(((ListValue) op).length() >= 0);
            } else {
                throw new PLp1Error("Applied pair? to non-list");
            }
        }

        @Override
        public Value addValue(Object val) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    static class IsList extends BuiltinFunction {

        @Override
        public Value invoke(Environment env, List<Value> args)
                throws PLp1Error {
            Value op = args.get(0);

            return factory.makeValue(ValueType.BOOL).addValue(op instanceof ListValue);
        }

        @Override
        public Value addValue(Object val) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    static class IsEqual extends BuiltinFunction {

        @Override
        public Value invoke(Environment env, List<Value> args)
                throws PLp1Error {
            Value lop = args.get(0);
            Value rop = args.get(1);
            
            if (lop instanceof ListValue && rop instanceof ListValue)
                return factory.makeValue(ValueType.BOOL).addValue(lop.equal(rop));
            else
                throw new PLp1Error("equalp applied to non-list");
        }

        @Override
        public Value addValue(Object val) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    static class Length extends BuiltinFunction {

        @Override
        public Value invoke(Environment env, List<Value> args)
                throws PLp1Error {
            Value op = args.get(0);

            if (op instanceof ListValue) {
                return factory.makeValue(ValueType.INT).addValue(((ListValue) op).length());
            } else {
                throw new PLp1Error("Applied length to non-list");
            }
        }

        @Override
        public Value addValue(Object val) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    static class IsNumber extends BuiltinFunction {

        @Override
        public Value invoke(Environment env, List<Value> args)
                throws PLp1Error {
            Value op = args.get(0);

            return factory.makeValue(ValueType.BOOL).addValue(op instanceof IntValue || op instanceof FloatValue);
        }

        @Override
        public Value addValue(Object val) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    static class Exit extends BuiltinFunction {

        @Override
        public Value invoke(Environment env, List<Value> args)
                throws PLp1Error {
            System.out.println("Exit.");
            System.exit(0);
            return null;
        }

        @Override
        public Value addValue(Object val) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public BaseEnvironment() {

        super(new ArrayList<String>(), new ArrayList<Value>(), null);

        ArrayList<String> baseVars = new ArrayList<String>();
        ArrayList<Value> baseVals = new ArrayList<Value>();

        baseVars.add("first");
        baseVals.add(new First());
        baseVars.add("rest");
        baseVals.add(new Rest());
        baseVars.add("insert");
        baseVals.add(new Insert());
        baseVars.add("list");
        baseVals.add(new PLp1List());
        baseVars.add("emptyp");
        baseVals.add(new IsEmpty());
        baseVars.add("pairp");
        baseVals.add(new IsPair());
        baseVars.add("listp");
        baseVals.add(new IsList());
        baseVars.add("equalp");
        baseVals.add(new IsEqual());
        baseVars.add("length");
        baseVals.add(new Length());

        baseVars.add("numberp");
        baseVals.add(new IsNumber());
        baseVars.add("exit");
        baseVals.add(new Exit());
        baseVars.add("quit");
        baseVals.add(new Exit());

        
        baseVars.add("true");
        baseVals.add(factory.makeValue(ValueFactory.ValueType.BOOL).addValue(true));
        baseVars.add("false");
        baseVals.add(factory.makeValue(ValueFactory.ValueType.BOOL).addValue(false));
        baseVars.add("nil");
        baseVals.add(factory.makeValue(ValueFactory.ValueType.NULL));


        addToMap(baseVars, baseVals);

    }
}
