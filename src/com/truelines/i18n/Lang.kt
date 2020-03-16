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

package com.truelines.i18n

import kotlin.browser.window

enum class Lang(var value: String) {
    ENGLISH("en"),
    FRENCH("fr");

    companion object {
        // Get the Lang enum from its value
        // or english if the value does not correspond to any enum
        fun getLang(value: String): Lang {
            return when (value) {
                "fr" -> FRENCH
                else -> ENGLISH
            }
        }

        // Get the navigator language
        fun getNavigatorLanguage(): Lang {
            return getLang(window.navigator.language)
        }
    }
}