package com.example.presentation_databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.presentation_databinding.presentation.treeItem.TreeItemFragment
import com.example.presentation_databinding.presentation.treeList.ListTreeFragment
import com.example.presentation_databinding.presentation.treeList.TreesListViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var vm: TreesListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm = ViewModelProvider(this)[TreesListViewModel::class.java]

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.main_frag, ListTreeFragment())
            commit()
        }
    }

    fun onSelectedItem() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.main_frag, TreeItemFragment())
            commit()
        }
    }

    fun backMenu() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.main_frag, ListTreeFragment())
            commit()
        }
    }
}