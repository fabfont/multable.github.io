@file:JsModule("@material-ui/core/Table")
@file:JsNonModule
package com.truelines.material

import react.RClass

external interface TableProps: CommonMaterialProps {
    /**
     * One of:
     * - 'small'
     * - 'medium'
     *
     * Default: 'medium'
     *
     * Description: Allows TableCells to inherit size of the Table.
     */
    var size: String

    /**
     * One of:
     * - 'default'
     * - 'checkbox'
     * - 'none'
     *
     * Default: 'default'
     *
     * Description: Allows TableCells to inherit padding of the Table.
     */
    var padding: String

    /**
     * Default: 'table'
     *
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     */
    var component: String

    /**
     * Default: false
     *
     * Description: Set the header sticky.
     * ⚠️ It doesn't work with IE 11.
     */
    var stickyHeader: Boolean
}

@JsName("default")
external val Table : RClass<TableProps>
