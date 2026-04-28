package ge.ibsu.demo.repositories;

import ge.ibsu.demo.dto.ProductStats;
import ge.ibsu.demo.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT new com.example.ProductStats(p.category, AVG(p.price)) " +
            "FROM Product p GROUP BY p.category")
    List<ProductStats> findAveragePriceByCategory();
}