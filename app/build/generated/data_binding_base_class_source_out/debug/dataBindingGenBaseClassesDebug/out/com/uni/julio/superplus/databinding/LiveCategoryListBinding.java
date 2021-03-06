// Generated by data binding compiler. Do not edit!
package com.uni.julio.superplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.uni.julio.superplus.R;
import com.uni.julio.superplus.adapter.LiveCategoryAdapter;
import com.uni.julio.superplus.model.LiveTVCategory;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LiveCategoryListBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout channelTitle;

  @NonNull
  public final TextView channelTitleText;

  @NonNull
  public final LinearLayout flMainLayout;

  @NonNull
  public final LinearLayout nextProgram;

  @NonNull
  public final LinearLayout totalChannel;

  @NonNull
  public final TextView totalChannelText;

  @Bindable
  protected LiveTVCategory mLiveCategory;

  @Bindable
  protected LiveCategoryAdapter mLiveCategoryAdapter;

  protected LiveCategoryListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout channelTitle, TextView channelTitleText, LinearLayout flMainLayout,
      LinearLayout nextProgram, LinearLayout totalChannel, TextView totalChannelText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.channelTitle = channelTitle;
    this.channelTitleText = channelTitleText;
    this.flMainLayout = flMainLayout;
    this.nextProgram = nextProgram;
    this.totalChannel = totalChannel;
    this.totalChannelText = totalChannelText;
  }

  public abstract void setLiveCategory(@Nullable LiveTVCategory liveCategory);

  @Nullable
  public LiveTVCategory getLiveCategory() {
    return mLiveCategory;
  }

  public abstract void setLiveCategoryAdapter(@Nullable LiveCategoryAdapter liveCategoryAdapter);

  @Nullable
  public LiveCategoryAdapter getLiveCategoryAdapter() {
    return mLiveCategoryAdapter;
  }

  @NonNull
  public static LiveCategoryListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.live_category_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LiveCategoryListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LiveCategoryListBinding>inflateInternal(inflater, R.layout.live_category_list, root, attachToRoot, component);
  }

  @NonNull
  public static LiveCategoryListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.live_category_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LiveCategoryListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LiveCategoryListBinding>inflateInternal(inflater, R.layout.live_category_list, null, false, component);
  }

  public static LiveCategoryListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LiveCategoryListBinding bind(@NonNull View view, @Nullable Object component) {
    return (LiveCategoryListBinding)bind(component, view, R.layout.live_category_list);
  }
}
