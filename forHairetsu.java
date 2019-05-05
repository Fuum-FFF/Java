/*KAT-TUNの誰が退所したかしていないかを判別*/

public class forHairetsu{
    public static void main(String[] args){

	//KAT-TUNのメンバーを配列に入れる。         
        String[] kattun = new String[]{"亀梨和也","赤西仁","田中聖","田口淳之介","上田竜也","中丸雄一"};

	//現在の状態。
        String johnnys = "ジャニーズ事務所所属。";
        String taisyo = "退所済。";

	//対処しているか否か。
        for(int i = 0; i < kattun.length; i){
            if(i > 0 && i <= 3){
                System.out.println(kattun[i]  ":"  taisyo);
            }else{
                System.out.println(kattun[i]  "："  johnnys);
            }
        }
    }
}
