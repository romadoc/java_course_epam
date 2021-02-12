package com.epam.modulefive.taskfour.menu;

import com.epam.utils.ScannerUtil;

public class Menu {

    public static int showMenuToChoose() {
        Headmenu all = Headmenu.ALL;
        Headmenu expensive = Headmenu.MAST_EXPENSIVE;
        Headmenu buy = Headmenu.BUY_TREASURE;
        System.out.println("*********************");
        System.out.println(all.getExplanation() + " "
                                                + expensive.getExplanation()
                                                + " "
                                                + buy.getExplanation());
        int choose = ScannerUtil.integerIn("what is you choose? type digit 1-3");
        int answer = 1;
        if (choose == 1 || choose == 2 || choose == 3) {
            answer = choose;
        }
       return answer;
    }
}
