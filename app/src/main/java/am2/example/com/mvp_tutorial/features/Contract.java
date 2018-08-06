package am2.example.com.mvp_tutorial.features;

import am2.example.com.mvp_tutorial.utils.bases.IPresenter;
import am2.example.com.mvp_tutorial.utils.bases.IView;

/**
 * Created by Amin on 06/08/2018.
 */
public interface Contract {
    interface View extends IView<Presenter> {
        void showToast(String text);
    }

    interface Presenter extends IPresenter<View> {
        void buttonClicked(String text);
    }
}
