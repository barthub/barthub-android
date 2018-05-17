package com.barthub.ui.base

/**
 * Created by Kevin Cho on 5/17/18.
 */
open class BasePresenter<in V : BaseContract.MvpView> : BaseContract.Presenter<V> {

    private var mvpView : V? = null

    override fun onAttach(view: V) {
        mvpView = view
    }

    override fun onDetach() {
        mvpView = null
    }

}