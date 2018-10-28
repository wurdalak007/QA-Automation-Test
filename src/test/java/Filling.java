import org.junit.Test;
import org.openqa.selenium.*;
import static org.junit.Assert.assertEquals;

public class Filling extends BaseRunner {
    @Test
    public void testFilling() {
        driver.get(baseUrl);
        driver.findElement(By.name("fio")).click();
        driver.findElement(By.name("fio")).clear();
        driver.findElement(By.name("fio")).sendKeys("Fgh");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("ghj");
        driver.findElement(By.name("phone")).click();
        driver.findElement(By.name("phone")).clear();
        driver.findElement(By.name("phone")).sendKeys("+7 (8");
        driver.findElement(By.name("city")).click();
        driver.findElement(By.name("city")).clear();
        driver.findElement(By.name("city")).sendKeys("23");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Допустимо использовать только буквы русского, латинского алфавита и&nbsp;дефис'])[1]/following::div[8]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пройдите обучение'])[1]/following::article[1]")).click();
        assertEquals("Недостаточно информации. Введите фамилию, имя и отчество через пробел (Например: Иванов Иван Алексеевич)", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фамилия, имя и отчество'])[1]/following::div[3]")).getText());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Электронная почта'])[1]/following::div[3]")).click();
        assertEquals("Введите корректный адрес эл. почты", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Электронная почта'])[1]/following::div[3]")).getText());
        assertEquals("Номер телефона должен состоять из 10 цифр, начиная с кода оператора", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Номер телефона'])[1]/following::div[3]")).getText());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Город'])[1]/following::div[3]")).click();
        assertEquals("Допустимо использовать только буквы русского, латинского алфавита и дефис", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Город'])[1]/following::div[3]")).getText());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Продавец-консультант'])[2]/following::div[1]")).click();
        assertEquals("Поле обязательное", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Продавец-консультант'])[2]/following::div[1]")).getText());
    }


    @Test
    public void testClick() {
        driver.get(baseUrl);
        driver.findElement(By.name("fio")).click();
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("phone")).click();
        driver.findElement(By.name("city")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Поле обязательное'])[3]/following::div[8]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фамилия, имя и отчество'])[1]/following::div[3]")).click();
        assertEquals("Поле обязательное", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фамилия, имя и отчество'])[1]/following::div[3]")).getText());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Электронная почта'])[1]/following::div[3]")).click();
        assertEquals("Поле обязательное", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Электронная почта'])[1]/following::div[3]")).getText());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Номер телефона'])[1]/following::div[3]")).click();
        assertEquals("Необходимо указать номер телефона", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Номер телефона'])[1]/following::div[3]")).getText());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Город'])[1]/following::div[3]")).click();
        assertEquals("Поле обязательное", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Город'])[1]/following::div[3]")).getText());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Продавец-консультант'])[2]/following::div[1]")).click();
        assertEquals("Поле обязательное", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Продавец-консультант'])[2]/following::div[1]")).getText());
    }

}
