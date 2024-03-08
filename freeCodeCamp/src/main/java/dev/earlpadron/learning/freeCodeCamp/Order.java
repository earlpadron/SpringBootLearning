package dev.earlpadron.learning.freeCodeCamp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    /**
     * Accessor(Getters and Setters) play a crucial role in the serialization(object->string) and deserialization(string->object) process for libraries like Jackson in SpringBoot
     *      > this is a common pattern for other frameworks such as Angular
     * @JsonProperty(<value>) can be used to change the expected key value in the JSON data that is being sent
     *  ex.         {
     *               "c-Name" : "Earl",    -> this will map to customerName
     *               "p-Name" : "iPhone",  -> this will map to productName
     *               "quantity" : 1
     *              }
     */
    @JsonProperty(value = "c-Name")
    private String customerName;
    @JsonProperty(value = "p-Name")
    private String productName;
    private Integer quantity;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }



    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
