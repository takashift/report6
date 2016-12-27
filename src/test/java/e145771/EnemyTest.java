package soft2.e145771;

import static org.junit.Assert.*;


/**
 * Created by Cokoten on 2016/11/24.
 */
public class EnemyTest {

    /**
     * 「死んでる状態では攻撃できない」ことを確認。
     * @throws Exception
     */
    @org.junit.Test
    public void attack() throws Exception {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.setDead(true);
        for(int i=0; i<10; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero.getHitPoint());
    }

}