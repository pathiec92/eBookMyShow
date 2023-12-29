package ebook.show.eBookMyShow.model

import jakarta.persistence.*
import java.util.Date

@Entity
class Show(
    val startTime: Date,
    val endTime: Date,

    @ManyToOne
    val movie: Movie,
    //1  1
    //M   1
    @ManyToOne
    val screen: Screen,

    @Enumerated(value = EnumType.STRING)
    val language: Language,

    //1 M
    //1  1
    @OneToMany(mappedBy = "show")
    var showSeats: List<ShowSeat> = ArrayList()
/*,

    @OneToMany(mappedBy = "show")
    var showSeatTypes: List<ShowSeatType> = ArrayList(),

    @ElementCollection
    @Enumerated(value = EnumType.STRING)
    var showFeature: List<ScreenFeature> =ArrayList()*/
): BaseModel()