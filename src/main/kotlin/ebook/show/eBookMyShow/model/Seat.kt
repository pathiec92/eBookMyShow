package ebook.show.eBookMyShow.model

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
@Entity
class Seat(
    val seatNumber: String,
    @Enumerated(value = EnumType.STRING)
    val seatType : SeatType
) : BaseModel()  {
}