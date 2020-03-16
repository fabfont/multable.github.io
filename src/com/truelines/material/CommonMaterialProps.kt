/*
 *  Copyright (c) 2019 Leonard Management. All rights reserved.
 *
 *  This is an unpublished work of Leonard Management.
 *  It may not be used, copied, disclosed or transferred other than
 *  in accordance with the written permission of Leonard Management.
 */

package com.truelines.material

import react.RProps

external interface CommonMaterialProps: RProps {
    /**
     * CSS class name
     */
    var className : String

    /**
     * CSS style
     */
    var style: dynamic

    /**
     * Element id
     */
    var id: String

    /**
     * Key property
     */
    var key: String
}