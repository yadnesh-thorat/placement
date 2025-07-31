//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello World");
//
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        System.out.println("Hello World");
//
//        System.out.println("Hello World");
//    }
//}

import java.util.Scanner;

//class Main {
//    static String atmCardNumber = "";
//    static int atmPin = -1;
//    static double balance = 0.0;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("\n==== ATM MENU ====");
//            System.out.println("1. Generate new ATM card");
//            System.out.println("2. Generate ATM Pin");
//            System.out.println("3. Check Balance");
//            System.out.println("4. Deposit Amount");
//            System.out.println("5. Withdraw Amount");
//            System.out.println("6. Exit");
//            System.out.print("Enter your choice: ");
//            int option = sc.nextInt();
//
//            switch (option) {
//                case 1 -> generateCard();
//                case 2 -> generatePin(sc);
//                case 3 -> checkBalance();
//                case 4 -> deposit(sc);
//                case 5 -> withdraw(sc);
//                case 6 -> {
//                    System.out.println("Thank you for using the ATM!");
//                    return;
//                }
//                default -> System.out.println("Invalid option! Please try again.");
//            }
//        }
//    }
//
//    static void generateCard() {
//        atmCardNumber = "1234 5678 9012";
//        System.out.println("Your ATM card number: " + atmCardNumber);
//    }
//
//    static void generatePin(Scanner sc) {
//        if (atmCardNumber.isEmpty()) {
//            System.out.println("Please generate an ATM card first.");
//            return;
//        }
//        System.out.print("Enter a 4-digit PIN: ");
//        atmPin = sc.nextInt();
//        System.out.println("ATM PIN generated successfully.");
//    }
//
//    static void checkBalance() {
//        if (atmPin == -1) {
//            System.out.println("Please generate a PIN first.");
//        } else {
//            System.out.println("Your current balance is: INR " + balance);
//        }
//    }
//
//    static void deposit(Scanner sc) {
//        if (atmPin == -1) {
//            System.out.println("Please generate a PIN first.");
//            return;
//        }
//        System.out.print("Enter deposit amount: ");
//        double amount = sc.nextDouble();
//        balance += amount;
//        System.out.println("Amount deposited successfully.");
//    }
//
//    static void withdraw(Scanner sc) {
//        if (atmPin == -1) {
//            System.out.println("Please generate a PIN first.");
//            return;
//        }
//        System.out.print("Enter withdrawal amount: ");
//        double amount = sc.nextDouble();
//        if (amount > balance) {
//            System.out.println("Insufficient balance.");
//        } else {
//            balance -= amount;
//            System.out.println("Withdrawal successful.");
//        }
//    }
//}


// public class Main {
//    public static void main(String[] args)
//
//    {
//        Scanner sc = new Scanner(System.in);
//        int[] arr={10,20,30,40,50,60};
//        int n=arr.length;
//
//
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]+" ");
//        }
//
//
//    }
//}


//
//class Student {
//    String name;
//    int age;   // ✅ 'itn' → 'int'
//
//    // ✅ Constructor must be outside any other method
//    Student(String n, int a) {
//        name = n;
//        age = a;
//    }
//
//    // ✅ Method should not be inside constructor
//    void display() {
//        System.out.println("Name: " + name + "  Age: " + age);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Student s1 = new Student("Aman", 18);
//        s1.display();  // ✅ Missing semicolon fixed
//    }
//}

//class BankAccount {
//    // pvt data member
//
//    private String accountHolder;
//    private double balance;
//
//    //constructor
//    public BankAccount(String accountHolder, double balance) {
//        this.accountHolder = accountHolder;
//        this.balance = balance;
//
//
//
//    }
//
//    // Getter Method =Read Data from Private Member
//
//    public double getBalance() {
//        return balance;
//    }
//
//    // Setter Method (update data with condition)
//    public void deposit(double amount) {
//        if (amount > 0) {
//
//            balance += amount;
//            System.out.println("Deposited $" + amount);
//        }
//        else{
//            System.out.println("Insufficient Balance");
//        }
//
//    }
//
//    public void withdraw(double amount) {
//        if (amount <= balance && amount > 0) {
//            balance -= amount;
////            System.out.println("Withdrew $" + amount);
////        } else {
////            System.out.println("Insufficient Balance");
////        }
////    }
////
////}
////public class Main{
////    public static void main(String[] args) {
////        BankAccount acc = new BankAccount("Aman", 1000);
////        acc.deposit(500);
////        acc.withdraw(200);
////        System.out.println("Balance"+acc.getBalance());
////
////
////    }
////}


//public class Main {
//    public static void main(String[] args) {
//        // Example of String
//        String s="Hello";
//        s.concat("World");
//        System.out.println(s);
//
//        // Example of StringBuilder
//        StringBuilder sb=new StringBuilder("Hello");
//        sb.append(" World");
//        System.out.println(sb);
//
//        //Example of StringBuffer=safe in Threaded format in synchronized
//
//        StringBuffer sb2=new StringBuffer("Hello");
//        sb2.append(" World");
//        System.out.println(sb2);
//
//
//
//
//    }
//}

