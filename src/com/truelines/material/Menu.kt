@file:JsModule("@material-ui/core/Menu")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass

external interface MenuProps: PopoverProps {

//    /**
//     * Description: The DOM element used to set the position of the menu.
//     */
//    var anchorEl: dynamic

    /**
     * Default: true
     *
     * Description: If true (Default) will focus the [role="menu"] if no focusable child is found.
     * Disabled children are not focusable. If you set this prop to false focus will be placed
     * on the parent modal container. This has severe accessibility implications and should
     * only be considered if you manage focus otherwise.
     */
    var autoFocus: Boolean

    /**
     * Default: false
     *
     * Description: When opening the menu will not focus the active item but the [role="menu"] unless autoFocus is
     * also set to false. Not using the default means not following WAI-ARIA authoring practices. Please be considerate
     * about possible accessibility implications.
     */
    var disableAutoFocusItem: Boolean

    /**
     * Description: Props applied to the MenuList element.
     */
    var MenuListProps: dynamic

    /**
     * Description: Callback fired when the component requests to be closed.
     * Signature:
     * function(event: object, reason: string) => void
     *      event: The event source of the callback.
     *      reason: Can be:"escapeKeyDown", "backdropClick", "tabKeyDown".
     */
    var onClose: (Event, String) -> Unit


//    /**
//     * Description: Callback fired before the Menu enters.
//     */
//    var onEnter: (Event) -> Unit
//
//    /**
//     * Description: Callback fired before the Menu has entered.
//     */
//    var onEntered: (Event) -> Unit
//
//    /**
//     * Description: Callback fired before the Menu is entering.
//     */
//    var onEntering: (Event) -> Unit
//
//    /**
//     * Description: Callback fired before the Menu exits.
//     */
//    var onExit: (Event) -> Unit
//
//    /**
//     * Description: Callback fired before the Menu has exited.
//     */
//    var onExited: (Event) -> Unit
//
//    /**
//     * Description: Callback fired before the Menu is exiting.
//     */
//    var onExiting: (Event) -> Unit
//
//    /**
//     * Description: If true, the menu is visible.
//     */
//    var open: Boolean

    /**
     * Description: classes prop applied to the Popover element.
     */
    var PopoverClasses: Any

//    /**
//     * One of:
//     *  - number
//     *  - { enter?: number, exit?: number }
//     *  - 'auto'
//     *
//     * Default: 'auto'
//     *
//     * Description: The length of the transition in ms, or 'auto'
//     */
//    var transitionDuration: String
//
//
//    /**
//     * One of:
//     *  - 'menu'
//     *  - 'selectedMenu'
//     *
//     * Default: 'selectedMenu'
//     *
//     * Description: The variant to use. Use menu to prevent selected items from impacting the initial focus and
//     * the vertical alignment relative to the anchor element.
//     */
//    var variant: String
}

@JsName("default") // because it was exported as default
external val Menu : RClass<MenuProps>