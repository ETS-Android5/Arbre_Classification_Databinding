package com.example.presentation_databinding.presentation.treeList;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\bR(\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000b0\u000b0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00130\u00130\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0014\u0010\u000fR(\u0010\u0015\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00130\u00130\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006\'"}, d2 = {"Lcom/example/presentation_databinding/presentation/treeList/TreesListViewModel;", "Landroidx/lifecycle/ViewModel;", "getTreesUseCase", "Lcom/example/domain/useCase/treesListUseCase/GetTreesUseCase;", "(Lcom/example/domain/useCase/treesListUseCase/GetTreesUseCase;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/domain/models/Tree;", "kotlin.jvm.PlatformType", "error", "", "getError", "()Landroidx/lifecycle/MutableLiveData;", "setError", "(Landroidx/lifecycle/MutableLiveData;)V", "index", "", "isLoading", "", "setLoading", "lastTree", "getLastTree", "setLastTree", "select", "getSelect", "()Lcom/example/domain/models/Tree;", "setSelect", "(Lcom/example/domain/models/Tree;)V", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "setState", "(Landroidx/lifecycle/LiveData;)V", "getTrees", "", "itemSelection", "tree", "presentation_databinding_debug"})
public final class TreesListViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.domain.useCase.treesListUseCase.GetTreesUseCase getTreesUseCase = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.domain.models.Tree>> _state = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.domain.models.Tree>> state;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> error;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> lastTree;
    private int index = 0;
    @org.jetbrains.annotations.NotNull()
    private com.example.domain.models.Tree select;
    
    @javax.inject.Inject()
    public TreesListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.domain.useCase.treesListUseCase.GetTreesUseCase getTreesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.domain.models.Tree>> getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.domain.models.Tree>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLastTree() {
        return null;
    }
    
    public final void setLastTree(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.models.Tree getSelect() {
        return null;
    }
    
    public final void setSelect(@org.jetbrains.annotations.NotNull()
    com.example.domain.models.Tree p0) {
    }
    
    public final void getTrees() {
    }
    
    public final void itemSelection(@org.jetbrains.annotations.NotNull()
    com.example.domain.models.Tree tree) {
    }
}