@file:JsModule("@material-ui/core/TableFooter")
@file:JsNonModule
package com.truelines.material

import react.RClass

external interface TableFooterProps: CommonMaterialProps {

    /**
     * Default: 'tfoot'
     *
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     */
    var component: String

}

@JsName("default")
external val TableFooter : RClass<TableFooterProps>
