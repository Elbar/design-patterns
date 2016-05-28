package kg.vista.patterns.prototype;

/**
 * Created by fukuro on 5/28/16.
 */

class Cookie implements Cloneable {

    protected int weight;

    @Override
    public Cookie clone() throws  CloneNotSupportedException {
        Cookie copy = (Cookie) super.clone();

        return copy;
    }

}

class CoconutCookie extends Cookie {
}

public class CookieMachine {

    private Cookie cookie;

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException {
        return (Cookie) this.cookie.clone();
    }

    public static void main(String args[]) throws CloneNotSupportedException {
        Cookie tempCookie = null;
        Cookie prot = new CoconutCookie();
        CookieMachine cm = new CookieMachine(prot);
        for (int i = 0; i < 100; i++)
            tempCookie = cm.makeCookie();
    }
}

