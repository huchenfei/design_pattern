package pattern.decorate;

/**
 * @author huchenfei
 * @version 1.0
 * @className FouthGradeSchoolReport
 * @description
 * @date 2019/3/7 18:37
 **/
public class FouthGradeSchoolReport extends AbstractSchoolReport {

    /**
     * 我的成绩单
     */
    @Override
    public void report() {
        //成绩单的格式是这个样子的
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }

    //家长签名
    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }

    @Override
    public void feedback(String content) {
        System.out.println("反馈意见为：" + content);
    }
}
