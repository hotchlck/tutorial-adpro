package id.ac.ui.cs.advprog.eshop.repository;

import org.springframework.stereotype.Repository;
import id.ac.ui.cs.advprog.eshop.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create(Product product) {
        productData.add(product);
        return product;
    }

    public String delete(String productId) {
        Product product = findById(productId);
        productData.remove(product);
        return productId;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }

    public Product findById(String productId) {
        for (Product product : productData) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

}
