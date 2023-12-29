package ebook.show.eBookMyShow.service

import ebook.show.eBookMyShow.model.City
import ebook.show.eBookMyShow.repository.CityRepository
import org.springframework.stereotype.Service

@Service
class CityService(val cityRepository: CityRepository) {
    fun addCity(name: String) = cityRepository.save(City(name))
    fun getCities() = cityRepository.findAll()
}