package com.v15h4l.userbook.ui.users

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.v15h4l.userbook.databinding.ItemUserBinding
import com.v15h4l.userbook.model.User

/**
 * User Adapter used to Display  User Items
 */
class UserAdapter : ListAdapter<User, UserViewHolder>(UserDiffCallback()) {

    var onItemClicked: (User) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder =
        UserViewHolder(
            ItemUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(getItem(position), onItemClicked)
    }

}

class UserViewHolder(private val binding: ItemUserBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(user: User, onItemClicked: (User) -> Unit) {
        binding.user = user
        binding.root.setOnClickListener {
            onItemClicked(user)
        }
        binding.executePendingBindings()
    }
}

private class UserDiffCallback : DiffUtil.ItemCallback<User>() {
    override fun areItemsTheSame(
        oldItem: User,
        newItem: User
    ): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(
        oldItem: User,
        newItem: User
    ): Boolean =
        oldItem.toString() == newItem.toString()

}