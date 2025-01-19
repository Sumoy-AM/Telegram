package com.example.telegram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class ChatAdapter(private val chatList: List<Chat>) : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val chat = chatList[position]
        val chatImage = holder.itemView.findViewById<CircleImageView>(R.id.chatImage)
        chatImage.setImageResource(chat.imageResId)  // Establece la imagen de forma circular
        holder.itemView.findViewById<TextView>(R.id.chatName).text = chat.name
        holder.itemView.findViewById<TextView>(R.id.chatMessage).text = chat.message
        // Establecer la fecha en la esquina derecha
        holder.itemView.findViewById<TextView>(R.id.chatDate).text = chat.date
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}


