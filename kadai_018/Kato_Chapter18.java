package kadai_018;

abstract public class Kato_Chapter18 {
	
     String familyName = "加藤";
     String givenName;
     String address = "東京都中野区〇×";
     
     //コンストラクタの作成
     public Kato_Chapter18(String givenName) {
         this.givenName = givenName;
     } 
     
	public void commonIntroduce(){
		System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
	}
	
	//抽象メソッドの作成
	abstract void eachIntroduce();
	
	public void execIntroduce(){
		 commonIntroduce();
	     eachIntroduce();
	}
}
