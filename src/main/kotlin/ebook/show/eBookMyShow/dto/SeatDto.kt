package ebook.show.eBookMyShow.dto

import ebook.show.eBookMyShow.model.SeatType

data class SeatDto(val screenId: Long, val seatCount: Map<SeatType, Int>)