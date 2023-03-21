package com.agilebits

package onepassword {

sealed trait Options {
	def serialName: String
}
object Options {
	case class Red(content: Boolean) extends Options {
		val serialName: String = "red"
	}
	case class Banana(content: String) extends Options {
		val serialName: String = "banana"
	}
	case class Vermont(content: Options) extends Options {
		val serialName: String = "vermont"
	}
}

// Generated type representing the anonymous struct variant `Exactly` of the `MoreOptions` Rust enum
case class MoreOptionsExactlyInner (
	config: String
)

// Generated type representing the anonymous struct variant `Built` of the `MoreOptions` Rust enum
case class MoreOptionsBuiltInner (
	top: MoreOptions
)

sealed trait MoreOptions {
	def serialName: String
}
object MoreOptions {
	case class News(content: Boolean) extends MoreOptions {
		val serialName: String = "news"
	}
	case class Exactly(content: MoreOptionsExactlyInner) extends MoreOptions {
		val serialName: String = "exactly"
	}
	case class Built(content: MoreOptionsBuiltInner) extends MoreOptions {
		val serialName: String = "built"
	}
}

}
