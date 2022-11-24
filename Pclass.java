class Pclass{
  public void pmethod(){
      System.out.println("This a parent class");
  }
}

class Cclass extends Pclass{
  public void cmethod(){
      System.out.println("This a child class");
  }
}

class Ans{
  public static void main(String[] args){
      Pclass m= new Pclass();
      Cclass n= new Cclass();
      m.pmethod();
      n.cmethod();
      n.pmethod();
  }
}					