//class Parent {
//    String name = "My Parent  Class";
//}
//
//class Child extends Parent {
//    String name = "Child Class";
//
//    void display() {
//        System.out.println("Child Name: " + name);
//        System.out.println("Parent Name: " + super.name); // Accessing parent variable
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//        Child obj = new Child();
//        obj.display();
//
//    }
//}


// Interface in  Java is used to achieve multiple Inheritance
//interface A{
//    void methodA();
//}
//interface B{
//    void methodB();
//}
//class C implements A,B{
//    public void methodA(){
//        System.out.println("methodA");
//    }
//    public void methodB(){
//        System.out.println("methodB");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        C obj = new C();
//        obj.methodA();
//        obj.methodB();
//    }
//}

// Inheritance in Java

//class A{
//    void show(){
//        System.out.println("Hello World");
//    }
//}
//class B extends A{
//    void display(){
//        System.out.println("Ram Ram");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        B obj=new B();
//        obj.show();
//        obj.display();
//
//
//    }
//}

// Switchcase in Java

//class Main {
//public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//          System.out.println("Enter the Choice");
//          int num = sc.nextInt();
//          switch (num) {
//            case 1: System.out.println("Enter 1st number"); break;
//            case 2: System.out.println("Enter 2nd number"); break;
//            case 3: System.out.println("Enter 3rd number"); break;
//            case 4: System.out.println("Enter 4th number"); break;
//            case 5: System.out.println("Enter 5th number"); break;
//            case 6: System.out.println("Enter 6th number"); break;
//            case 7: System.out.println("Enter 7th number"); break;
//            case 8: System.out.println("Enter 8th number"); break;
//            case 9: System.out.println("Enter 9th number"); break;
//            case 10: System.out.println("Enter 10th number"); break;
//            default: System.out.println("Number not found");
//        }
//    }
//}

// Threading in Java -Program is divided into two or more subprogram which divide the task

// Threads are implemented inthe form oof object that contain a  method called run()

// Example of Creating threads using thread class

//class A extends Thread {
//
//    public void run() {
//
//        for(int i = 1; i <= 5; i++) {
//            System.out.println("Threads A ="+i);
//        }
//        System.out.println("Exit From A");
//
//    }
//}
//
//class B extends Thread {
//
//    public void run() {
//
//        for(int j = 0; j <=5; j++) {
//            System.out.println("Threads B ="+j);
//
//        }
//        System.out.println("Exit From B");
//    }
//}
//class Main{
//    public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
//        a.start();
//        b.start();
//    }
//}

// Synchronization in Java

// When A method on threading performing read operation in any file and another method B write operation in same file then problem may arise
// When we declared a method with keyword #synchronized java creates a  monitor and hands it to a thread that calls the method first time.it is temporialy locked if method is complete then it is handover to another thread





// Java Program to find the maximum value in an integer array using a for each loop

//class Main{
//    public static void main(String[] args){
//        int[] arr={100,98,96,45,10};
//        int max=findMax(arr);
//        System.out.println(max);
//    }
//
//    public static int findMax(int[] arr) {
//        if(arr==null || arr.length==0){
//            throw new IllegalArgumentException();
//        }
//        int max=arr[0];
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//
//
//            }
//        }
//        return max;
//
//    }
//}

//class Main{
//    public  static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = sc.nextInt();
//        for(int i=0; i<10; i++){
//            System.out.println((i+1)*n);
//        }
//    }
//}

//class Main{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the Number ");
//       int num = input.nextInt();
//       if(num %2==0){
//           System.out.println("The number is Even "+num);
//
//       }
//       else{
//           System.out.println("The number is Odd "+num);
//       }
//    }
//}

//class Main{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number upto you find the sum ");
//        int number = input.nextInt();
//        int sum=0;
//        for(int i=1;i<=number;i++){
//            sum+=(i);
////            return sum;
//            System.out.println(sum);
//        }
//    }
//}


//class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a Number you Want to Reverse it ");
//        int num=sc.nextInt();
//        int rev=0;
//        while(num>0){
//            rev=rev*10+num%10;
//            num=num/10;
//
////            System.out.println(rev);
//
//        }
//        System.out.println(rev);
//
//
//
//    }
//}



class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number you Want to Reverse it ");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;

//            System.out.println(rev);

        }
        System.out.println(rev);



    }
}


//class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a Number you Want to Reverse it ");
//        int num=sc.nextInt();
//        int rev=0;
//        while(num>0){
//            rev=rev*10+num%10;
//            num=num/10;
//
////            System.out.println(rev);
//
//        }
//        System.out.println(rev);
//
//
//
//    }
//







