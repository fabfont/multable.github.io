/*
 *  Copyright (c) 2019 Leonard Management. All rights reserved.
 *
 *  This is an unpublished work of Leonard Management.
 *  It may not be used, copied, disclosed or transferred other than
 *  in accordance with the written permission of Leonard Management.
 */

package com.truelines.utils

object InputTextChecker {

    const val NAME_PATTERN_WITHOUT_SPACE = "^[a-zA-Z0-9_\u002d]+$"
    const val NAME_PATTERN = "^[a-zA-Z0-9_\\s\u002d]+$"

    // For the moment, we only consider '.' (not '>', '<' and '/')
    // If the path lasts with a '.', the last dot is ignore.
    // This is to avoid having the error text appearing everytime we enter a dot.
    const val ATTRIBUTE_PATH_PATTERN = "^[a-zA-Z0-9_\u002d]+(\\.[a-zA-Z0-9_\u002d]+)*(\\.)?"

    const val WORKSHEET_PARAM_PATTERN = "^[a-zA-Z0-9_ \u002d]+(\\.[a-zA-Z0-9_ \u002d]+)*(\\.)?"


    fun checkName(name: String, withSpaces: Boolean = true): Boolean {
        var patern = if (withSpaces) {NAME_PATTERN} else {NAME_PATTERN_WITHOUT_SPACE}
        return patern.toRegex().matches(name)
    }

    fun checkAttributePath(name: String): Boolean {
        return ATTRIBUTE_PATH_PATTERN.toRegex().matches(name)
    }

    fun checkWorksheetParameter(name: String): Boolean {
        return WORKSHEET_PARAM_PATTERN.toRegex().matches(name)
    }
}