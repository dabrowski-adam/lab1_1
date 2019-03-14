package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Product {

    private String id;

    private Money price;

    private String name;

    private Date snapshot;

    private String type;

    public Product(String id, Money price, String name, Date snapshot, String type) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.snapshot = snapshot;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public Money getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Date getSnapshot() {
        return snapshot;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id)
               && Objects.equals(price, product.price)
               && Objects.equals(name, product.name)
               && Objects.equals(snapshot, product.snapshot)
               && Objects.equals(type, product.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, name, snapshot, type);
    }
}
