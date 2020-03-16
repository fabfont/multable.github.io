@file:JsModule("@material-ui/core/MenuItem")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass

external interface MenuItemProps: CommonMaterialProps {

    /**
     * Description: If true, compact vertical padding designed for keyboard and mouse input will be used.
     */
    var dense: Boolean

    /**
     * Default: false
     *
     * Description: If true, the left and right padding is removed.
     */
    var disableGlutters: Boolean

    /**
     * Default: false
     *
     * Description: Use to apply selected styling.
     */
    var selected: Boolean

    /**
     * Default: false
     *
     * Description: If true, a 1px light border is added to the bottom of the list item.
     */
    var divider: Boolean

    /**
     * Default: false
     *
     * Description: If true, the list item will be disabled.
     */
    var disabled: Boolean

    /**
     * Default: false
     *
     * Description: If true, the list item will be focused during the first mount.
     * Focus will also be triggered if the value changes from false to true.
     */
    var autofocus: Boolean

    /**
     * Default: false
     *
     * Description: If true, the list item will be a button (using ButtonBase).
     * Props intended for ButtonBase can then be applied to ListItem.
     */
    var button: Boolean

    /**
     * One of:
     * - 'flex-start'
     * - 'center'
     *
     * Default: 'center'
     *
     * Description: Defines the align-items style property.
     */
    var alignItems: String

    /**
     * Description: selected value
     */
    var value: Any?

    /**
     * Description: Callback fired on click event
     */
    var onClick: (Event) -> Unit
}

@JsName("default") // because it was exported as default
external val MenuItem : RClass<MenuItemProps>