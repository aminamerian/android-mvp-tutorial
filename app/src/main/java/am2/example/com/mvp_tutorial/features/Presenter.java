package am2.example.com.mvp_tutorial.features;

public class Presenter implements Contract.Presenter {

    private Contract.View viewLayer;
    private static final String TAG = "Presenter";

    public Presenter() {
    }

    @Override
    public void onViewAttached(Contract.View view) {
        viewLayer = view;
    }


    @Override
    public void buttonClicked(String text) {
        viewLayer.showToast(text);
    }
}
