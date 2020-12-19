package com.harunugur.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Document(createIndex = true,indexName = "product_index")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String id;
    @Field(name = "product_name",type = FieldType.Text)
    private String productName;
    @Field(name = "type",type = FieldType.Text)
    private String type;
}
