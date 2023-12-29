package ebook.show.eBookMyShow.model

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.ManyToMany
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import java.util.Date

@Entity
class Ticket(
    // 1 1
    // m  1
    @ManyToOne
    val bookedBy: User,
    //1  1
    //m  1
    @ManyToOne
    val show: Show,
    // 1  m
    // m    1

    // 1 showseat can be more than 1 ticket. In case of ticket cancelled or payment failed.
    @ManyToMany
    val showSeats: List<ShowSeat>,

    @Enumerated(value = EnumType.STRING)
    val ticketStatus: TicketStatus ,

    val timeOfBooking: Date
) : BaseModel()  {
}