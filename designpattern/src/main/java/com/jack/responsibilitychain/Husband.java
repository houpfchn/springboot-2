package com.jack.responsibilitychain;

/**
 * Created by jack on 2017/8/7.
 */
public class Husband extends Handler{

    /**
     * 丈夫只处理妻子的请求
     */
    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    /**
     * 丈夫请示的答复
     * @param women
     */
    @Override
    public void response(IWomen women) {
        System.out.println("---------女儿向丈夫请示----------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意\n");
    }
}
