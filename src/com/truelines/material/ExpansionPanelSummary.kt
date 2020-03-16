/*
 *  Copyright (c) 2019 Leonard Management. All rights reserved.
 *
 *  This is an unpublished work of Leonard Management.
 *  It may not be used, copied, disclosed or transferred other than
 *  in accordance with the written permission of Leonard Management.
 *
 */

@file:JsModule("@material-ui/core/ExpansionPanelSummary")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface ExpansionPanelSummaryProps: CommonMaterialProps {

    /**
     * The icon to display as the expand indicator.
     */
    var expandIcon: dynamic

    /**
     * Props applied to the IconButton element wrapping the expand icon.
     */
    var IconButtonProps: dynamic
}

@JsName("default") // because it was exported as default
external val ExpansionPanelSummary : RClass<ExpansionPanelSummaryProps>
