package com.wyd.configurationcenter

import android.content.Context
import android.widget.Toast

/**
 * Created by wyd on 2019/3/8.
 */
class ToastUtil {
    fun show(context: Context, message: CharSequence) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}