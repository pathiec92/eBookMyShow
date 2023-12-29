package ebook.show.eBookMyShow.controller

import ebook.show.eBookMyShow.dto.MovieDto
import ebook.show.eBookMyShow.service.MovieService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/movie")
class MovieController(private val movieService: MovieService) {
    @PostMapping
    fun addUser(@RequestBody movieDto: MovieDto) =
        ResponseEntity(movieService.addMovie(
            movieDto.name,
            movieDto.length,
            movieDto.rating,
            movieDto.language,
            movieDto.movieFeature), HttpStatus.OK)

    @GetMapping
    fun getMovies() = ResponseEntity(movieService.getMovies(), HttpStatus.OK)


}