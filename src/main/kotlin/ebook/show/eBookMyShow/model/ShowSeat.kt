package ebook.show.eBookMyShow.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.ManyToOne

@Entity
class ShowSeat(
    val name: String,
    @JsonIgnore
    @ManyToOne
    val show: Show,

    @ManyToOne
    val seat: Seat,

    @Enumerated(value = EnumType.STRING)
    val showSeatStatus: ShowSeatStatus
) : BaseModel()  {
}