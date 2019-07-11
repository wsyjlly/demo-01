package cn.wsyjlly.config;

/**
 * @author wsyjlly
 * @create 2019.06.22 - 14:39
 **/
public enum  GlobalVariableConfig {
    SERVER("http://47.102.210.175/"),
    HOST("47.102.210.175"),
    PORT("8080");
    
    private String globalVariable;

    GlobalVariableConfig(String globalVariable) {
          this.globalVariable = globalVariable;
    }

    public String getGlobalVariable() {
        return this.globalVariable;
    }
}
