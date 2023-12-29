package ebook.show.eBookMyShow.extentions

import ebook.show.eBookMyShow.model.Theatre
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

fun <T, R>  JpaRepository<T, Long>.safeOrThrow(id: Long, thr: () -> Unit,res : (T) -> R) : R{
    val opt = this.findById(id)
    if(opt.isEmpty) thr()
    return res(opt.get())
}