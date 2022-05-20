import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class atmachineTest {
    @Test
    public void test1(){
        atmachine a = new atmachine();
        a.cardvalidity = false;
        assertEquals("Card not validated",a.enterCard());
    }
    @Test
    public void test2(){
        atmachine a = new atmachine();
        assertEquals("Validated card",a.enterCard());
    }
    @Test
    public void test3(){
        atmachine a = new atmachine();
        assertEquals("Successful login",a.enterPassword());
    }
    @Test
    public void test4(){
        atmachine a = new atmachine();
        assertEquals("Validated card",a.enterCard());
        a.passvalidity = false;
        assertEquals("Wrong password",a.enterPassword());
    }
    @Test
    public void test5(){
        atmachine a = new atmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Enter valid amount",a.deposit(20));
        assertEquals("Not enough balance",a.withdraw(10));
    }
    @Test
    public void test6(){
        atmachine a = new atmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(100));
        assertEquals("Successful withdraw",a.withdraw(50));
    }
    @Test
    public void test7(){
        atmachine a = new atmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(500));
        assertEquals("Successful withdraw",a.withdraw(10));
    }
    @Test
    public void test8(){
        atmachine a = new atmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(3000));
        assertEquals("Successful withdraw",a.withdraw(1500));
        assertEquals("Successful withdraw",a.withdraw(1500));
    }
    @Test
    public void test9(){
        atmachine a = new atmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(2000));
        assertEquals("Successful withdraw",a.withdraw(1000));
        assertEquals("Not enough balance",a.withdraw(1001));
    }
}