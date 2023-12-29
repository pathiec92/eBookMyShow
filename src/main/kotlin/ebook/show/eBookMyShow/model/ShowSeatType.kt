package ebook.show.eBookMyShow.model

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.ManyToOne

@Entity
class ShowSeatType(
    val price: Double,

    @ManyToOne
    val show:Show,

    @Enumerated(value = EnumType.STRING)
    val seatType: SeatType

):BaseModel() {
}