import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProductTest {

    private String[] GetProducts() {
        return new String[]{
                "Cozy Nights Monarch mattress",
                "Restonic Barbados mattress",
                "Sealy Phuket mattress"
        };
    }

    private int[][] GetSales() {
        return new int[][]{
                {25, 18, 20},
                {15, 10, 12},
                {18, 15, 20}
        };
    }

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(GetProducts(), GetSales());
        assertEquals(153, product.GetTotalProductsSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(GetProducts(), GetSales());
        assertEquals(17.0, product.GetAverageProductSold(), 0.001);
    }
}