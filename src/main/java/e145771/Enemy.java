package soft2.e145771;

/**
 * Created by Cokoten on 2016/11/15.
 */

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 */
public class Enemy extends LivingThing{
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void attack(LivingThing opponent) {
        if (isDead())
            return;

        int damage = (int)(Math.random() * getAttack());

        if(Math.random() < 0.2) {
            System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            damage *= 2;
        }

        else
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);

        opponent.wounded(damage);
    }
}
