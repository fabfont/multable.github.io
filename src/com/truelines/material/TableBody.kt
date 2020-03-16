@file:JsModule("@material-ui/core/TableBody")
@file:JsNonModule
package com.truelines.material

import react.RClass

external interface TableBodyProps: CommonMaterialProps {

    /**
     * Default: 'tbody'
     *
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     */
    var component: String
}

@JsName("default")
external val TableBody : RClass<TableBodyProps>
