// Generated by view binder compiler. Do not edit!
package com.vungocminh.doanandroid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.vungocminh.doanandroid.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityShoppingCartBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView backButton;

  @NonNull
  public final BottomNavigationView bottomNavigation;

  @NonNull
  public final RecyclerView cartRecyclerView;

  @NonNull
  public final AppCompatButton checkoutButton;

  @NonNull
  public final LinearLayout padding;

  @NonNull
  public final TextView totalPrice;

  @NonNull
  public final LinearLayout totalPriceLayout;

  private ActivityShoppingCartBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView backButton, @NonNull BottomNavigationView bottomNavigation,
      @NonNull RecyclerView cartRecyclerView, @NonNull AppCompatButton checkoutButton,
      @NonNull LinearLayout padding, @NonNull TextView totalPrice,
      @NonNull LinearLayout totalPriceLayout) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.bottomNavigation = bottomNavigation;
    this.cartRecyclerView = cartRecyclerView;
    this.checkoutButton = checkoutButton;
    this.padding = padding;
    this.totalPrice = totalPrice;
    this.totalPriceLayout = totalPriceLayout;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityShoppingCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityShoppingCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_shopping_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityShoppingCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_button;
      ImageView backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.bottom_navigation;
      BottomNavigationView bottomNavigation = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigation == null) {
        break missingId;
      }

      id = R.id.cart_recycler_view;
      RecyclerView cartRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (cartRecyclerView == null) {
        break missingId;
      }

      id = R.id.checkout_button;
      AppCompatButton checkoutButton = ViewBindings.findChildViewById(rootView, id);
      if (checkoutButton == null) {
        break missingId;
      }

      id = R.id.padding;
      LinearLayout padding = ViewBindings.findChildViewById(rootView, id);
      if (padding == null) {
        break missingId;
      }

      id = R.id.total_price;
      TextView totalPrice = ViewBindings.findChildViewById(rootView, id);
      if (totalPrice == null) {
        break missingId;
      }

      id = R.id.total_price_layout;
      LinearLayout totalPriceLayout = ViewBindings.findChildViewById(rootView, id);
      if (totalPriceLayout == null) {
        break missingId;
      }

      return new ActivityShoppingCartBinding((RelativeLayout) rootView, backButton,
          bottomNavigation, cartRecyclerView, checkoutButton, padding, totalPrice,
          totalPriceLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
