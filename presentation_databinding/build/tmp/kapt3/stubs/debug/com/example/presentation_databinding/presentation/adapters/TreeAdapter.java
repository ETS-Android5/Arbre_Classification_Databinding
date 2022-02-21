package com.example.presentation_databinding.presentation.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0018\u00010\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0017\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u000b2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0017J\u0014\u0010\u0019\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/presentation_databinding/presentation/adapters/TreeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/presentation_databinding/presentation/adapters/TreeAdapter$TreeViewHolder;", "data", "", "Lcom/example/domain/models/Tree;", "(Ljava/util/List;)V", "mData", "", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "newData", "TreeViewHolder", "presentation_databinding_debug"})
public final class TreeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.presentation_databinding.presentation.adapters.TreeAdapter.TreeViewHolder> {
    private final java.util.List<com.example.domain.models.Tree> mData = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.example.domain.models.Tree, kotlin.Unit> onItemClick;
    
    public TreeAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.domain.models.Tree> data) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.example.domain.models.Tree, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.domain.models.Tree, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    @java.lang.Override()
    public com.example.presentation_databinding.presentation.adapters.TreeAdapter.TreeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.presentation_databinding.presentation.adapters.TreeAdapter.TreeViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.domain.models.Tree> newData) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/presentation_databinding/presentation/adapters/TreeAdapter$TreeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "treeItemBinding", "Lcom/example/presentation_databinding/databinding/TreeItemBinding;", "(Lcom/example/presentation_databinding/presentation/adapters/TreeAdapter;Lcom/example/presentation_databinding/databinding/TreeItemBinding;)V", "treeItem", "getTreeItem", "()Lcom/example/presentation_databinding/databinding/TreeItemBinding;", "setTreeItem", "(Lcom/example/presentation_databinding/databinding/TreeItemBinding;)V", "presentation_databinding_debug"})
    public final class TreeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.presentation_databinding.databinding.TreeItemBinding treeItem;
        
        public TreeViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.presentation_databinding.databinding.TreeItemBinding treeItemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.presentation_databinding.databinding.TreeItemBinding getTreeItem() {
            return null;
        }
        
        public final void setTreeItem(@org.jetbrains.annotations.NotNull()
        com.example.presentation_databinding.databinding.TreeItemBinding p0) {
        }
    }
}