package org.acme.rest.client

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient

@Path("/products")
@RegisterRestClient
interface ProductsService {
    @GET
    @Path("/{id}")
    fun getById(@PathParam("id") id: String): Product

    @GET
    fun list(): ProductList
}