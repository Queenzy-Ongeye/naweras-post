package dev.nawera.nawerasposts

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.nawera.nawerasposts.databinding.PostListItemBinding

class displayPostsRvAdaptor (var context: Context, var displayPOst: List<Post>):
     RecyclerView.Adapter<RetrofitviewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetrofitviewHolder {
        var binding= PostListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RetrofitviewHolder(binding)
    }

    override fun onBindViewHolder(holder: RetrofitviewHolder, position: Int) {
        var Currentposts=displayPOst.get(position)
        with(holder.binding){
            tvUserId.text=Currentposts.userId.toString()
            tvId.text=Currentposts.id.toString()
            tvTitle.text=Currentposts.title.toString()
            tvBody.text=Currentposts.body.toString()
        }


    }

    override fun getItemCount(): Int {
        return displayPOst.size
    }


    }
    class  RetrofitviewHolder(val binding: PostListItemBinding):RecyclerView.ViewHolder(binding.root)


