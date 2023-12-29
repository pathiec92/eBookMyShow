package ebook.show.eBookMyShow.dto

import ebook.show.eBookMyShow.model.Language
import ebook.show.eBookMyShow.model.MovieFeatures

data class MovieDto(val name:String,
                    val length: Int,
                    val rating: Double,
                    val language: Language,
                    val movieFeature: MovieFeatures)
