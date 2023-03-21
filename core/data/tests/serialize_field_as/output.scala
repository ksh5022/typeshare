package com.agilebits

package onepassword {

case class EditItemViewModelSaveRequest (
	context: String,
	values: Vector[EditItemSaveValue],
	fill_action: Option[AutoFillItemActionRequest] = None
)

}
