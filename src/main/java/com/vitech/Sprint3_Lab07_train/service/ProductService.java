package com.vitech.Sprint3_Lab07_train.service;

import com.vitech.Sprint3_Lab07_train.model.Product;
import com.vitech.Sprint3_Lab07_train.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Método para guardar la imagen codificada en Base64
    public void saveImage(Integer id, String base64Image) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        product.setImage(base64Image); // Asignamos la imagen al campo image
        productRepository.save(product); // Guardamos el producto con la nueva imagen
    }

    // Método para obtener la imagen decodificada como byte[]
    public byte[] getImage(Integer id) {
        Product product = productRepository.findById(id).orElse(null);
        if (product != null && product.getImage() != null) {
            return Base64.getDecoder().decode(product.getImage()); // Decodificamos la imagen a byte[]
        }
        return null; // Retornamos null si no se encuentra la imagen
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }

    public Product updateProduct(Integer id, Product productDetails) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        product.setName(productDetails.getName());
        product.setDescription(productDetails.getDescription());
        product.setPrice(productDetails.getPrice());
        return productRepository.save(product);
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
}