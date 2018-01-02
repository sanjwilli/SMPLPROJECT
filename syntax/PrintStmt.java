public class StmtPrintLn extends Exp{

    Exp exp;

    public StmtPrint(){
    }

    public StmtPrint(Exp exp){
        this.exp = exp;
    }

    public Exp getExp(){
        return exp;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S arg) throws SMPLException{
        return v.visitPrintStmt(this, arg);
    }

    @Override
    public String toString(){
        return "print: " + Exp.toString();
    }
}
