package com.yeqifu.bravo1988.baseenhance;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 要求对数据进行处理，最终输出：
 * 梁山伯爱祝英台
 * 牛郎爱织女
 * 干将爱莫邪
 * 工藤新一爱毛利兰
 * 罗密欧爱朱丽叶
 *
 * @author: yeqifu
 * @date: 2023/2/14 11:50
 */
public class ListDemo {
    public static void main(String[] args) {
        // 老公组
        List<Couple> husbands = new ArrayList<>();
        husbands.add(new Couple(1, "梁山伯"));
        husbands.add(new Couple(2, "牛郎"));
        husbands.add(new Couple(3, "干将"));
        husbands.add(new Couple(4, "工藤新一"));
        husbands.add(new Couple(5, "罗密欧"));

        // 老婆组
        List<Couple> wives = new ArrayList<>();
        wives.add(new Couple(1, "祝英台"));
        wives.add(new Couple(2, "织女"));
        wives.add(new Couple(3, "莫邪"));
        wives.add(new Couple(4, "毛利兰"));
        wives.add(new Couple(5, "朱丽叶"));

        Instant start = Instant.now();

        // 使用map进行遍历的形式
        Map<Integer, Couple> wivesMap = wives.stream().collect(Collectors.toMap(Couple::getFamilyId, couple -> couple));
        for (Couple husband : husbands) {
            if (wivesMap.containsKey(husband.getFamilyId())) {
                System.out.println(husband.getUserName() + "爱" + wivesMap.get(husband.getFamilyId()).getUserName());
            }
        }

        // 两层for循环的形式
        /*for (Couple husband : husbands) {
            for (Couple wife : wives) {
                if (husband.getFamilyId().equals(wife.getFamilyId())) {
                    System.out.println(husband.getUserName() + "爱" + wife.getUserName());
                }
            }
        }*/

        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("耗时：" + timeElapsed);
    }
}
