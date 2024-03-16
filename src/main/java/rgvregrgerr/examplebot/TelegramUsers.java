package rgvregrgerr.examplebot;

public class TelegramUsers {
    private long chatid;
    private String step;
    private String msg;
    private String fullname;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public TelegramUsers() {
    }

    public TelegramUsers(long chatid, String step, String msg, String fullname) {
        this.chatid = chatid;
        this.step = step;
        this.msg = msg;
        this.fullname=fullname;
    }

    public long getChatid() {
        return chatid;
    }

    public void setChatid(long chatid) {
        this.chatid = chatid;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    @Override
    public String toString() {
        return "TelegramUsers{" +
                "chatid=" + chatid +
                ", step='" + step + '\'' +
                ", msg='" + msg + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
