package com.barthub.ui.main

import com.barthub.ui.base.BaseContract

/**
 * Created by Kevin Cho on 5/17/18.
 */

class MainContract {
    interface MvpView : BaseContract.MvpView {

    }

    interface Presenter<in V : MainContract.MvpView> : BaseContract.Presenter<V> {

    }
}