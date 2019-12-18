package com.effective.android.component.square.view.adapter

import android.view.ViewGroup
import com.effective.android.base.view.list.IMediaItem
import com.effective.android.base.view.list.MediaAdapter
import com.effective.android.base.view.list.MediaHolder
import com.effective.android.component.square.Constants
import com.effective.android.component.square.R
import com.effective.android.component.square.view.adapter.holder.CommonArticleHolder
import com.effective.android.component.square.view.adapter.holder.BannerHolder
import com.effective.android.component.square.view.adapter.holder.WeChatArticleHolder

open class BlogArticleAdapter(dataList: MutableList<IMediaItem>? = null) : MediaAdapter<IMediaItem>(dataList){

    override fun onCreateVHolder(parent: ViewGroup, viewType: Int): MediaHolder<*> {
        return when (viewType) {
            Constants.commonArticleType -> CommonArticleHolder(parent, R.layout.square_holder_article_layout)
            Constants.bannerType -> BannerHolder(parent, R.layout.square_holder_banner_layout)
            Constants.weChatArticleType -> WeChatArticleHolder(parent, R.layout.square_holder_wechat_article_layout)
            else -> CommonArticleHolder(parent, R.layout.square_holder_article_layout)
        }
    }
}