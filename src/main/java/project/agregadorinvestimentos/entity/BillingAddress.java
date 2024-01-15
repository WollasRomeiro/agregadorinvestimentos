package project.agregadorinvestimentos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

public class BillingAddress {
    @Entity
    @Table(name = "tb_billingaddress")
    public class BillingAddress {

        @Id
        private UUID id;

        @Column(name = "street")
        private String street;

        @Column(name = "number")
        private Integer number;
    }
}
