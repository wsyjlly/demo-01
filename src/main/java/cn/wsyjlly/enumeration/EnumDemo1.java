package cn.wsyjlly.enumeration;

/**
 * @author wsyjlly
 * @create 2019.06.11 - 13:53
 **/
public enum EnumDemo1 {
    VUE("L1"),REACT("L2"),ANGLAR("L3"),SPRINGBOOT("L4");
    private String value;
    EnumDemo1(String value) {
         this.value = value;
    }

    public String getValue() {
        return value;
    }
}
