/*
 *  Copyright (c) 2019 Leonard Management. All rights reserved.
 *
 *  This is an unpublished work of Leonard Management.
 *  It may not be used, copied, disclosed or transferred other than
 *  in accordance with the written permission of Leonard Management.
 */

@file:JsModule("@material-ui/core/FormGroup")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface FormGroupProps: CommonMaterialProps {

    /**
     * Default: false
     *
     * Description: Display group of elements in a compact row.
     */
    var row: Boolean

}

@JsName("default") // because it was exported as default
external val FormGroup : RClass<FormGroupProps>
