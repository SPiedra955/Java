//Passing arguments
 
class Test {
    int a = 4;
    static void increaseInt(int anInt) {
    anInt++;
    }
    public static void main(String[] args) {
    Test t = new Test();
    System.out.println("Instance var a is: "+t.a);
    Test.increaseInt(t.a);
    System.out.println("Instance var a is now: "+t.a);
    }
   }