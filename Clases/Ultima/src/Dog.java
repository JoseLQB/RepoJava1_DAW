public class Dog{
      private String name;
      private String color;
      private Integer weight;
	  private Level levelCode;
      public enum Level {
         HIGH  (3),  //calls constructor with value 3
         MEDIUM(2),  //calls constructor with value 2
         LOW   (1)   //calls constructor with value 1
           ; // semicolon needed when fields / methods follow
      private final int levelCode;
      Level(int levelCode) {
        this.levelCode = levelCode;
      }
      public int getLevelCode() {
        return this.levelCode;
      }
     }
     public Dog (String s, Integer i, String c, Level level) {
         this.name = s;
         this.color = c;
         this.weight = i;
         this.levelCode = level;
      }
      public String getName() {
         return name;
      }
      public String getColor() {
         return color;
      }
      public Integer getWeight() {
         return weight;
      }
}