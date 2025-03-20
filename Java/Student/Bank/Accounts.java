package Bank;

import java.util.HashMap;
import java.util.Map;

/**利用字典存储客户信息
 * 键为客户ID，值为客户对象
 */
public class Accounts {
    static Map<Long, Cust> accounts = new HashMap<>();

    static public void addAccount(Cust cust) {
        accounts.put(cust.ID, cust);
    }

    static public Cust getAccount(long ID) {
        return accounts.get(ID);
    }
}