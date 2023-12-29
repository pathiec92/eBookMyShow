package ebook.show.eBookMyShow.model

import jakarta.persistence.*
import org.hibernate.Length

@Entity
class Movie(
    val name:String,
    val length: Int,
    val rating: Double,

    @ManyToMany
    var actor: List<Actor>? = ArrayList(),

    @Enumerated(value = EnumType.STRING)
    val language: Language,


    @Enumerated(value = EnumType.STRING)
    val movieFeature: MovieFeatures


    ): BaseModel()  {
}