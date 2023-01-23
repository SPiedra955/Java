class Test2 {
    int[] array = new int[]{1,2,3};
    static void increaseFirstInt(int[] anIntArray) {
    anIntArray[0]++;
    }
    static void changeIntArray(int[] anIntArray) {
    anIntArray = new int[] {100,200,300};
    }
    public static void main(String[] args) {
    Test2 t = new Test2();
    System.out.println("First element in array is: "+t.array[0]);
    Test2.increaseFirstInt(t.array);
    System.out.println("First element in array is now: "+t.array[0]);
    Test2.changeIntArray(t.array);
    System.out.println("First element in array is now: "+t.array[0]);
    }
   }