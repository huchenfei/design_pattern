package pattern.mediator;

/**
 * @className Purchase
 * @description
 * @author huchenfei
 * @date 2019/3/6 16:21
 * @version 1.0
 **/
public class Purchase {

    // 采购IBM电脑
    public void buyIBMcomputer(int number) {
        // 访问库存
        Stock stock = new Stock();
        // 访问销售
        Sale sale = new Sale();
        // 电脑的销售情况
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80) {
            // 销售情况良好
            System.out.println("采购IBM电脑:" + number + "台");
            stock.increase(number);
        } else {
            // 销售情况不好, 折半采购
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑：" + buyNumber + "台");
            stock.increase(buyNumber);
        }
    }

    // 不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
