package day2;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class arabamCom {

    // Arabam kac para bolumune tiklayalim
    // Aracimin fiyatini merak ediyorum bolumunetiklayalim
    // Wolkswagen markasini secelim
    // yil secimi yapalim
    // model secimi yapalim
    // govde tipini secelim
    // yakit tipini secelim
    // vites tipini secelim
    // Versiyon secimi yapalim
    // aracin km bilgilerini girelim
    // aracin rengini secelim
    // opsiyel donanim (varsa) seecelim
    // degisen bilgisi ekleyerek tramer kaydi belirtelim
    // aracimizin fiyatinin 500.000 tl den fazla oldugunu test edelim
    // uygulamayi kapatalim


    AndroidDriver<AndroidElement> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
       // capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\gebruiker\\Desktop\\APPIUM_T-116\\Apps\\arabam.com_4.8.0_Apkpure.apk");
        capabilities.setCapability("appPackage","com.dogan.arabam"); // hangi uygulama uzerinde calismak istiyorsak
        // apk

        capabilities.setCapability("appActivity","com.dogan.arabam.presentation.feature.home.HomeActivity");
                                            // kullanacak oldugumuz uygulamayi belşrledikten sonra, o uygulama hangi sayfadan baslamak istiyorsak
                                            // onun degerini activities kısminda bularak  appActivity degiskenin karsisina parametre olarak giriyoruz

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }


    @Test
    public void arabamTest(){
        driver.activateApp("com.dogan.arabam"); // bir yugulamayi aktif hale getirmek istedigimizde apk info dan onun bundledlied degerini alip

        // Arabam kac para bolumune tiklayalim
        // Aracimin fiyatini merak ediyorum bolumunetiklayalim
        // Wolkswagen markasini secelim
        // yil secimi yapalim
        // model secimi yapalim
        // govde tipini secelim
        // yakit tipini secelim
        // vites tipini secelim
        // Versiyon secimi yapalim
        // aracin km bilgilerini girelim
        // aracin rengini secelim
        // opsiyel donanim (varsa) seecelim
        // degisen bilgisi ekleyerek tramer kaydi belirtelim
        // aracimizin fiyatinin 500.000 tl den fazla oldugunu test edelim
        // uygulamayi kapatalim


    }

}
