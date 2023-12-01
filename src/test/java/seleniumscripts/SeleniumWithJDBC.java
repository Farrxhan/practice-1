package seleniumscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWithJDBC {
    private WebDriver driver;

    public void setup() {
        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();
    }

    public void testVerifyDB() throws ClassNotFoundException, SQLException {
        // Step 1: Load the MySQL JDBC driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Create the connection object
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "Handbook7*");

        // Step 3: Create the statement object
        Statement stmt = con.createStatement();

        // Step 4: Execute the SQL query
        ResultSet rs = stmt.executeQuery("SELECT * FROM Products");

        // Step 5: Iterate through the result set and perform web testing
        while (rs.next()) {
            int productId = rs.getInt("product_id");
            String productName = rs.getString("product_name");
            String productPrice = rs.getString("product_price");

            // Perform web testing using Selenium
            driver.get("https://www.seleniumhq.org");
            WebElement searchInput = driver.findElement(By.id("q"));
            searchInput.sendKeys(productName);
            searchInput.submit();

            // Print the database record and web page title
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Product Price: " + productPrice);
            System.out.println("Web Page Title: " + driver.getTitle());
            System.out.println("--------------------------------------------");
        }

        // Step 6: Close the resources
        rs.close();
        stmt.close();
        con.close();
    }

    public void teardown() {
        // Close the browser
        driver.quit();
    }
}
