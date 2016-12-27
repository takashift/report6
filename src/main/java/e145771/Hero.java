package soft2.e145771;

/**
 * Created by Cokoten on 2016/11/15.
 */

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 */
public class Hero extends LivingThing {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。public class Hero extends LivingThing {

     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void attack(LivingThing opponent) {
        if (isDead())
            return;

        int damage = (int)(Math.random() * getAttack());

        if (damage == 0) {
            System.out.println(getName() + "の攻撃！,,,だが、" + opponent.getName() + "は攻撃を回避した！");
        }

        else if(Math.random() < 0.3) {
            System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！", getName(), opponent.getName(), damage);
            damage *= 2;
        }

        else
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！", getName(), opponent.getName(), damage);

        opponent.wounded(damage);
    }
}