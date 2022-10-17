package pbosesi4;

class ANIMALS {
   protected void displayInfo() {
      System.out.println("Kamu adalah Hewan");
   }
}

class Dog extends ANIMALS {
   public void displayInfo() {
      System.out.println("Kamu adalah Ikan");
   }
}

class Main {
   public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.displayInfo();
   }
}
