package ebook.show.eBookMyShow.repository

import ebook.show.eBookMyShow.model.Show
import org.springframework.data.jpa.repository.JpaRepository


interface ShowRepository: JpaRepository<Show, Long> {
}