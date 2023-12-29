package ebook.show.eBookMyShow.repository

import ebook.show.eBookMyShow.model.Seat
import org.springframework.data.jpa.repository.JpaRepository

interface SeatRepository : JpaRepository<Seat, Long> {

}
