package com.agilebits

package onepassword {

// This is a comment.
// Continued lovingly here
sealed trait Colors {
	def serialName: String
}
object Colors {
	case object Red extends Colors {
		val serialName: String = "Red"
	}
	case object Blue extends Colors {
		val serialName: String = "Blue"
	}
	// Green is a cool color
	case object Green extends Colors {
		val serialName: String = "Green"
	}
}

}
