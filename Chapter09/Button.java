package Chapter09;

public class Button {
    OnClickSListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }
    interface onClickListener {
        void onClick();
    }
}
