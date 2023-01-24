public interface CH_Interface_Telephone {
    public void powerOn();
    public void dial(int phoneNumber);

    // Static method
    static boolean isPhoneTypeLG(String phoneType) {
        if (phoneType.equals("LG")) {
            return true;
        }
        return false;
    }

    //Default method
    default void printDescription(String name) {
        System.out.println("Phone name " + name);
    }
}


//class uPhone implements CH_Interface_Telephone {
//
//    @Override
//    public void powerOn() {
//        System.out.println("Power On");
//    }
//
//    @Override
//    public void dial(int phoneNumber) {
//        System.out.println(phoneNumber);
//    }
//
//    @Override
//    public void printDescription(String name) {
//        CH_Interface_Telephone.super.printDescription(name);
//    }
//
//    public static void main(String[] args) {
//        CH_Interface_Telephone u_phone = new Uphone();
//        Uphone u_phone2 = new Uphone();
//        CH_Interface_Telephone phone3 = new CH_Interface_Telephone() {
//            @Override
//            public void powerOn() {
//
//            }
//
//            @Override
//            public void dial(int phoneNumber) {
//
//            }
//        };
//
//        u_phone.dial(123);
//        u_phone2.dial(123);
//    }
//}