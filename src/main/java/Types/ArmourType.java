package Types;

public enum ArmourType {
        PLATE(10),
        CLOTH(1),
        CHAINMAIL(7),
        LEATHER(4);

        private int value;
        ArmourType(int value){
            this.value= value;
        }
}
