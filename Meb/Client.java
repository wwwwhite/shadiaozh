package Meb;

public class Client {
public static void main(String[] args) 
{
	AbstractChatroom happyChat=new ChatGroup();
	Member member1,member2,member3,member4,member5,member6;
	member1=new DiamondMember("张三");
    member2=new  DiamondMember("李四");
    member3=new CommonMember("王五");
    member4=new CommonMember("小芳");
    member5=new CommonMember("小红");
    member6=new CommonMember("HW");
    
    happyChat.register(member1);
    happyChat.register(member2);
    happyChat.register(member3);
    happyChat.register(member4);
    happyChat.register(member5);
    happyChat.register(member6);
    
    member1.sendText("李四", "李四，你好！");
    member2.sendText("张三","我想打你");
    member3.sendText("张三", "我想打你");
    member4.sendText("HW", "我先打打打打si你");
}
}
