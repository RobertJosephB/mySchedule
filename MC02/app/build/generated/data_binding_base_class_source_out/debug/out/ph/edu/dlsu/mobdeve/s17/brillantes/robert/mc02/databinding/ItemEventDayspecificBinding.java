// Generated by view binder compiler. Do not edit!
package ph.edu.dlsu.mobdeve.s17.brillantes.robert.mc02.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ph.edu.dlsu.mobdeve.s17.brillantes.robert.mc02.R;

public final class ItemEventDayspecificBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout llEventClickable;

  @NonNull
  public final TextView tvDayName;

  @NonNull
  public final TextView tvDayNumber;

  @NonNull
  public final TextView tvDelete;

  @NonNull
  public final TextView tvEventTitle;

  @NonNull
  public final TextView tvTime;

  private ItemEventDayspecificBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout llEventClickable, @NonNull TextView tvDayName,
      @NonNull TextView tvDayNumber, @NonNull TextView tvDelete, @NonNull TextView tvEventTitle,
      @NonNull TextView tvTime) {
    this.rootView = rootView;
    this.llEventClickable = llEventClickable;
    this.tvDayName = tvDayName;
    this.tvDayNumber = tvDayNumber;
    this.tvDelete = tvDelete;
    this.tvEventTitle = tvEventTitle;
    this.tvTime = tvTime;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemEventDayspecificBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemEventDayspecificBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_event_dayspecific, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemEventDayspecificBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ll_eventClickable;
      LinearLayout llEventClickable = rootView.findViewById(id);
      if (llEventClickable == null) {
        break missingId;
      }

      id = R.id.tv_dayName;
      TextView tvDayName = rootView.findViewById(id);
      if (tvDayName == null) {
        break missingId;
      }

      id = R.id.tv_dayNumber;
      TextView tvDayNumber = rootView.findViewById(id);
      if (tvDayNumber == null) {
        break missingId;
      }

      id = R.id.tv_delete;
      TextView tvDelete = rootView.findViewById(id);
      if (tvDelete == null) {
        break missingId;
      }

      id = R.id.tv_eventTitle;
      TextView tvEventTitle = rootView.findViewById(id);
      if (tvEventTitle == null) {
        break missingId;
      }

      id = R.id.tv_time;
      TextView tvTime = rootView.findViewById(id);
      if (tvTime == null) {
        break missingId;
      }

      return new ItemEventDayspecificBinding((LinearLayout) rootView, llEventClickable, tvDayName,
          tvDayNumber, tvDelete, tvEventTitle, tvTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}