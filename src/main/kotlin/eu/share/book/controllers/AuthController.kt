package eu.share.book.controllers

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("api/auth")
class AuthController {

    private val _log = LoggerFactory.getLogger(AuthController::class.java)

    @PostMapping("/register")
    @ResponseBody
    fun registerUser(): ResponseEntity<*> {
        TODO("Impl logic for registration")
    }

    @GetMapping("/login")
    @ResponseBody
    fun loginUser(): ResponseEntity<*> {
        TODO("Impl logic for user login process")
    }
}