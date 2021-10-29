package edu.ayuan.basic.basicknowledge.polymorphism.poly14;



public class JumppingOperator {
    public void useJumpping(IAction j){//IAction j = new Cat()多态的形式 implements
        j.Jumpping();
    }

    public IAction getJumpping(){
        IAction j = new Cat();
        return j;

    }

}
