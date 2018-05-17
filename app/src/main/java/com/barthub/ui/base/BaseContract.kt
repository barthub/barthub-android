package com.barthub.ui.base

import android.content.Context

/**
 * Created by Kevin Cho on 5/17/18.
 */
class BaseContract {
    interface MvpView {
        fun getContext(): Context
        fun prepare()
    }

    interface Presenter<in T : MvpView> {
        fun onAttach(view: T)
        fun onDetach()
    }
}