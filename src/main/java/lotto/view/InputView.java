package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String PURCHASE_AMOUNT_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String WINNING_NUMBERS_MESSAGE = "당첨 번호를 입력해 주세요.";
    private static final String BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";

    public static int getPurchaseAmount() {
        promptPurchaseAmount();
        return Integer.parseInt(Console.readLine());
    }

    public static String getWinningNumbers() {
        promptWinningNumbers();
        return Console.readLine();
    }

    private static void promptPurchaseAmount() {
        System.out.println(PURCHASE_AMOUNT_MESSAGE);
    }

    private static void promptWinningNumbers() {
        System.out.println(WINNING_NUMBERS_MESSAGE);
    }

}
