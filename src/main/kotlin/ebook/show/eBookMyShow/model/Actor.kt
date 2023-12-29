package ebook.show.eBookMyShow.model

import jakarta.persistence.Entity
import jakarta.persistence.ManyToMany

@Entity
class Actor(
    val name: String,

    @ManyToMany(mappedBy = "actor")
    val movies: List<Movie>
): BaseModel()