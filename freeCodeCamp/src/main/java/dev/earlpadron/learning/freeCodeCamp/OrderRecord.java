package dev.earlpadron.learning.freeCodeCamp;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @JsonProperty also works for Records
 *
 * Since accessor methods are not needed in a Record, we can instantly use this class to deserialize and serialize JSON Data
 *
 * Record classes were introduced in Java 16 :
 * > They are immutable, convenient, compact, automatic implementation of accessors, hashcode, equals, and toString
 * > reduces the verbosity of Java compared to regular POJO making it more suitable for data centric applications
 * > Records are better than creating a POJO(ex. Order) when no additional logic is needed, as they are only used to store data
 * > NOTE: ALL fields are final
 * WARNING: if the codebase you are working on is Java 16 or earlier, it is better to use a POJO as it may cause issues with older implementations
 */

public record OrderRecord(
        @JsonProperty("c-Name")
        String customerName,
        @JsonProperty("p-Name")
        String productName,
        Integer quantity
) { }
