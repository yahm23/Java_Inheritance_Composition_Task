package Types;

public enum ArmourType {
        PLATE(30),
        CLOTH(1),
        CHAINMAIL(7),
        LEATHER(4);

        private int value;
        ArmourType(int value){
            this.value= value;
        }

        public int getValue() {
                return value;
        }
}
