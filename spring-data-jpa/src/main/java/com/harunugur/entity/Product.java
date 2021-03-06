package com.harunugur.entity;

import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Audited
@AuditTable("PRODUCT_LOG")
public class Product{

    @Id
    @SequenceGenerator(name = "seq_product", allocationSize = 1)
    @GeneratedValue(generator = "seq_product", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private BigDecimal amount;

    @NotAudited
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
