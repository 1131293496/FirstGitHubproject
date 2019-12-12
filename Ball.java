import java.util.Scanner;

public class Ball {

    /*
     * 判断八个小球中哪个小球不合格？
     * 1.八个小球判断三次
     * 2.天平称
     * 3.记录轻重
     * 4.第一次称方法：拿1，2，3号球跟4，5，6号球比，剩下2个球先放下
     *        第一次分三种情况：第一种左边重，右边轻，说明7，8号球是正常的
     *                       第二种左边轻，右边中，说明7，8号球正常的
     *                       第三种天平平齐，7，8号球不正常
     *   第二次称方法：拿1，7，8和2，3，4球比
     *        第二次依次判断：若1左重：则是2，3里面有轻的或4是重的
     *                     若2右重：则是1是轻的或4是重的
     *                     若3平齐：则是5，6里面有一个重的
     *   第三次分情况：左重拿除2，3号球以外的球跟其中一个比
     *               右重拿除1，4号球以外的球跟其中一个比
     *               平齐拿除5，6，号球以外的球跟其中一个比
     * */
    private int num = 8;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 第一次称量
        System.out.println("现在有八个球，请记住不合格的球，我们将询问两次后判断出质量不合格的球，所用工具是天平.");
        System.out.println("第一次称量：拿1，2，3号球和4，5，6号球进行比较");
        System.out.print("请输入天平的倾斜方向【0左/1右/2平齐】：");
        int first = input.nextInt();
        switch (first) {
            case 0:
                System.out.println("第二次称量：拿1,7,8和2,3,4号球进行比较");
                System.out.print("请输入天平的倾斜方向【0左/1右/2平齐】：");
                int o = input.nextInt();
                Zero(o);
                System.out.println("程序结束！");
                break;
            case 1:
                System.out.println("第二次称量：拿1,7,8和2,3,4号球进行比较");
                System.out.print("请输入天平的倾斜方向【0左/1右/2平齐】：");
                int l = input.nextInt();
                First(l);
                System.out.println("程序结束！");
                break;
            case 2:
                System.out.println("第二次称量：拿7和8号球进行比较");
                System.out.print("请输入天平的倾斜方向【0左/1右/】：");
                int z = input.nextInt();
                Second(z);
                System.out.println("程序结束！");
                break;
        }
    }

    private static void Zero(int z) {
        Scanner input = new Scanner(System.in);
        switch (z){
            case 0:
                System.out.println("第三次称量：拿1和8号球进行比较");
                System.out.print("请输入天平的倾斜方向【0左/2平齐】：");
                int o = input.nextInt();
                if(o == 0){
                    System.out.println("判断出1号球质量过重！");
                }
                if(o == 2){
                    System.out.println("判断出4号球质量过轻！");
                }
                break;
            case 1:
                System.out.println("第三次称量：拿2和3号球进行比较");
                System.out.print("请输入天平的倾斜方向【0左/1右/】：");
                int l = input.nextInt();
                if(l == 0){
                    System.out.println("判断出2号球质量过重！");
                }
                if(l == 1){
                    System.out.println("判断出3号球质量过重！");
                }
                break;
            case 2:
                System.out.println("第三次称量：拿5和6号球进行比较");
                System.out.print("请输入天平的倾斜方向【0左/1右/】：");
                int zz = input.nextInt();
                if(zz == 0) {
                    System.out.println("判断出6号球质量过轻！");
                }
                if(zz == 1){
                    System.out.println("判断出5号球质量过轻");
                }
                break;
        }
    }

    private static void First(int l) {
        Scanner input = new Scanner(System.in);
        switch (l){
            case 0:
            System.out.println("第三次称量：拿2和3号球进行比较");
            System.out.print("请输入天平的倾斜方向【0左/1右/】：");
            int o = input.nextInt();
            if(o == 0){
                System.out.println("判断出3号球过轻！");
            }
            if(o == 1){
                System.out.println("判断出2号球过轻！");
            }
            break;
            case 1:
                System.out.println("第三次称量：拿1和8号球进行比较");
                System.out.print("请输入天平的倾斜方向【0左/2平齐】：");
                int ll = input.nextInt();
                if(ll == 1){
                    System.out.println("判断出1号球过轻！");
                }
                if(ll == 2){
                    System.out.println("判断出4号球过重！");
                }
                break;
            case 2:
                System.out.println("第三次称量：拿5和6号球进行比较");
                System.out.print("请输入天平的倾斜方向【0左/1右/】：");
                int z = input.nextInt();
                if(z == 0){
                    System.out.println("判断出5号球过重！");
                }
                if(z == 1){
                    System.out.println("判断出6号球过重！");
                }
                break;

        }
    }

    private static void Second(int z) {
        Scanner input = new Scanner(System.in);
        switch (z){
            case 0:
                System.out.println("第三次称量：拿1和7号球进行比较");
                System.out.print("请输入天平的倾斜方向【1右/2平齐】：");
                int zz = input.nextInt();
                if(zz == 1){
                    System.out.println("判断出7号球过重！");
                }
                if(zz == 2){
                    System.out.println("判断出8号球过轻！");
                }
                break;
            case 1:
                System.out.println("第三次称量：拿1和8号球进行比较");
                System.out.print("请输入天平的倾斜方向【1右/2平齐】：");
                int l = input.nextInt();
                if(l == 1){
                    System.out.println("判断出8号球过重！");
                }
                if(l == 2){
                    System.out.println("判断出7号球过轻！");
                }
               break;
        }
    }
}
