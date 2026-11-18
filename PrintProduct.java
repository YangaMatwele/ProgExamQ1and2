public class PrintProduct {
    private IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void PrintAverageProductSales() {
        // Cast to int to print 17 not 17.0 like in screenshot
        System.out.println("AVERAGE PRODUCT SALES: " + (int) product.GetAverageProductSold());
    }

    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }

    public void PrintReport() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("\n***************************************");
        PrintTotalProductSales();
        PrintAverageProductSales();
        PrintMostPopularProduct();
    }
}

