package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathEx4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/dp/B0BDJVSDMY/ref=redir_mobile_desktop?_encoding=UTF8&aaxitk=9447c1b10323a5511756cea3a359e48b&content-id=amzn1.sym.c679a10e-5f33-4f2e-b014-f92eed44a58f%3Aamzn1.sym.c679a10e-5f33-4f2e-b014-f92eed44a58f&hsa_cr_id=9409154380702&pd_rd_plhdr=t&pd_rd_r=4203bc40-5875-4251-bb8a-b80d1bfe3312&pd_rd_w=R82Vy&pd_rd_wg=qfbrl&qid=1663601856&ref_=sbx_be_s_sparkle_mcd_asin_0_img&sr=1-1-fd947bf3-57d2-4cc9-939d-2805f92cef28");
		String text = driver.findElement(By.xpath("//span[contains(@class,'a-price-whole')]")).getText();
		System.out.println(text);
	}
}
