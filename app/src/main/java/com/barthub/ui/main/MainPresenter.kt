package com.barthub.ui.main

import com.barthub.ui.base.BasePresenter

/**
 * Created by Kevin Cho on 5/17/18.
 */
class MainPresenter<in V : MainContract.MvpView> : BasePresenter<V>(), MainContract.Presenter<V> {
    override fun onAttach(view: V) {
        super.onAttach(view)


    }

}