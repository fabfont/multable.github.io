@file:JsModule("@material-ui/pickers/DatePicker/DatePicker")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface KeyboardDatePickerProps: CommonMaterialProps {

    var clearable: Boolean

    /**
     * Default: false
     *
     * Description: If true, the switch will be disabled.
     */
    var disabled: Boolean

    /**
     * Keyboard onChange callback
     */
    var onChange: (value: String?) -> Unit

    var value: Any?

    var placeholder: String?

    var format: String

    var mask: String
}

@JsName("KeyboardDatePicker") // because it was exported as default
external val KeyboardDatePicker: RClass<KeyboardDatePickerProps>