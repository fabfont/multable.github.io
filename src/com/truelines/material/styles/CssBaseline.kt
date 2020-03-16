/*
 *
 *  * Copyright (c) 2019 Leonard Management. All rights reserved.
 *  *
 *  * This is an unpublished work of Leonard Management.
 *  * It may not be used, copied, disclosed or transferred other than
 *  * in accordance with the written permission of Leonard Management.
 *  *
 *
 *
 */

package material

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState


@JsModule("@material-ui/core/CssBaseline")
private external val cssBaselineModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val cssBaselineComponent: RComponent<RProps, RState> = cssBaselineModule.default

fun RBuilder.mCssBaseline() = child(cssBaselineComponent) {}

