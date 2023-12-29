package ebook.show.eBookMyShow.service

import ebook.show.eBookMyShow.model.Language
import ebook.show.eBookMyShow.model.Movie
import ebook.show.eBookMyShow.model.MovieFeatures
import ebook.show.eBookMyShow.repository.MovieRepository
import org.springframework.stereotype.Service

@Service
class MovieService(val movieRepository: MovieRepository) {
    fun addMovie(name: String, email: Int, rating: Double, languages: Language, movieFeatures: MovieFeatures) =
        movieRepository.save(Movie(name, email, rating, null, languages, movieFeatures))
    fun getMovies() = movieRepository.findAll()
}