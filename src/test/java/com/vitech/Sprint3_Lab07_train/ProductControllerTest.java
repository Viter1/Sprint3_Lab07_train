package com.vitech.Sprint3_Lab07_train;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vitech.Sprint3_Lab07_train.controller.ProductController;
import com.vitech.Sprint3_Lab07_train.model.Product;
import com.vitech.Sprint3_Lab07_train.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

//    @Test
//    void testGetAllProducts() throws Exception {
//        // Given
//        Product product1 = new Product(1, "Product 1", "none", 10.0);
//        Product product2 = new Product(2, "Product 2", "none", 20.0);
//        List<Product> products = Arrays.asList(product1, product2);
//
//        when(productService.getAllProducts()).thenReturn(products);
//
//        // When / Then
//        mockMvc.perform(get("/products"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.length()").value(2))
//                .andExpect(jsonPath("$[0].name").value("Product 1"))
//                .andExpect(jsonPath("$[1].name").value("Product 2"));
//
//        verify(productService, times(1)).getAllProducts();
//    }

//    @Test
//    void testGetProductById() throws Exception {
//        // Given
//        Product product = new Product(1, "Product 1", "none", 10.0);
//        when(productService.getProductById(1)).thenReturn(Optional.of(product));
//
//        // When / Then
//        mockMvc.perform(get("/products/1"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name").value("Product 1"))
//                .andExpect(jsonPath("$.price").value(10.0));
//
//        verify(productService, times(1)).getProductById(1);
//    }
}