class Cat {
    static String preferredFood = "fish";
    static String getPreferredFood() {
    return preferredFood;
    }
    static void setPreferredFood(String newFood) {
    preferredFood = newFood;
    }

    public static void main(String[] args) {
    System.out.println("A cat's preferred food is: "+Cat.getPreferredFood());
    Cat.setPreferredFood("Choco");
    System.out.println("A cat's preferred food is now: "+Cat.getPreferredFood());   
    }
   }