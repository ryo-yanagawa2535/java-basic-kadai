package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    public KatoIchiro_Chapter18() {
        super("一郎"); // 親クラスのコンストラクタを呼び出す
    }

    @Override
    //抽象メソッドに具体的な処理を記述	する
    void eachIntroduce() {
        System.out.println("私はPythonが得意です");
    }

}