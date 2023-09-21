package Chapter09;

public class Window {
    Button button1 = new Button();
    Button button2 = new Button();

    // 필드 초기값으로 대입
    Button.onClickListener listener = new Button.onClickListener() {
        @Override
        public void onClick() {
            System.out.println("메시지를 보냅니다.");
        }
    };
}
