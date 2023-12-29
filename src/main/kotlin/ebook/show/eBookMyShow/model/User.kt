package ebook.show.eBookMyShow.model

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.ManyToOne

@Entity(name = "ebook_user")
class User(
    val name: String,
    val email: String
) : BaseModel()  {
}