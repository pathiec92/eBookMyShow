package ebook.show.eBookMyShow.repository

import ebook.show.eBookMyShow.model.City
import ebook.show.eBookMyShow.model.User
import org.springframework.data.jpa.repository.JpaRepository


interface UserRepository: JpaRepository<User, Long> {
}