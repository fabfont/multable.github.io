@file:JsModule("@material-ui/core/TableHead")
@file:JsNonModule
package com.truelines.material

import react.RClass

external interface TableHeadProps: CommonMaterialProps {

    /**
     * Default: 'thead'
     *
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     */
    var component: String

}

@JsName("default")
external val TableHead : RClass<TableHeadProps>
