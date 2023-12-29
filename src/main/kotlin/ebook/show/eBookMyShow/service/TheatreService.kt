package ebook.show.eBookMyShow.service

import ebook.show.eBookMyShow.exception.CityNotFoundException
import ebook.show.eBookMyShow.exception.TheatreNotFoundException
import ebook.show.eBookMyShow.extentions.safeOrThrow
import ebook.show.eBookMyShow.model.Screen
import ebook.show.eBookMyShow.model.Seat
import ebook.show.eBookMyShow.model.SeatType
import ebook.show.eBookMyShow.model.Theatre
import ebook.show.eBookMyShow.repository.CityRepository
import ebook.show.eBookMyShow.repository.ScreenRepository
import ebook.show.eBookMyShow.repository.SeatRepository
import ebook.show.eBookMyShow.repository.TheatreRepository
import org.springframework.stereotype.Service
import org.springframework.util.MultiValueMap

@Service
class TheatreService(
    private val theatreRepository: TheatreRepository,
    private val cityRepository: CityRepository,
    private val screenRepository: ScreenRepository,
    private val seatRepository: SeatRepository
) {

    fun addTheatre(name:String, address:String, cityId: Long): Theatre = run{
        cityRepository.safeOrThrow(cityId,{
                throw CityNotFoundException("City not present for the cityId = $cityId")}
        ){ city ->
            val theatre = Theatre(name, address)
            theatre.city = city
            theatreRepository.save(theatre)
        }

    }

    fun getTheatres(): MutableList<Theatre> = theatreRepository.findAll()
    fun addScreen(name: String, theatreId: Long) =
        theatreRepository.safeOrThrow(theatreId,{
                throw TheatreNotFoundException("Theatre not present for the theatreId = $theatreId") }
        ){ theatre ->
            val screen = Screen(name, theatre)
            screenRepository.save(screen)
        }

    fun getScreens(): MutableList<Screen> = screenRepository.findAll()
    fun addSeats(screenId: Long, seatCount: Map<SeatType, Int>) =
            screenRepository.safeOrThrow(screenId, {throw TheatreNotFoundException("Theatre not present for the theatreId = $screenId")}){ screen ->
                val seats = ArrayList<Seat>();
                seatCount.entries.forEach { e ->
                    for(i in 0 .. e.value){
                        val seat = Seat(e.key.toString() + (i + 1).toString(), e.key)
                        seats.add(seat)
                     }
                }
                seatRepository.saveAll(seats)
                screen.seats = seats
                screenRepository.save(screen)
            }

}


