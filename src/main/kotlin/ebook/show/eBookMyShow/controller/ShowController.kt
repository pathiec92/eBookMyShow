package ebook.show.eBookMyShow.controller

import ebook.show.eBookMyShow.dto.ShowDto
import ebook.show.eBookMyShow.service.ShowService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/show")
class ShowController(private val showService: ShowService) {
    @PostMapping
    fun addShow(@RequestBody showDto: ShowDto) =
        ResponseEntity(showService.addShow(showDto.movieId, showDto.screenId, showDto.language, /*showDto.ticketPricing,*/ showDto.startTime, showDto.endTime), HttpStatus.OK)

    @GetMapping
    fun getUsers() = ResponseEntity(showService.getShows(), HttpStatus.OK)


}