public class Message {
    private String msgText;

    public Message(String msgName){
        this.msgText = msgName;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }


    static Message intro = new Message("Blacky just woke up on the bed and is hungry. Kenny and Jing are asleep");
    static Message menuOne = new Message("========M E N U========");
    static Message menuText = new Message("What to do?");
    static Message blackie = new Message(" /\\_/\\\n( o.o )\n > ^ <");
    static Message jingAnnoy = new Message ("小黑烦死了！Jing goes back to sleep");
    static Message jingPunish = new Message("卧槽！好你竟敢在床上大便！这两个星期别想吃tuna了！");
    static Message meow = new Message("Meow");
    static Message openDoor = new Message("Jing's awake, opens door,");
    static Message nextLevel = new Message("Next Level begins.......");



//    public static void main(String[] args) {
//        Message JingScream = new Message("Stop Black!");
//        System.out.println(JingScream.msgText);
//        System.out.print(" /\\_/\\\n( o.o )\n > ^ <");
//
//    }
}


