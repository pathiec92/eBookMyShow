package ebook.show.eBookMyShow.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

@Entity(name = "city")
class City(
    val name:String
): BaseModel(){
    @JsonIgnore
    @OneToMany(mappedBy= "city")
    var theatres: MutableList<Theatre>? = ArrayList()
}



