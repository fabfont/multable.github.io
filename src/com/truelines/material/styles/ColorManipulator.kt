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

@file:JsModule("@material-ui/core/styles/colorManipulator")
package material

//external fun recomposeColor(color: ColorObject): string
external fun convertHexToRGB(hex: String): String
//external fun decomposeColor(color: String): ColorObject
external fun getContrastRatio(foreground: String, background: String): Double
external fun getLuminance(color: String): Double
external fun emphasize(color: String, coefficient: Double?): String
external fun fade(color: String, value: Double): String
external fun darken(color: String, coefficient: Double?): String
external fun lighten(color: String, coefficient: Double?): String

