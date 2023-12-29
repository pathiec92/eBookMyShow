package ebook.show.eBookMyShow.controller

import ebook.show.eBookMyShow.dto.CityDto
import ebook.show.eBookMyShow.model.City
import ebook.show.eBookMyShow.service.CityService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/city")
class CityController(private val cityService: CityService) {
    @PostMapping
    fun addCity(@RequestBody city: CityDto) =
        ResponseEntity(cityService.addCity(city.name), HttpStatus.OK)

    @GetMapping
    fun getCities() = ResponseEntity(cityService.getCities(), HttpStatus.OK)


}