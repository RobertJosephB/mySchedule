// Generated by view binder compiler. Do not edit!
package ph.edu.dlsu.mobdeve.s17.brillantes.robert.mc02.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ph.edu.dlsu.mobdeve.s17.brillantes.robert.mc02.R;

public final class ActivityLogInBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView btnGoToSignUp;

  @NonNull
  public final Button btnLogIn;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etPassword;

  private ActivityLogInBinding(@NonNull LinearLayout rootView, @NonNull TextView btnGoToSignUp,
      @NonNull Button btnLogIn, @NonNull EditText etEmail, @NonNull EditText etPassword) {
    this.rootView = rootView;
    this.btnGoToSignUp = btnGoToSignUp;
    this.btnLogIn = btnLogIn;
    this.etEmail = etEmail;
    this.etPassword = etPassword;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLogInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLogInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_log_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLogInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_goToSignUp;
      TextView btnGoToSignUp = rootView.findViewById(id);
      if (btnGoToSignUp == null) {
        break missingId;
      }

      id = R.id.btn_logIn;
      Button btnLogIn = rootView.findViewById(id);
      if (btnLogIn == null) {
        break missingId;
      }

      id = R.id.et_email;
      EditText etEmail = rootView.findViewById(id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_password;
      EditText etPassword = rootView.findViewById(id);
      if (etPassword == null) {
        break missingId;
      }

      return new ActivityLogInBinding((LinearLayout) rootView, btnGoToSignUp, btnLogIn, etEmail,
          etPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
