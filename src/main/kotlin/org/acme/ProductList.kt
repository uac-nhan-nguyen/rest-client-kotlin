package org.acme.rest.client

data class ProductList (
    var products: List<ProductListItem> = emptyList(),
)