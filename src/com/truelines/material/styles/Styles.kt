@file:JsModule("@material-ui/core/styles")
@file:JsNonModule
package material

import react.RClass
import react.RProps

//@JsName("Theme")
//external val Theme : RClass<RProps>

@JsName("makeStyles")
external fun makeStyles(handler: ()->Unit)

@JsName("createStyles")
external fun createStyles(handler: ()->Unit)

@JsName("createMuiTheme")
external val createMuiTheme: dynamic

external interface ThemeProviderProps: RProps {
    var theme: dynamic
}

@JsName("ThemeProvider")
external val ThemeProvider: RClass<ThemeProviderProps>

@JsName("useTheme")
external fun useTheme(): RClass<RProps>