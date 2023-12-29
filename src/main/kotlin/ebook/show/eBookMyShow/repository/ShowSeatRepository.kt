package ebook.show.eBookMyShow.repository

import ebook.show.eBookMyShow.model.Seat
import ebook.show.eBookMyShow.model.Show
import ebook.show.eBookMyShow.model.ShowSeat
import org.springframework.data.jpa.repository.JpaRepository


interface ShowSeatRepository: JpaRepository<ShowSeat, Long> {
}