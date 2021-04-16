public class Hero {
  String name;
  int hp;
  Sword sword;
  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("的に5ポイントのダメージを与えた！");
    System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
  }
  public Hero(String name) {    //コンストラクタ①
    this.hp = 100;
    this.name = name;   //引数の値でnameフィールドを初期化
  }
  public Hero() {   //コンストラクタ②
    this("ダミー");
  }
}
