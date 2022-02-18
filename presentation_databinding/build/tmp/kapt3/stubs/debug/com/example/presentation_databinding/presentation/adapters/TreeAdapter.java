package com.example.presentation_databinding.presentation.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\u001f\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0014\u0010\u001d\u001a\u00020\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/example/presentation_databinding/presentation/adapters/TreeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/presentation_databinding/presentation/adapters/TreeAdapter$ViewHolder;", "context", "Landroid/content/Context;", "data", "", "Lcom/example/domain/models/Tree;", "(Landroid/content/Context;Ljava/util/List;)V", "mData", "", "mInflater", "Landroid/view/LayoutInflater;", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "newData", "ViewHolder", "presentation_databinding_debug"})
public final class TreeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.presentation_databinding.presentation.adapters.TreeAdapter.ViewHolder> {
    private final java.util.List<com.example.domain.models.Tree> mData = null;
    private final android.view.LayoutInflater mInflater = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.example.domain.models.Tree, kotlin.Unit> onItemClick;
    
    public TreeAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
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
    @java.lang.Override()
    public com.example.presentation_databinding.presentation.adapters.TreeAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.presentation_databinding.presentation.adapters.TreeAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.domain.models.Tree> newData) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/presentation_databinding/presentation/adapters/TreeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/presentation_databinding/presentation/adapters/TreeAdapter;Landroid/view/View;)V", "myTextView", "Landroid/widget/TextView;", "getMyTextView", "()Landroid/widget/TextView;", "setMyTextView", "(Landroid/widget/TextView;)V", "presentation_databinding_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView myTextView;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMyTextView() {
            return null;
        }
        
        public final void setMyTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}