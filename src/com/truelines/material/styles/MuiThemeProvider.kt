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

import react.*


@JsModule("@material-ui/core/styles/MuiThemeProvider")
private external val muiThemeProviderModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val muiThemeProviderComponent: RComponent<MuiThemeProviderProps, RState> = muiThemeProviderModule.default

interface MuiThemeProviderProps : RProps {
    var disableStylesGeneration: Boolean
    var sheetsManager: Any
    var theme: Theme
}

@Deprecated("Using mMuiThemeProvider directly does not provide usable contexts to access the theme property. " +
        "Consider using themeProvider which wraps mMuiThemeProvider instead.", ReplaceWith("themeProvider"))
fun RBuilder.mMuiThemeProvider(theme: Theme, disableStylesGeneration: Boolean? = null, sheetsManager: Any? = null,
        handler: RHandler<MuiThemeProviderProps>? = null) = child(muiThemeProviderComponent) {
    disableStylesGeneration?.let { attrs.disableStylesGeneration = disableStylesGeneration }
    sheetsManager?.let { attrs.sheetsManager = sheetsManager }
    attrs.theme = theme

    if (handler != null) handler()
}

