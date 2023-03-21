package com.agilebits

package onepassword {

// Generated type representing the anonymous struct variant `List` of the `AnonymousStructWithRename` Rust enum
case class AnonymousStructWithRenameListInner (
	list: Vector[String]
)

// Generated type representing the anonymous struct variant `LongFieldNames` of the `AnonymousStructWithRename` Rust enum
case class AnonymousStructWithRenameLongFieldNamesInner (
	some_long_field_name: String,
	and: Boolean,
	but_one_more: Vector[String]
)

// Generated type representing the anonymous struct variant `KebabCase` of the `AnonymousStructWithRename` Rust enum
case class AnonymousStructWithRenameKebabCaseInner (
	another_list: Vector[String],
	camelCaseStringField: String,
	something_else: Boolean
)

sealed trait AnonymousStructWithRename {
	def serialName: String
}
object AnonymousStructWithRename {
	case class List(content: AnonymousStructWithRenameListInner) extends AnonymousStructWithRename {
		val serialName: String = "list"
	}
	case class LongFieldNames(content: AnonymousStructWithRenameLongFieldNamesInner) extends AnonymousStructWithRename {
		val serialName: String = "longFieldNames"
	}
	case class KebabCase(content: AnonymousStructWithRenameKebabCaseInner) extends AnonymousStructWithRename {
		val serialName: String = "kebabCase"
	}
}

}
