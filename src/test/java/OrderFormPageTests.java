import org.junit.Assert;
import org.junit.Test;
import site.pages.OrderFormPage;

public class OrderFormPageTests extends Annotation {
    @Test
    public void openOrderFormHeadButtonTest() {
        OrderFormPage orderFormPage = new OrderFormPage();
        orderFormPage.openOrderFormButtonHead();
        Assert.assertEquals(orderFormPage.openOrderFormButtonHead(), "Для кого самокат");
    }

    @Test
    public void openOrderFormFootButtonTest() {
        OrderFormPage orderFormPage = new OrderFormPage();
        orderFormPage.openOrderFormButtonFoot();
        Assert.assertEquals(orderFormPage.openOrderFormButtonFoot(), "Для кого самокат");
    }

    @Test
    public void successfulOrderScooterHeadButtonTest() {
        OrderFormPage orderFormPage = new OrderFormPage();
        orderFormPage.orderScooterHeadButtonSuccessful();
        orderFormPage.getTextScreenComplietOrder();
        Assert.assertEquals(orderFormPage.getTextScreenComplietOrder().startsWith("Заказ оформлен"), true);

    }
    @Test
    public void successfulOrderScooterFootButtonTest(){
        OrderFormPage orderFormPage = new OrderFormPage();
        orderFormPage.orderScooterFootButtonSuccessful();
        orderFormPage.getTextScreenComplietOrder();
        Assert.assertEquals(orderFormPage.getTextScreenComplietOrder().startsWith("Заказ оформлен"), true);

    }

}
