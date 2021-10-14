package sample.enumsample;

 class Human {//パブリックにすると衝突するのでパッケージプライベート
     private String name;
     private Gender gender; //性別がストリング型ではない
     private int age;

     public Human(String name, Gender gender, int age) {
         this.name = name;
         this.gender = gender;
         this.age = age;
     }

     @Override
     public String toString() {
         return "Human{" +
                 "name='" + name + '\'' +
                 ", gender=" + gender.getJpName() +
                 //.jpNameにすることで日本語名が取れるgenderのフィールドにはmenかwomenしか入らない。
                 //一度変更するとそれしか入らない特殊なクラス。
                 ", age=" + age +
                 '}';
     }
 }
