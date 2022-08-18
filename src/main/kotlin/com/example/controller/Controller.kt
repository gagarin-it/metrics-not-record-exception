package com.example.controller

import com.example.dto.BodyDto
import com.example.service.Service
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller
class Controller(
    private val service: Service
) {

    @Post(
        consumes = [MediaType.APPLICATION_JSON],
        produces = [MediaType.APPLICATION_JSON]
    )
    fun example(
        @Body body: BodyDto,
        request: HttpRequest<*>
    ): HttpResponse<String> {
        return HttpResponse.ok(service.asString(body))
    }
}