package smpl.syntax;

import smpl.semantics.Visitor;
import smpl.sys.SmplException;

public class ExpCdr extends Exp{

  Exp exp;

  public ExpCdr(Exp e){
    exp = e;
  }

  public Exp getExp(){
    return exp;
  }


  @Override
  public <S, T> T visit(Visitor<S, T> v, S arg) throws SmplException{
    return v.visitExpCdr(this, arg);
  }

  @Override
  public String toString(){
    return exp.toString();
  }
}

