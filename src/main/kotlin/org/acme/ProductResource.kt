package org.acme

import io.quarkus.rest.client.reactive.QuarkusRestClientBuilder
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import org.acme.rest.client.Product
import org.acme.rest.client.ProductListItem
import org.acme.rest.client.ProductsService
import java.net.URI

@Path("/product")
class ProductResource {
    private var extensionsService = QuarkusRestClientBuilder.newBuilder()
        .baseUri(URI.create("https://dummyjson.com"))
        .build(ProductsService::class.java)

    @GET
    @Path("/id/{id}")
    fun id(id: String): Product {
        return extensionsService.getById(id)
    }

    @GET
    fun list(): List<ProductListItem> {
        return extensionsService.list().products
    }
}