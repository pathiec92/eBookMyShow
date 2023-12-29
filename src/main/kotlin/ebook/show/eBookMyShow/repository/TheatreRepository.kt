package ebook.show.eBookMyShow.repository

import ebook.show.eBookMyShow.model.Theatre
import org.springframework.data.jpa.repository.JpaRepository

interface TheatreRepository : JpaRepository<Theatre, Long> {
}