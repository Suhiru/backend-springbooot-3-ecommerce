package com.suhiru.ecommerce.ecommerce.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "product_category")
@Getter
@Setter
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 8912359903826509422L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany( mappedBy = "category",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Product> products;
}
