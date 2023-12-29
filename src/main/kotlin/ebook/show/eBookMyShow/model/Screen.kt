package ebook.show.eBookMyShow.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*

@Entity
class Screen(
    val name:String,
    //@JsonIgnore
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name= "theatre_id")
    val theatre: Theatre,

    @ElementCollection
    @Enumerated(value = EnumType.STRING)
    val screenFeatures:List<ScreenFeature> = ArrayList(),

    @OneToMany(fetch = FetchType.EAGER)
    var seats: List<Seat>? = ArrayList(),


) : BaseModel() {
}