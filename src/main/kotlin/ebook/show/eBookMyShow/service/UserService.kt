package ebook.show.eBookMyShow.service

import ebook.show.eBookMyShow.model.City
import ebook.show.eBookMyShow.model.User
import ebook.show.eBookMyShow.repository.CityRepository
import ebook.show.eBookMyShow.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {
    fun addUser(name: String, email:String) = userRepository.save(User(name, email))
    fun getUsers() = userRepository.findAll()
}