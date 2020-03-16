@file:JsModule("@material-ui/pickers/DatePicker/DatePicker")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface DatePickerProps: CommonMaterialProps {
    var margin: String
    var label: String
    var format: String

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
}

@JsName("DatePicker") // because it was exported as default
external val DatePicker: RClass<DatePickerProps>