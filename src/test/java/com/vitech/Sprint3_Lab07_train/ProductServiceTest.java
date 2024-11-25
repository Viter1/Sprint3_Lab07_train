package com.vitech.Sprint3_Lab07_train;

import com.vitech.Sprint3_Lab07_train.model.Product;
import com.vitech.Sprint3_Lab07_train.repository.ProductRepository;
import com.vitech.Sprint3_Lab07_train.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    public ProductServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllProducts() {
        // Given
        Product product1 = new Product(1, "Product 1", "none", 10.0);
        Product product2 = new Product(2, "Product 2", "none",  20.0);
        List<Product> products = Arrays.asList(product1, product2);

        when(productRepository.findAll()).thenReturn(products);

        // When
        List<Product> result = productService.getAllProducts();

        // Then
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("Product 1", result.get(0).getName());
        verify(productRepository, times(1)).findAll();
    }

    @Test
    void testGetProductById() {
        // Given
        Product product = new Product(1, "Product 1", "none", 10.0);
        when(productRepository.findById(1)).thenReturn(Optional.of(product));

        // When
        Optional<Product> result = productService.getProductById(1);

        // Then
        assertNotNull(result);
        assertEquals("Product 1", result.get().getName());
        verify(productRepository, times(1)).findById(1);
    }
}