package com.example.presentation_databinding.databinding;
import com.example.presentation_databinding.R;
import com.example.presentation_databinding.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTreeItemFragmentBindingImpl extends FragmentTreeItemFragmentBinding implements com.example.presentation_databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView1;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTreeItemFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentTreeItemFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatButton) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.textView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.presentation_databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.main == variableId) {
            setMain((com.example.presentation_databinding.MainActivity) variable);
        }
        else if (BR.treeItem == variableId) {
            setTreeItem((com.example.presentation_databinding.presentation.treeList.TreesListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMain(@Nullable com.example.presentation_databinding.MainActivity Main) {
        this.mMain = Main;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.main);
        super.requestRebind();
    }
    public void setTreeItem(@Nullable com.example.presentation_databinding.presentation.treeList.TreesListViewModel TreeItem) {
        this.mTreeItem = TreeItem;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        java.lang.String treeItemSelectId = null;
        com.example.presentation_databinding.MainActivity main = mMain;
        java.lang.String javaLangStringCirconfRenceTreeItemSelectCirconferenceencm = null;
        java.lang.String javaLangStringHauteurTreeItemSelectHauteurenmJavaLangStringM = null;
        java.lang.String javaLangStringCirconfRenceTreeItemSelectCirconferenceencmJavaLangStringCm = null;
        com.example.domain.models.Tree treeItemSelect = null;
        java.lang.String javaLangStringEspCeTreeItemSelectEspece = null;
        java.lang.String javaLangStringHauteurTreeItemSelectHauteurenm = null;
        java.lang.String treeItemSelectAdresse = null;
        com.example.presentation_databinding.presentation.treeList.TreesListViewModel treeItem = mTreeItem;
        int treeItemSelectHauteurenm = 0;
        int treeItemSelectCirconferenceencm = 0;
        java.lang.String javaLangStringAdresseTreeItemSelectAdresse = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (treeItem != null) {
                    // read treeItem.select
                    treeItemSelect = treeItem.getSelect();
                }


                if (treeItemSelect != null) {
                    // read treeItem.select.espece
                    treeItemSelectEspece = treeItemSelect.getEspece();
                    // read treeItem.select.id
                    treeItemSelectId = treeItemSelect.getId();
                    // read treeItem.select.adresse
                    treeItemSelectAdresse = treeItemSelect.getAdresse();
                    // read treeItem.select.hauteurenm
                    treeItemSelectHauteurenm = treeItemSelect.getHauteurenm();
                    // read treeItem.select.circonferenceencm
                    treeItemSelectCirconferenceencm = treeItemSelect.getCirconferenceencm();
                }


                // read ("Espèce : ") + (treeItem.select.espece)
                javaLangStringEspCeTreeItemSelectEspece = ("Espèce : ") + (treeItemSelectEspece);
                // read ("Adresse : ") + (treeItem.select.adresse)
                javaLangStringAdresseTreeItemSelectAdresse = ("Adresse : ") + (treeItemSelectAdresse);
                // read ("Hauteur : ") + (treeItem.select.hauteurenm)
                javaLangStringHauteurTreeItemSelectHauteurenm = ("Hauteur : ") + (treeItemSelectHauteurenm);
                // read ("Circonférence : ") + (treeItem.select.circonferenceencm)
                javaLangStringCirconfRenceTreeItemSelectCirconferenceencm = ("Circonférence : ") + (treeItemSelectCirconferenceencm);


                // read (("Hauteur : ") + (treeItem.select.hauteurenm)) + ("m")
                javaLangStringHauteurTreeItemSelectHauteurenmJavaLangStringM = (javaLangStringHauteurTreeItemSelectHauteurenm) + ("m");
                // read (("Circonférence : ") + (treeItem.select.circonferenceencm)) + ("cm")
                javaLangStringCirconfRenceTreeItemSelectCirconferenceencmJavaLangStringCm = (javaLangStringCirconfRenceTreeItemSelectCirconferenceencm) + ("cm");
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, javaLangStringEspCeTreeItemSelectEspece);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, javaLangStringHauteurTreeItemSelectHauteurenmJavaLangStringM);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, javaLangStringCirconfRenceTreeItemSelectCirconferenceencmJavaLangStringCm);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, javaLangStringAdresseTreeItemSelectAdresse);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, treeItemSelectId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // main != null
        boolean mainJavaLangObjectNull = false;
        // main
        com.example.presentation_databinding.MainActivity main = mMain;



        mainJavaLangObjectNull = (main) != (null);
        if (mainJavaLangObjectNull) {


            main.backMenu();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): main
        flag 1 (0x2L): treeItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}