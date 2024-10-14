// ACCESS MODIFIER          WITHIN-CLASS          WITHIN-PACKAGE         OUTSIDE PACKAGE BY SUBCLASS ONLY         OUTSIDE-PACKAGE
/*
 * 1. PRIVATE                  YES                     NO                             NO                                NO
 * 2. DEFAULT                  YES                     YES                            NO                                NO
 * 3. PROTECTED                YES                     YES                            YES                               NO
 * 4. PUBLIC                   YES                     YES                            YES                               YES
 */


public class AccessSpecifiers {
    
    public static void main(String args[]) {   // created Object.
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Pradhum";
        myAcc.setPassword("abcde");  // here password does not access. so create a function  setPassword.

    }
}
  class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
  }