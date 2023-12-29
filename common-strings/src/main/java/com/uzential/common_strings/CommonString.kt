package com.uzential.common_strings

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

class CommonString(
    @StringRes
    val resId: Int
) {

    val value
        @Composable
        get() = stringResource(id = resId)
}