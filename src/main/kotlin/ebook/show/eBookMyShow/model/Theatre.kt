package ebook.show.eBookMyShow.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*

/*
* Theater    City
*   1          1
*   M          1
* */
@Entity
class Theatre(
    val name:String,
    val address:String,

    @JsonIgnore
    @OneToMany(mappedBy = "theatre")
    val screen: MutableList<Screen> = ArrayList(),

    //@JsonIgnore
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "city_id")
    var city:City? = null,

): BaseModel(){

}
