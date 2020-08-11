package day39_CustomClass;

public class BankAccountObject {

    public static void main(String[] args) {

      BankAccount bankAccount1 = new BankAccount();
      bankAccount1.setInfo("Mahfooz Parwani",1333445,100);

      bankAccount1.showBalance();


      bankAccount1.deposit(45);
      bankAccount1.showBalance();
   bankAccount1.withdraw(200);
  bankAccount1.withdraw(100);
  bankAccount1.deposit(300.0);

  bankAccount1.withdraw(200.0);



    }





}
