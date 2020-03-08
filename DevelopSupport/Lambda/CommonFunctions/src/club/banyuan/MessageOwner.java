package club.banyuan;

public class MessageOwner {

  public void addMessageListener(MessageListener listener) {

  }

  public static void main(String[] args) {
    MessageOwner messageOwner = new MessageOwner();

    messageOwner.addMessageListener(
        message -> System.out.println("收到消息:" + message)
    );

    MessageOwner messageOwner1 = test();
    Object o = test();
    Math o1 = test();

  }

  static <T> T test() {
    return (T) new MessageOwner();
  }
}