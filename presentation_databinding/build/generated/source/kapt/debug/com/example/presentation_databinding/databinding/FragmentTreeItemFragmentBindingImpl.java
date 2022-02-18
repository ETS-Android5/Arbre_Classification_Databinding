package com.example.presentation_databinding.databinding;
import com.example.presentation_databinding.R;
import com.example.presentation_databinding.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTreeItemFragmentBindingImpl extends FragmentTreeItemFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTreeItemFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentTreeItemFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.treeItemId.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.treeItem == variableId) {
            setTreeItem((com.example.presentation_databinding.presentation.treeList.TreesListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTreeItem(@Nullable com.example.presentation_databinding.presentation.treeList.TreesListViewModel TreeItem) {
        this.mTreeItem = TreeItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.treeItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String treeItemSelectEspece = null;
        com.example.domain.models.Tree treeItemSelect = null;
        com.example.presentation_databinding.presentation.treeList.TreesListViewModel treeItem = mTreeItem;

        if ((dirtyFlags & 0x3L) != 0) {



                if (treeItem != null) {
                    // read treeItem.select
                    treeItemSelect = treeItem.getSelect();
                }


                if (treeItemSelect != null) {
                    // read treeItem.select.espece
                    treeItemSelectEspece = treeItemSelect.getEspece();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.treeItemId, treeItemSelectEspece);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): treeItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}