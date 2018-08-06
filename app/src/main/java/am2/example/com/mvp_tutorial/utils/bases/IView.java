package am2.example.com.mvp_tutorial.utils.bases;

import android.content.Context;

public interface IView<T> {

    Context getActivityContext();
    Context getAppContext();
}
