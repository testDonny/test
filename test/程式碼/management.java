package test;

public class management {

    private static int myCrad[] = new int[5];
    private static int UR = 1;
    private static int SSR = 5;
    private static int SR = 20;
    private static int R = 80;
    private static int N = 94;
    static private int diamond;
    private static int consumption;
    private int Draw_once;
    private int Draw_ten;
//    private String user;
//    private String password;
    private int Random;
    private int one;
    private int ten[] = new int[10];

    public management(int UR, int SSR, int SR, int R, int N) {
        this.UR = UR;
        this.SSR = SSR;
        this.SR = SR;
        this.R = R;
        this.N = N;
    }
/**
 * 抽一次80點
 * @return 
 */
    public int getDraw_once() {
        Draw_once=80;
        return Draw_once;
    }

    public void setDraw_once(int Draw_once) {
        this.Draw_once = Draw_once;
    }
    /**
     * 抽10次680
     * @return 
     */

    public int getDraw_ten() {
        Draw_ten=680;
        return Draw_ten;
    }

    public void setDraw_ten(int Draw_ten) {
        this.Draw_ten = Draw_ten;
    }
    /**
     * 顯示你消耗多少鑽石
     * @return 
     */    
    public static int getConsumption() {
        return consumption;
    }
    /**
     * 累積的消費
     * 增加你消耗掉的鑽石
     * @param consumption 
     */
    

    public static void setConsumption(int consumption) {
        management.consumption += consumption;
    }
    /**
     * 我擁有的卡片
     * @return 
     */

    public static int[] getMyCrad() {
        return myCrad;
    }
    /**
     * 抽卡片機率
     * @return 
     */

    public int getRandom() {
        Random = (int) (Math.random() * 99.999999 + 1);
        return Random;
    }
    /**
     * 抽10次的陣列
     * @return 
     */

    public int[] getTen() {
        return ten;
    }
    /**
     * 儲值鑽石
     * @param diamond 
     */

    public static void setDiamond(int diamond) {
        management.diamond += diamond;
    }
    /**
     * 抽一次產生一個亂數
     * @return 
     */

    public int getOne() {
        one = getRandom();
        return one;
    }
    /**
     * 刷新卡池用
     * @param UR 
     */
    
    public static void setUR(int UR) {
        UR=1;
        management.UR = UR;
    }
    /**
     * 刷新卡池用
     * @param SSR 
     */

    public static void setSSR(int SSR) {
        SSR=5;
        management.SSR = SSR;
    }
    /**
     * 刷新卡池用
     * @param SR 
     */

    public static void setSR(int SR) {
        SR=20;
        management.SR = SR;
    }
    /**
     * 刷新卡池用
     * @param R 
     */

    public static void setR(int R) {
        R=80;
        management.R = R;
    }
    /**
     * 刷新卡池用
     * @param N 
     */

    public static void setN(int N) {
        N=94;
        management.N = N;
    }
/**
 * 知道現在剩幾張
 * @return 
 */
    public static int getUR() {
        return UR;
    }
/**
 * 知道現在剩幾張
 * @return 
 */
    public static int getSSR() {
        return SSR;
    }
/**
 * 知道現在剩幾張
 * @return 
 */
    public static int getSR() {
        return SR;
    }
/**
 * 知道現在剩幾張
 * @return 
 */
    public static int getR() {
        return R;
    }
/**
 * 知道現在剩幾張
 * @return 
 */
    public static int getN() {
        return N;
    }
/**
 * 知道你現在有多少鑽石
 * @return 
 */
    public static int getDiamond() {
        return diamond;
    }
//    public String getUser() {
//        return user;
//    }
//    public String getPassword() {
//        return password;
//    }
/**
 * 判斷亂數抽到什麼不重複
 * @param one
 * @return 
 */
    
    public String test(int one) {
        String a = "";
        if (one == 1) {
            if (UR == 0) {
                one = getRandom();
                System.out.println(one);
                return test(one);
            } else {
                System.out.println(one);
                UR -= 1;
                myCrad[0] += 1;
                a += "抽到UR卡\n";
            }
        } else if (one > 1 && one <= 6) {
            if (SSR == 0) {
                one = getRandom();
                System.out.println(one);
                return test(one);
            } else {
                System.out.println(one);
                SSR -= 1;
                myCrad[1] += 1;
                a += "抽到SSR卡\n";
            }
        } else if (one > 6 && one <= 16) {
            if (SR == 0) {
                one = getRandom();
                System.out.println(one);
                return test(one);
            } else {
                System.out.println(one);
                SR -= 1;
                myCrad[2] += 1;
                a += "抽到SR卡\n";
            }
        } else if (one > 16 && one <= 40) {
            if (R == 0) {
                one = getRandom();
                System.out.println(one);
                return test(one);
            } else {
                System.out.println(one);
                R -= 1;
                myCrad[3] += 1;
                a += "抽到R卡\n";
            }
        } else {
            if (N == 0) {
                one = getRandom();
                System.out.println(one);
                return test(one);
            } else {
                System.out.println(one);
                N -= 1;
                myCrad[4] += 1;
                a += "抽到N卡\n";
            }
        }
        return a;
    }

    public String test1(int UR, int SSR, int SR, int R, int N) {

        return ("您擁有的UR卡:\t" + UR + "\n您擁有的SSR卡:\t" + SSR
                + "\n您擁有的SR卡:\t" + SR + "\n您擁有的R卡:\t" + R + "\n您擁有的N卡:\t" + N);
    }

    public String test2(int UR, int SSR, int SR, int R, int N) {

        return "UR卡剩餘:\t" + UR + "\nSSR卡剩餘:\t"
                + SSR + "\nSR卡剩餘:\t" + SR + "\nR卡剩餘:   \t" + R
                + "\nN卡剩餘:   \t" + N;
    }

}
