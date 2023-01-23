//Method argument passing
class Test1 {
    int[] array = new int[]{1,2,3};
    static void increaseFirstInt(int[] anIntArray) {
    anIntArray[2]++;
    }
    public static void main(String[] args) {
    Test1 t = new Test1();
    System.out.println("Third element in array is: "+t.array[2]);
    Test1.increaseFirstInt(t.array);
    System.out.println("Third element in array is now: "+t.array[2]);
    }
   }