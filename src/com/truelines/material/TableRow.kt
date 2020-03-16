@file:JsModule("@material-ui/core/TableRow")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass

external interface TableRowProps: CommonMaterialProps {

    /**
     * Default: 'tr'
     *
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     */
    var component: String

    /**
     * Default: false
     *
     * Description: If true, the table row will shade on hover.
     */
    var hover: Boolean

    /**
     * Default: false
     *
     * Description: If true, the table row will have the selected shading.
     */
    var selected: Boolean

    var onClick: (Event) -> Unit

}

@JsName("default")
external val TableRow : RClass<TableRowProps>
