package ebook.show.eBookMyShow.controller

import ebook.show.eBookMyShow.dto.ScreenDto
import ebook.show.eBookMyShow.dto.SeatDto
import ebook.show.eBookMyShow.dto.TheaterDto
import ebook.show.eBookMyShow.model.Screen
import ebook.show.eBookMyShow.service.TheatreService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/theatre")
class TheaterController(private val theaterService: TheatreService) {

    @PostMapping
    fun addTheatre(@RequestBody theaterDto: TheaterDto) = ResponseEntity(
        theaterService.addTheatre(
            theaterDto.name,
            theaterDto.address,
            theaterDto.cityId),
        HttpStatus.OK)

    @GetMapping
    fun getTheatres() = ResponseEntity(theaterService.getTheatres(), HttpStatus.OK)

    @PostMapping("/screen")
    fun addTheatre(@RequestBody screen: ScreenDto) = ResponseEntity(
        theaterService.addScreen(
            screen.name,
            screen.theatreId),
        HttpStatus.OK)

    @GetMapping("/screen")
    fun getScreens() = ResponseEntity(theaterService.getScreens(), HttpStatus.OK)

    @PostMapping("/seat")
    fun addSeats(@RequestBody seatDto: SeatDto) = ResponseEntity(theaterService.addSeats(seatDto.screenId, seatDto.seatCount), HttpStatus.OK)
}