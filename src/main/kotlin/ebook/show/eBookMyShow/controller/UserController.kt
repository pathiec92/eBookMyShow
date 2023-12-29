package ebook.show.eBookMyShow.controller

import ebook.show.eBookMyShow.dto.CityDto
import ebook.show.eBookMyShow.dto.UserDto
import ebook.show.eBookMyShow.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(private val userService: UserService) {
    @PostMapping
    fun addUser(@RequestBody userDto: UserDto) =
        ResponseEntity(userService.addUser(userDto.name, userDto.email), HttpStatus.OK)

    @GetMapping
    fun getUsers() = ResponseEntity(userService.getUsers(), HttpStatus.OK)


}