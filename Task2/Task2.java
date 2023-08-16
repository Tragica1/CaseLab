public static void Swap(int a, int b) {
    System.out.println("Before: a = " + a + ", b = " + b);
    System.out.println("--------------------");
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("After: a = " + a + ", b = " + b);
}
