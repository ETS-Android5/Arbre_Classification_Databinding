package com.example.presentation_databinding;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.presentation_databinding.databinding.FragmentListTreeBindingImpl;
import com.example.presentation_databinding.databinding.FragmentTreeItemFragmentBindingImpl;
import com.example.presentation_databinding.databinding.TreeItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTLISTTREE = 1;

  private static final int LAYOUT_FRAGMENTTREEITEMFRAGMENT = 2;

  private static final int LAYOUT_TREEITEM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.presentation_databinding.R.layout.fragment_list_tree, LAYOUT_FRAGMENTLISTTREE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.presentation_databinding.R.layout.fragment_tree_item_fragment, LAYOUT_FRAGMENTTREEITEMFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.presentation_databinding.R.layout.tree_item, LAYOUT_TREEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTLISTTREE: {
          if ("layout/fragment_list_tree_0".equals(tag)) {
            return new FragmentListTreeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list_tree is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTREEITEMFRAGMENT: {
          if ("layout/fragment_tree_item_fragment_0".equals(tag)) {
            return new FragmentTreeItemFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tree_item_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_TREEITEM: {
          if ("layout/tree_item_0".equals(tag)) {
            return new TreeItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tree_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "main");
      sKeys.put(2, "treeItem");
      sKeys.put(3, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_list_tree_0", com.example.presentation_databinding.R.layout.fragment_list_tree);
      sKeys.put("layout/fragment_tree_item_fragment_0", com.example.presentation_databinding.R.layout.fragment_tree_item_fragment);
      sKeys.put("layout/tree_item_0", com.example.presentation_databinding.R.layout.tree_item);
    }
  }
}
