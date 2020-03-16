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

/**
 * ts2kt types with tweaks from material-ui/styles/spacing
 */
external interface Spacing {
    @nativeInvoke
    operator fun invoke(): Number
    @nativeInvoke
    operator fun invoke(value1: Number): Number
    @nativeInvoke
    operator fun invoke(value1: Number, value2: Number): String
    @nativeInvoke
    operator fun invoke(value1: Number, value2: Number, value3: Number): String
    @nativeInvoke
    operator fun invoke(value1: Number, value2: Number, value3: Number, value4: Number): String
}
