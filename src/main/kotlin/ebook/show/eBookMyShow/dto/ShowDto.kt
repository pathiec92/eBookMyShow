package ebook.show.eBookMyShow.dto

import ebook.show.eBookMyShow.model.Language
import java.util.*

data class ShowDto(val movieId:Long, val screenId:Long, val language: Language, /*val ticketPricing: Map<SeatType, Int>,*/
                   val startTime: Date = Date(), val endTime:Date = Date())
