package com.example.presentation_databinding.presentation.treeList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.presentation_databinding.MainActivity
import com.example.presentation_databinding.R
import com.example.presentation_databinding.databinding.FragmentListTreeBinding
import com.example.presentation_databinding.presentation.adapters.TreeAdapter


class ListTreeFragment : Fragment() {

    var treeAdapter2 :TreeAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val act = (activity as MainActivity)
        val binding : FragmentListTreeBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_list_tree,
            container,
            false)

        val view: View = binding.root
        val recyclerView : RecyclerView = binding.rvTree

        treeAdapter2 = act.vm.state.value?.let { TreeAdapter( it) }
        recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = treeAdapter2
        }

        act.vm.state.observe(viewLifecycleOwner){
            treeAdapter2?.submitList(it)
        }

        treeAdapter2?.onItemClick = { tree->
            act.vm.itemSelection(tree)
            act.onSelectedItem()
        }

        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (!recyclerView.canScrollVertically(1)) {
                    act.vm.getTrees()
                }
            }
        })

        return view
    }
}