package basic.inspectionj;

class Result {
    private String id;//検査を受けた人のID
    private String name;//検査を受けた人の名前
    private String dateTime;//検査日時
    private double bT;//体温
    private int pulse;//脈拍
    private int sBP;//収縮期血圧
    private int dBP;//拡張期血圧

    public Result(String id, String name, String dateTime, double bT, int pulse, int sBP, int dBP) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.bT = bT;
        this.pulse = pulse;
        this.sBP = sBP;
        this.dBP = dBP;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public double getbT() {
        return bT;
    }

    public int getPulse() {
        return pulse;
    }

    public int getsBP() {
        return sBP;
    }

    public int getdBP() {
        return dBP;
    }

    /*
    平均血圧を求めるメソッド double getMBP()
    求める式 拡張期血圧＋（収縮期血圧-拡張期血圧）÷3
    小数点第二位を四捨五入
    */

    public double getMBP(){
        return dBP+(sBP-dBP)/3;
    }

    @Override
    public String toString() {
        return String.format("ID:%s 名前:%s 検査日時:%s 体温:%f 脈拍:%d 血圧（上）:%d 血圧（下）:%d 平均血圧:%.2f",
                        id,name,dateTime,bT,pulse,sBP,dBP,getMBP());
    }


}
