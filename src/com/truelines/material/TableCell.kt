@file:JsModule("@material-ui/core/TableCell")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass

external interface TableCellProps: CommonMaterialProps {

    /**
     * One of:
     *  - 'inherit'
     *  - 'left'
     *  - 'center'
     *  - 'right'
     *  - 'justify'
     *
     * Default: 'inherit'
     *
     * Description: Set the text-align on the table cell content.
     *   Monetary or generally number fields should be right aligned as that allows you to add them up quickly in your
     *   head without having to worry about decimals.
     */
    var align: String

    /**
     * One of:
     *  - 'default'
     *  - 'checkbox'
     *  - 'none'
     *
     * Default: 'default'
     *
     * Description: Sets the padding applied to the cell. By default, the Table parent component set the value
     * (default).
     */
    var padding: String

    /**
     * Description: Set scope attribute.
     */
    var scope: String

    /**
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     */
    var component: String

    /**
     * One of:
     *  - 'small'
     *  - 'medium'
     *
     * Default: 'medium'
     *
     * Description: Specify the size of the cell. By default, the Table parent component set the value (medium).
     */
    var size: String

    /**
     * One of:
     *  - 'asc'
     *  - 'desc'
     *  - false
     *
     * Description: Set aria-sort direction.
     */
    var sortDirection: String

    /**
     * One of:
     *  - 'head'
     *  - 'body'
     *  - 'footer'
     *
     * Description: Specify the cell type. By default, the TableHead, TableBody or TableFooter parent component
     * set the value.
     */
    var variant: String

    /**
     * Callback performed on right-click
     */
    var onContextMenu: (Event) -> Unit

    /**
     * Row span
     */
    var rowSpan: Int

    /**
     * Column span
     */
    var colSpan: Int
}

@JsName("default")
external val TableCell : RClass<TableCellProps>
