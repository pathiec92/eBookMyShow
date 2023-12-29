package ebook.show.eBookMyShow.repository

import ebook.show.eBookMyShow.model.Screen
import ebook.show.eBookMyShow.model.Theatre
import org.springframework.data.jpa.repository.JpaRepository

interface ScreenRepository : JpaRepository<Screen, Long> {
}