package ebook.show.eBookMyShow.repository

import ebook.show.eBookMyShow.model.City
import org.springframework.data.jpa.repository.JpaRepository


interface CityRepository: JpaRepository<City, Long> {
}