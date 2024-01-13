package org.acme.rest.client

data class Product (
    var id: String? = null,
    var title: String? = null,
    var description: String? = null,
    var images: List<String>? = null
)