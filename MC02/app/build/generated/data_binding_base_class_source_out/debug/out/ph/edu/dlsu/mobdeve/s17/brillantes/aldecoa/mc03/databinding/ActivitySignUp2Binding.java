// Generated by view binder compiler. Do not edit!
package ph.edu.dlsu.mobdeve.s17.brillantes.aldecoa.mc03.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ph.edu.dlsu.mobdeve.s17.brillantes.aldecoa.mc03.R;

public final class ActivitySignUp2Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnFinishSignup;

  @NonNull
  public final EditText etSUFirstName;

  @NonNull
  public final EditText etSULastName;

  private ActivitySignUp2Binding(@NonNull LinearLayout rootView, @NonNull Button btnFinishSignup,
      @NonNull EditText etSUFirstName, @NonNull EditText etSULastName) {
    this.rootView = rootView;
    this.btnFinishSignup = btnFinishSignup;
    this.etSUFirstName = etSUFirstName;
    this.etSULastName = etSULastName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUp2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUp2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up_2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUp2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_finish_signup;
      Button btnFinishSignup = rootView.findViewById(id);
      if (btnFinishSignup == null) {
        break missingId;
      }

      id = R.id.et_SU_FirstName;
      EditText etSUFirstName = rootView.findViewById(id);
      if (etSUFirstName == null) {
        break missingId;
      }

      id = R.id.et_SU_LastName;
      EditText etSULastName = rootView.findViewById(id);
      if (etSULastName == null) {
        break missingId;
      }

      return new ActivitySignUp2Binding((LinearLayout) rootView, btnFinishSignup, etSUFirstName,
          etSULastName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
