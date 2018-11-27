package com.example.menglingshuai.wxloginfragmentdemo

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.FragmentManager
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_wechat_login.*

class WechatLoginFragment : DialogFragment() {
    companion object {
        fun show(fm: FragmentManager) {
            var loginFragment = fm.findFragmentByTag(WechatLoginFragment::class.java.simpleName)
            if(loginFragment !is WechatLoginFragment) {
                loginFragment = WechatLoginFragment()
            }
            loginFragment.show(fm, WechatLoginFragment::class.java.simpleName)

        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_wechat_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iv_close.setOnClickListener { close() }
        tv_login_by_wechat.setOnClickListener {

        }
    }

    fun close() {
        dismiss()
    }

    override fun onStart() {
        super.onStart()
        if (dialog != null) {
            dialog.window.setGravity(Gravity.BOTTOM)
            val height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 296f, context?.resources?.displayMetrics).toInt()
            dialog.window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, height)
        }
    }

    override fun getTheme(): Int {
        return R.style.TagDialog
    }
}