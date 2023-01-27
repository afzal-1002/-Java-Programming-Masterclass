import org.junit.*;

import static org.junit.Assert.*;

public class CH_BankAccountTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After this Class method AfterClass");
    }

    @After
    public void afterTestMethod(){
        System.out.println("After Each Test Method! ");
    }
    private CH_BankAccount account;
    @Before
    public void accountNumber(){
         account = new CH_BankAccount("Muhammad" , "Afzal" , 1000.00);
        System.out.println("Before Each Test Method! ");
    }


    @Test
    public void deposit() {

        double balance = account.deposit(200,true);
        assertEquals(1200.00,balance,0);
    }

    @Test
    public void withdraw() {
        double balance = account.withdraw(100,true);
        assertEquals(900, balance, 0);
    }

    @Test
    public void getBalance_deposit() {

        account.deposit(200,true);
        assertEquals(1200.00,account.getBalance(),0);
    }

    @Test
    public void getBalance_withdraw() {
        account.withdraw(200,true);
        assertEquals(800.00,account.getBalance(),0);
    }


}