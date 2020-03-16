@file:JsModule("@material-ui/core/TablePagination")
@file:JsNonModule
package com.truelines.material

import react.RClass

external interface TablePaginationProps: CommonMaterialProps {

    /**
     * Default: TableCell
     *
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     */
    var component: String

    // TODO Define all the other existing props
    // https://material-ui.com/api/table-pagination/

}

@JsName("default")
external val TablePagination : RClass<TablePaginationProps>
