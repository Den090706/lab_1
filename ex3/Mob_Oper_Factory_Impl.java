package ex3;

// Реалізація фабричного методу для створення MobileOperator
public class Mob_Oper_Factory_Impl implements Mob_Oper_Factory {
    @Override
    public Mobile_Operator createMobileOperator() {
        return new Mobile_Operator();
    }
}
