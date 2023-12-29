package ebook.show.eBookMyShow.service

import ebook.show.eBookMyShow.extentions.safeOrThrow
import ebook.show.eBookMyShow.model.*
import ebook.show.eBookMyShow.repository.MovieRepository
import ebook.show.eBookMyShow.repository.ScreenRepository
import ebook.show.eBookMyShow.repository.ShowRepository
import ebook.show.eBookMyShow.repository.ShowSeatRepository
import org.springframework.stereotype.Service
import java.util.*
import kotlin.collections.ArrayList

@Service
class ShowService(
    val showRepository: ShowRepository,
    val showSeatRepository: ShowSeatRepository,
    val movieRepository: MovieRepository,
    val screenRepository: ScreenRepository
) {
    fun addShow(
        movieId: Long,
        screenId: Long,
        language: Language,/*
        ticketPricing: Map<SeatType, Int>,*/
        startTime: Date,
        endTime: Date
    ) =

        movieRepository.safeOrThrow(movieId, {throw Exception("Movie not found $movieId")}){ m ->
            screenRepository.safeOrThrow(screenId, {throw Exception("Screen not found $screenId")}){s ->
                val showSeats = ArrayList<ShowSeat>()
                val savedShow = showRepository.save(Show(startTime, endTime, m, s, language))
                s.seats?.forEach{seat ->
                    val showSeat = ShowSeat(m.name, savedShow, seat, ShowSeatStatus.AVAILABLE)
                    showSeats.add(showSeatRepository.save(showSeat))
                }
                savedShow.showSeats = showSeats
                showRepository.save(savedShow)
            }
        }

    fun getShows(): List<Show> = showRepository.findAll()
}