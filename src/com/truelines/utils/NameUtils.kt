/*
 *
 *  * Copyright (c) 2019 Leonard Management. All rights reserved.
 *  *
 *  * This is an unpublished work of Leonard Management.
 *  * It may not be used, copied, disclosed or transferred other than
 *  * in accordance with the written permission of Leonard Management.
 *  *
 *
 */
package com.truelines.utils


object NameUtils {

    // List of characters that are disallowed when adding a new table or attribute
    // This describes the path to reach the requested attribute
    const val RELATION_TO_SEPARATOR = ">"
    const val RELATION_FROM_SEPARATOR = "<"
    const val RELATION_BOTH_SEPARATOR = "."
    const val ATTRIBUTE_SEPARATOR = "/"
    const val AGGREGATION_METHOD_SEPARATOR = "#"
    val FORBIDDEN_NAME_REGEX = Regex("[" +
            RELATION_BOTH_SEPARATOR +
            RELATION_FROM_SEPARATOR +
            RELATION_TO_SEPARATOR +
            ATTRIBUTE_SEPARATOR +
            AGGREGATION_METHOD_SEPARATOR +
            "]+")

//    // checkName checks that the name does not contain a forbidden charater
//    fun checkName(name: String) {
//        if (name.contains(FORBIDDEN_NAME_REGEX)) {
//            throw IllegalNameException("The name '$name' contains at least one of the forbidden characters: '.', '<'," +
//                    " '>', '/' or '#'")
//        }
//    }
}