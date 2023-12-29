package ebook.show.eBookMyShow.model

import jakarta.persistence.*
import org.hibernate.Length
import java.util.*
import kotlin.collections.ArrayList

@Entity
class Payment(
    val referenceId: String,
    val timeOfPayment: Date,
    val amount: Double,

    @ManyToOne
    val ticket: Ticket,

    @Enumerated(value = EnumType.STRING)
    val paymentMethod: PaymentMethod,

    @Enumerated(value = EnumType.STRING)
    val paymentStatus: PaymentStatus

    ): BaseModel()  {
}