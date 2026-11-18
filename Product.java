public class Product implements IProduct {
    // Single dimensional array - product names
    private String[] products;
    // Two dimensional array - sales [product][month]
    private int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = products.length * sales[0].length; // 3 products x 3 months = 9
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int max = sales[0][0];
        int maxIndex = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > max) {
                    max = sales[i][j];
                    maxIndex = i;
                }
            }
        }
        // Returns e.g. Cozy Nights Monarch(25) to match sample
        return products[maxIndex] + "(" + max + ")";
    }
}


